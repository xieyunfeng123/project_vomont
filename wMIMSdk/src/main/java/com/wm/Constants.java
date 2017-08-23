package com.wm;

public class Constants 
{
	public static final int success = 0;
	public static final int fail = 1;
	
	//错误码
	public interface WM_IM_ErrorCode{
		int WM_IM_ErrorCode_ConnectFail = 2;    //连接失败
		int WM_IM_ErrorCode_PlatformHasInit = 3;	//重复初始化
		int WM_IM_ErrorCode_PlatformNoInit = 4;		//没有初始化
		int WM_IM_ErrorCode_ResponseTimeout = 5;	//超时
		int WM_IM_ErrorCode_HasLogin = 6;
		int WM_IM_ErrorCode_NoLogin = 7;
		int WM_IM_ErrorCode_InvalidParameter = 8;
		int WM_IM_ErrorCode_SDKCallInitFail = 9;
		int WM_IM_ErrorCode_RegisterFail = 10;
		int WM_IM_ErrorCode_HasRegister = 11;
		int WM_IM_ErrorCode_NotFindUser = 12;
		int WM_IM_ErrorCode_DB_WRITE_FAIL = 13;
		int WM_IM_ErrorCode_GroupNameExists = 14;
		int WM_IM_ErrorCode_NotFindGroup = 15;       //没有找到该组
		int WM_IM_ErrorCode_NoPermissions = 16;      //权限不足
		int WM_IM_ErrorCode_UserNotInGroup = 17;    //该用户不再组中
		int WM_IM_ErrorCode_PamError = 18;           //参数错误
		int WM_IM_ErrorCode_SysError = 19;          //系统错误
		int WM_IM_ErrorCode_NotFindCall = 20;       //没有找到该会话
		int WM_IM_ErrorCode_MicOccupy = 21;          //mic被占用
		int WM_IM_ErrorCode_MicNotOccupy = 22;       //mic没被占用
		int WM_IM_ErrorCode_MicNoPermissions = 23;   //mic权限不足
	}
	
	//基本消息ID
	public interface SvrMsgId{
		int WM_IM_SvrMsgId_Invalid = 0;
		int WM_IM_SvrMsgId_UserOnline = 1; //上线通知, {"userid", "signature", "maccode"}
		int WM_IM_SvrMsgId_UserOffline = 2; //离线通知, {"userid"}
		int WM_IM_SvrMsgId_DisConnect = 3; //断线通知
		int WM_IM_SvrMsgId_ReConnect = 4; //重连通知, {"result", "syncuser":[{"id", "maccode"}], "syncgroup":[{"id", "name", "owner", "createtime", "reserved1", "reserved2", "reserved3", "reserved4", "member":[{"id"}]}]}
		int WM_IM_SvrMsgId_KickOut = 5; //被服务器踢通知, 
	}
	
	//群组消息ID
	public interface GroupMsgId
	{
		int WM_IM_GroupMsgId_Invalid = 0;
		int WM_IM_GroupMsgId_Join_Notify = 1; //添加组通知(自己被邀请入群), {"sponsorid", "groupinfo":[{"id", "name", "owner", "createtime", "reserved1", "reserved2", "reserved3", "reserved4", "member":[{"id"}]}]}
		int WM_IM_GroupMsgId_Other_Join_Notify = 2;  //其他人加群通知, {"sponsorid", "groupid", "joinids":[{"id"}]}
		int WM_IM_GroupMsgId_KickOut_Notify = 3;  //被踢通知(自己), {"sponsorid", "groupid"}
		int WM_IM_GroupMsgId_Other_KickOut_Notify = 4; //被踢通知(其他), {"sponsorid", "groupid", "kickoutid"}
		int WM_IM_GroupMsgId_HadLeft_Notify = 5; //退群通知, {"groupid", "userid"}
		int WM_IM_GroupMsgId_Dissolve_Notify = 6; //解散通知, {"sponsorid", "groupid"}
	};

	//通话消息ID
	public interface ChatMsgId
	{
		int WM_IM_ChatMsgId_Invalid = 0;
		int WM_IM_ChatMsgId_Invite_Notify = 1;  //邀请通知, {"chatid", "sponsorid", "chattype"}
		int WM_IM_ChatMsgId_Invite_Response = 2; //邀请回应，{"chatid", "userid", "response"}
		int WM_IM_ChatMsgId_MemAdd_Notify = 3;  //成员增加通知, {"chatid", "sponsorid", "userid"}
		int WM_IM_ChatMsgId_MemLost_Notify = 4;  //成员减少通知, {"chatid", "userid"}
		int WM_IM_ChatMsgId_CancelInvite_Notify = 5;  //取消邀请通知, {"chatid"}
		int WM_IM_ChatMsgId_RobMic_Notify = 6;          //抢麦通知, {"chatid", "userid", "time"}
		int WM_IM_ChatMsgId_FreeMic_Notify = 7;        //放麦通知, {"chatid", "userid", "time"} 
	};

	//会议类型
	public interface WM_IM_ChatType
	{
		int WM_IM_ChatType_Invalid = -1;
		int WM_IM_ChatType_RobMic = 0; //抢麦模式
	};
}
