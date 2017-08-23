package com.wm;

public class WMIMSdk
{
	//基本消息回调
	public interface OnSvrMsgCallBackListen
	{
		void OnSvrMsgCallBack(int nMsgId, String jsonStr, int jsonStrLen);
	}
	
	//群组消息回调
	public interface OnGroupMsgCallBackListen
	{
		void OnGroupMsgCallBack(int nMsgId, String jsonStr, int jsonStrLen);
	}
	
	//登录结果回调
	public interface OnRegisterMsgCallBackListen
	{
		//jsonStr为注册结果,格式为: {"result", "syncuser":[{"id", "maccode"}], "syncgroup":[{"id", "name", "owner", "createtime", "reserved1", "reserved2", "reserved3", "reserved4", "member":[{"id"}]}]}
		
		void OnRegisterMsgCallBack(String jsonStr, int jsonStrLen);
	}
	
	//通话消息回调
	public interface OnChatMsgCallBackListen
	{
		void OnChatMsgCallBack(int nMsgId, String jsonStr, int jsonStrLen);
	}

    private static WMIMSdk m_sdkinstance = new WMIMSdk();
    
    private IM m_engineer = new IM();
    
    public static WMIMSdk getInstance()
    {
        return m_sdkinstance;
    }
    
    /*
	 * 功能：初始化，调用所有接口之前调用（日志的初始化、资源的申请）
	 * 参数：
	 *			svrIp		[IN]: ip
	 *			svrPort		[IN]: port
	 *			nLogLevel	[IN]: 日志等级
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int Init(String svrIp, int svrPort, int nLogLevel)
	{
		return m_engineer.Init(svrIp, svrPort, nLogLevel);
	}

	/*
	 * 功能：析构（释放Init申请的资源、日志的反初始化）
	 * 参数：无
	 * 返回值： 无
	*/
	public int Uninit()
	{
		return m_engineer.Uninit();
	}


	/*
	 * 功能：向服务器注册（异步）
	 * 参数：
	 *			nUserId			[IN]: 用户ID
	 *			pszSignature	[IN]: 签名(长度待定)
	 *			pszMacCode		[IN]: 机器码(长度待定)
	 *          OnSvrMsgCallBackListen  [IN]: 基本消息回调
	 *          OnGroupMsgCallBackListen  [IN]: 群组消息回调
	 *          OnRegisterMsgCallBackListen  [IN]: 登录结果回调
	 *          OnChatMsgCallBackListen  [IN]: 通话消息回调
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int Register(int nUserId, String strSignature, String strMacCode, 
			OnSvrMsgCallBackListen svrMsgcallBack, 
			OnGroupMsgCallBackListen groupMsgCallBack, 
			OnRegisterMsgCallBackListen registerMsgcallBack, 
			OnChatMsgCallBackListen chatMsgCallBack)
								 {
		return m_engineer.Register(nUserId, strSignature, strMacCode, svrMsgcallBack, groupMsgCallBack, registerMsgcallBack, chatMsgCallBack);
								 }
		
	/*
	 * 功能：注销
	 * 参数：
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int UnRegister()
	{
		return m_engineer.UnRegister();
	}

	/*
	* 功能：创建群组（同步）
	* 参数：
	*			pGroupName	[IN]: 组信息
	* 返回值： -1-失败，其他作为组ID
	*/
	public int GroupCreat(String strGroupName)
	{
		return m_engineer.GroupCreat(strGroupName);
	}

	/*
	* 功能：添加成员（同步）
	* 参数：
	*			nGroupId	[IN]: 组ID
	*			pMemsJson	[IN]: 成员id列表 如{ "userids":["userid"]}
	* 返回值： 0-成功，其他失败
	*/
	public int GroupInviteMember(int nGroupId, String strMemsJson)
	{
		return m_engineer.GroupInviteMember(nGroupId, strMemsJson);
	}

	/*
	* 功能：踢人出群（同步）
	* 参数：
	*			nGroupId	[IN]: 组Id
	*			nUserId		[IN]: 被踢成员ID
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int GroupKickOut(int nGroupId, int nUserId)
	{
		return m_engineer.GroupKickOut(nGroupId, nUserId);
	}

	/*
	* 功能：主动退群（同步）
	* 参数：
	*			nGroupId	[IN]: 组Id
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int GroupHadLeft(int nGroupId)
	{
		return m_engineer.GroupHadLeft(nGroupId);
	}

	/*
	* 功能：解散群组（同步）
	* 参数：
	*			nGroupId	[IN]: 组Id
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int GroupDissolve(int nGroupId)
	{
		return m_engineer.GroupDissolve(nGroupId);
	}

	/*
	* 功能：发起通话（同步）
	* 参数：
	*			nMode		[IN]: 通话类型，具体参考 WM_IM_ChatType
	*			pJsonUsers	[IN]: 成员id列表 如{ "userids":["userid"]}
	* 返回值： 0-失败，其他-作为通话ID
	*/
	public int ChatStart(int nMode, String strJsonUser)
	{
		return m_engineer.ChatStart(nMode, strJsonUser);
	}

	/*
	* 功能：邀请他人加入（同步）
	* 参数：
	*			nChatId		[IN]: 通话Id
	*			pJsonUsers	[IN]: 成员id列表 如{ "userids":["userid"]} 不能是null
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatInvite(int nChatId, String strJsonUser)
	{
		return m_engineer.ChatInvite(nChatId, strJsonUser);
	}

	/*
	 * 功能：取消邀请（同步）
	 * 参数：
	 *			nChatId		[IN]: 通话Id
	 *			pJsonUsers	[IN]: 成员id列表 如{ "userids":["userid"]}
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatCancelInvite(int nChatId, String strJsonUser)
	{
		return m_engineer.ChatCancelInvite(nChatId, strJsonUser);
	}

	/*
	* 功能：通话邀请回应
	* 参数：
	*			nChatId		[IN]: 通话ID
	*			nSponsorId		[IN]: 邀请者id
	*			nAccept		[IN]: 0 接受，1 拒绝
	*			pOutBuf		[OUT]: 结果输出，通话成员, {"users":[{"userid"}]}
	*			nBufLen		[IN]: pOutBuf大小
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatCalleeAck(int nChatId, int nSponsorId, int nAccept, byte[] pOutBuf, int nBufLen)
	{
		return m_engineer.ChatCalleeAck(nChatId, nSponsorId, nAccept, pOutBuf, nBufLen);
	}

	/*
	* 功能：结束通话（同步）
	* 参数：
	*			nChatId		[IN]: 通话ID
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatEnd(int nChatId)
	{
		return m_engineer.ChatEnd(nChatId);
	}

	/*
	* 功能：加入通话（同步）
	* 参数：
	*			nChatId		[IN]: 通话ID
	*			pOutBuf		[OUT]: 结果输出，通话成员, {"users":[{"userid"}], "chattype"} 不能是null
	*			nBufLen		[IN]: pOutBuf大小
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatJoin(int nChatId, byte[] pOutBuf, int nBufLen)
	{
		return m_engineer.ChatJoin(nChatId, pOutBuf, nBufLen);
	}

	/*
	* 功能：通话控制
	* 参数：
	*			nChatId		[IN]: 通话ID
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatControl(int nChatId)
	{
		return m_engineer.ChatControl(nChatId);
	}

	/*
	* 功能：通话禁言
	* 参数：
	*			nChatId		[IN]: 通话ID
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatGag(int nChatId)
	{
		return m_engineer.ChatGag(nChatId);
	}
	
	/*
	 * 功能：抢麦(同步)
	 * 参数：
	 *			nChatId		[IN]: 通话ID
	 *			pOutBuf		[OUT]: 结果输出，通话成员, {"result", "userid", "time"}, result:结果， userid:战麦者ID， time:抢麦时间 不能是null
	 *			nBufLen		[IN]: pOutBuf大小
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatRobMic(int nChatId, byte[] pOutBuf, int nBufLen)
	{
		return m_engineer.ChatRobMic(nChatId, pOutBuf, nBufLen);
	}

	/*
	 * 功能：放麦(同步)
	 * 参数：
	 *			nChatId		[IN]: 通话ID
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public int ChatFreeMic(int nChatId)
	{
		return m_engineer.ChatFreeMic(nChatId);
	}
}
