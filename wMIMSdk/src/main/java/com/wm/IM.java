package com.wm;

public class IM 
{
	/********************************API 接口*******************************************/
	/*
	 * 功能：初始化，调用所有接口之前调用（日志的初始化、资源的申请）
	 * 参数：
	 *			svrIp		[IN]: ip
	 *			svrPort		[IN]: port
	 *			nLogLevel	[IN]: 日志等级
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int Init(String svrIp, int svrPort, int nLogLevel);

	/*
	 * 功能：析构（释放Init申请的资源、日志的反初始化）
	 * 参数：无
	 * 返回值： 无
	*/
	public native int Uninit();


	/*
	 * 功能：向服务器注册（异步）
	 * 参数：
	 *			nUserId			[IN]: 用户ID
	 *			pszSignature	[IN]: 签名(长度待定)
	 *			pszMacCode		[IN]: 机器码(长度待定)
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int Register(int nUserId, String strSignature, String strMacCode, 
								 Object svrMsgcallBack, Object groupMsgCallBack, Object registerMsgcallBack, Object chatMsgCallBack);
		
	/*
	 * 功能：注销
	 * 参数：
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int UnRegister();

	/*
	* 功能：创建群组（同步）
	* 参数：
	*			pGroupName	[IN]: 组信息
	* 返回值： -1-失败，其他作为组ID
	*/
	public native int GroupCreat(String strGroupName);

	/*
	* 功能：添加成员（同步）
	* 参数：
	*			nGroupId	[IN]: 组ID
	*			pMemsJson	[IN]: 成员id列表 如{ "userids":["userid"]}
	* 返回值： 0-成功，其他失败
	*/
	public native int GroupInviteMember(int nGroupId, String strMemsJson);

	/*
	* 功能：踢人出群（同步）
	* 参数：
	*			nGroupId	[IN]: 组Id
	*			nUserId		[IN]: 被踢成员ID
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int GroupKickOut(int nGroupId, int nUserId);

	/*
	* 功能：主动退群（同步）
	* 参数：
	*			nGroupId	[IN]: 组Id
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int GroupHadLeft(int nGroupId);

	/*
	* 功能：解散群组（同步）
	* 参数：
	*			nGroupId	[IN]: 组Id
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int GroupDissolve(int nGroupId);

	/*
	* 功能：发起通话（同步）
	* 参数：
	*			nMode		[IN]: 通话类型，具体参考 WM_IM_ChatType
	*			pJsonUsers	[IN]: 成员id列表 如{ "userids":["userid"]}
	* 返回值： 0-失败，其他-作为通话ID
	*/
	public native int ChatStart(int nMode, String strJsonUser);

	/*
	* 功能：邀请他人加入（同步）
	* 参数：
	*			nChatId		[IN]: 通话Id
	*			pJsonUsers	[IN]: 成员id列表 如{ "userids":["userid"]}
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int ChatInvite(int nChatId, String strJsonUser);
	
	/*
	 * 功能：取消邀请（同步）
	 * 参数：
	 *			nChatId		[IN]: 通话Id
	 *			pJsonUsers	[IN]: 成员id列表 如{ "userids":["userid"]}
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int ChatCancelInvite(int nChatId, String strJsonUser);

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
	public native int ChatCalleeAck(int nChatId, int nSponsorId, int nAccept, byte[] out, int nSize);

	/*
	* 功能：结束通话（同步）
	* 参数：
	*			nChatId		[IN]: 通话ID
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int ChatEnd(int nChatId);

	/*
	* 功能：加入通话（同步）
	* 参数：
	*			pOutBuf		[OUT]: 结果输出，通话成员, {"users":[{"userid"}], "chattype"}
	*			nBufLen		[IN]: pOutBuf大小
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int ChatJoin(int nChatId, byte[] out, int nSize);

	/*
	* 功能：通话控制
	* 参数：
	*			nChatId		[IN]: 通话ID
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int ChatControl(int nChatId);

	/*
	* 功能：通话禁言
	* 参数：
	*			nChatId		[IN]: 通话ID
	* 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int ChatGag(int nChatId);
	
	/*
	 * 功能：抢麦(同步)
	 * 参数：
	 *			pOutBuf		[OUT]: 结果输出，通话成员, {"result", "userid", "time"}, result:结果， userid:战麦者ID， time:抢麦时间
	 *			nBufLen		[IN]: pOutBuf大小
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int ChatRobMic(int nChatId, byte[] out, int nSize);

	/*
	 * 功能：放麦(同步)
	 * 参数：
	 *			nChatId		[IN]: 通话ID
	 * 返回值： 0-成功，1-失败, 其他-错误码
	*/
	public native int ChatFreeMic(int nChatId);
	
	static 
	{  
        System.loadLibrary("wmim");
    }    
}