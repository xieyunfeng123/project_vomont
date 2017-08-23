package com.vomont.lz_zhangxun.utils;

import android.hardware.Camera;
import android.view.SurfaceHolder;

import com.vomont.lz_zhangxun.app.MyApplication;
import com.wm.Constants;
import com.wm.WMIMSdk;
import com.wmclient.capsdk.WMCapSdk;
import com.wmclient.clientsdk.WMClientSdk;
import com.wmclient.clientsdk.WMDeviceInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 谢云峰
 * @date 2017/8/22 0022.
 * @email 773675907@qq.com
 * <p>
 * 三个sdk的封装
 */

public class SdkUtils {

    //IM初始化是否成功 0成功 其他失败
    public static int IM_INIT_RESULT = 0;

    //Veye登录状态 0成功 1失败 2登录中
    public static int VEYE_LOGIN_RESULT = -1;

    public static int IM_LOGIN_RESULT = -1;

    public List<WMDeviceInfo> deviceInfos = new ArrayList<>();

    public static SdkUtils SDKUTILS;
    //即时通讯的ip
    private String imIp;
    //即时通讯的端口
    private int imPort;

    private int chatId;

    private  SurfaceHolder holder;

    OnSdkListener onSdkListener;
    //判断当前是否在推流
   public  static boolean isStartCapturer=false;
    //判断当前是否在录制视频
   public  static boolean isStartSave=false;


    public static SdkUtils getInstence() {
        if (SDKUTILS == null)
            SDKUTILS = new SdkUtils();
        return SDKUTILS;
    }

    /**
     * 初始化Sdk
     *
     * @param ip     ip地址
     * @param port   端口号
     * @param isInit 是否初始化除了即时通讯的其他sdk 0是 1否
     */
    public void init(String ip, int port, int isInit) {
        imIp = ip;
        imPort = port;
        //初始化即时聊天的sdk
        IM_INIT_RESULT = WMIMSdk.getInstance().Init(ip, port, 127);
        if (isInit == 0) {
            // 初始化Veye的Sdk
            WMClientSdk.getInstance().init(63);
            //初始化直播推流的Sdk
            WMCapSdk.getInstance().Init(MyApplication.getContext(), 63);
        }
    }

    /**
     * 登录Veye的Sdk
     *
     * @param accountid     用户id
     * @param key           设备码
     * @param serverAddress ip地址
     * @param serverPort    端口号
     */
    public void loginVeye(String accountid, String key, String serverAddress, int serverPort) {
        VEYE_LOGIN_RESULT = 2;
        new Thread(new Runnable() {
            @Override
            public void run() {
                int loginResult = WMClientSdk.getInstance().authenticate(accountid, key, serverAddress, serverPort);
                if (loginResult == 0) {
                    //登录成功 获取设备列表
                    VEYE_LOGIN_RESULT = 0;
                    WMClientSdk.getInstance().getDeviceList(deviceInfos, false);
                    if (onSdkListener != null)
                        onSdkListener.VeyeLoginSucess();
                } else {
                    VEYE_LOGIN_RESULT = loginResult;
                    if (onSdkListener != null)
                        onSdkListener.VeyeLoginFail();
                }
            }
        }).start();
    }


    /**
     * @param accountid
     * @param strSignature
     * @param strMacCode
     */
    public void loginIM(int accountid, String strSignature, String strMacCode) {
        if (IM_INIT_RESULT != 0)
            //如果初始化没有成功 就重新在初始化一次
            init(imIp, imPort, 1);

        if (IM_INIT_RESULT == 0) {
            //初始化成功后登录
            int result = WMIMSdk.getInstance().Register(accountid, strSignature, strMacCode, new WMIMSdk.OnSvrMsgCallBackListen() {
                @Override
                public void OnSvrMsgCallBack(int nMsgId, String jsonStr, int jsonStrLen) {
                    switch (nMsgId) {
                        case Constants.SvrMsgId.WM_IM_SvrMsgId_UserOnline:
                            // 上线
                            break;
                        case Constants.SvrMsgId.WM_IM_SvrMsgId_UserOffline:
                            // 下线
                            break;
                        case Constants.SvrMsgId.WM_IM_SvrMsgId_DisConnect:
                            // 断线
                            break;
                        case Constants.SvrMsgId.WM_IM_SvrMsgId_ReConnect:
                            // 重连
                            break;
                        case Constants.SvrMsgId.WM_IM_SvrMsgId_KickOut:
                            // 被T
                            break;
                        default:
                            break;
                    }
                }
            }, new WMIMSdk.OnGroupMsgCallBackListen() {
                @Override
                public void OnGroupMsgCallBack(int nMsgId, String jsonStr, int jsonStrLen) {
                    switch (nMsgId) {
                        case Constants.GroupMsgId.WM_IM_GroupMsgId_Join_Notify:
                            // 添加组通知(自己被邀请入群)
                            break;
                        case Constants.GroupMsgId.WM_IM_GroupMsgId_Other_Join_Notify:
                            // 其他人加群通知
                            break;
                        case Constants.GroupMsgId.WM_IM_GroupMsgId_KickOut_Notify:
                            // 被踢通知(自己)
                            break;
                        case Constants.GroupMsgId.WM_IM_GroupMsgId_Other_KickOut_Notify:
                            // 被踢通知(其他)
                            break;
                        case Constants.GroupMsgId.WM_IM_GroupMsgId_HadLeft_Notify:
                            // 退群通知
                            break;
                        case Constants.GroupMsgId.WM_IM_GroupMsgId_Dissolve_Notify:
                            // 解散通知
                            break;
                        default:
                            break;
                    }
                }
            }, new WMIMSdk.OnRegisterMsgCallBackListen() {
                @Override
                public void OnRegisterMsgCallBack(String jsonStr, int jsonStrLen) {
                    //登录成功 用户上下线的通知
                }
            }, new WMIMSdk.OnChatMsgCallBackListen() {
                @Override
                public void OnChatMsgCallBack(int nMsgId, String jsonStr, int jsonStrLen) {
                    // 通话消息回调（邀请通知，邀请回应,成员增加通知,成员减少通知）
                    switch (nMsgId) {
                        case Constants.ChatMsgId.WM_IM_ChatMsgId_Invite_Notify:
                            //邀请通知
                            break;
                        case Constants.ChatMsgId.WM_IM_ChatMsgId_Invite_Response:
                            // 邀请回应
                            break;
                        case Constants.ChatMsgId.WM_IM_ChatMsgId_MemAdd_Notify:
                            // 成员增加通知
                            break;
                        case Constants.ChatMsgId.WM_IM_ChatMsgId_MemLost_Notify:
                            // 成员减少通知
                            break;
                        case Constants.ChatMsgId.WM_IM_ChatMsgId_CancelInvite_Notify:
                            // 取消邀请通知
                            break;
                        case Constants.ChatMsgId.WM_IM_ChatMsgId_RobMic_Notify:
                            // 抢麦通知
                            break;
                        case Constants.ChatMsgId.WM_IM_ChatMsgId_FreeMic_Notify:
                            // 放麦通知
                            break;
                        default:
                            break;
                    }
                }
            });
            IM_LOGIN_RESULT = result;
            if (IM_LOGIN_RESULT == 0) {
                //登录成功
                if (onSdkListener != null)
                    onSdkListener.IMLoginSucess();
            } else {
                //登录失败
                if (onSdkListener != null)
                    onSdkListener.IMLoginFail();
            }
        } else {
            //初始化失败
            IM_LOGIN_RESULT = -1;
            if (onSdkListener != null)
                onSdkListener.IMLoginFail();
        }
    }


    /**
     * 功能：发起通话（同步）
     *
     * @param nMode       通话类型，具体参考 WM_IM_ChatType
     * @param strJsonUser 成员id列表 如{ "userids":["userid"]}
     * @return chatId    返回是聊天的id
     */
    public void ChatStart(int nMode, String strJsonUser) {
        chatId = WMIMSdk.getInstance().ChatStart(nMode, strJsonUser);
        if (chatId == 0) {
            if (onSdkListener != null)
                onSdkListener.IMChatFail();
        } else {
            if (onSdkListener != null)
                onSdkListener.IMChatSucess();
        }
    }

    /**
     * 功能：邀请他人加入（同步）
     *
     * @param strJsonUser 成员id列表 如{ "userids":["userid"]} 不能是null
     * @return 0-成功，1-失败, 其他-错误码
     */
    public int ChatInvite(String strJsonUser) {
        return WMIMSdk.getInstance().ChatInvite(chatId, strJsonUser);
    }


    /**
     * 功能：取消邀请（同步）
     *
     * @param strJsonUser 成员id列表 如{ "userids":["userid"]}
     */
    public void ChatCancelInvite(String strJsonUser) {
        WMIMSdk.getInstance().ChatCancelInvite(chatId, strJsonUser);
    }

    /**
     * 功能：通话邀请回应
     *
     * @param nSponsorId 邀请者id
     * @param nAccept    0 接受，1 拒绝
     * @param pOutBuf    结果输出，通话成员, {"users":[{"userid"}]}
     * @param nBufLen    pOutBuf大小
     * @return 0-成功，1-失败, 其他-错误码
     */
    public void ChatCalleeAck(int nSponsorId, int nAccept, byte[] pOutBuf, int nBufLen) {
        int result = WMIMSdk.getInstance().ChatCalleeAck(chatId, nSponsorId, nAccept, pOutBuf, nBufLen);
        if (onSdkListener != null) {
            if (result == 0) {
                onSdkListener.IMChatCallSucess();
            } else {
                onSdkListener.IMChatCallFail();
            }
        }
    }


    /**
     * 功能：结束通话（同步）
     */
    public void ChatEnd() {
        WMIMSdk.getInstance().ChatEnd(chatId);
    }

    /**
     * 功能：加入通话（同步）
     *
     * @param pOutBuf 结果输出，通话成员, {"users":[{"userid"}], "chattype"} 不能是null
     * @param nBufLen pOutBuf大小
     * @return 0-成功，1-失败, 其他-错误码
     */
    public int ChatJoin(byte[] pOutBuf, int nBufLen) {
        int result = WMIMSdk.getInstance().ChatJoin(chatId, pOutBuf, nBufLen);
        if (onSdkListener != null) {
            if (result == 0) {
                onSdkListener.IMChatJoinSucess();
            } else {
                onSdkListener.IMChatJoinFail();
            }
        }
        return result;
    }

    /**
     * 功能：抢麦(同步)
     *
     * @param pOutBuf 结果输出，通话成员, {"result", "userid", "time"}, result:结果， userid:战麦者ID， time:抢麦时间 不能是null
     * @param nBufLen pOutBuf大小
     *                0-成功，1-失败, 其他-错误码
     */
    public void ChatRobMic(byte[] pOutBuf, int nBufLen) {
        int result = WMIMSdk.getInstance().ChatRobMic(chatId, pOutBuf, nBufLen);
        if (onSdkListener != null) {
            if (result == 0) {
                onSdkListener.IMRobMicSucess();
            } else {
                onSdkListener.IMRobMicFail();
            }
        }
    }


    /**
     * 功能：放麦(同步)
     */
    public void ChatFreeMic() {
        WMIMSdk.getInstance().ChatFreeMic(chatId);
    }

    /**
     * 获取设备码
     *
     * @return 设备码
     */
    public String getDevId() {
        return WMCapSdk.getInstance().GetDeviceId();
    }

    /**
     *  推流的设置接口
     * @param mUserName
     * @param mPassWord
     * @param mSvrName
     * @param mSvrType
     * @param mSvrIP
     * @param mSvrPort
     * @param nWidth
     * @param nHight
     * @param nFrameRate
     * @param nSampleRate
     * @param nChannels
     * @param nHasVideo
     * @param nHasAudio
     */
    public void SetConfigInfo(String mUserName, String mPassWord, String mSvrName, int mSvrType, String mSvrIP, int mSvrPort, int nWidth, int nHight, int nFrameRate, int nSampleRate, int nChannels,
                              int nHasVideo, int nHasAudio) {
       WMCapSdk.getInstance().SetConfigInfo(mUserName, mPassWord, mSvrName, mSvrType, mSvrIP, mSvrPort, nWidth, nHight, nFrameRate, nSampleRate, nChannels, nHasVideo, nHasAudio);
    }


    /**
     *  修改分辨率
     * @param nWidth
     * @param nHight
     * @param nFrameRate
     * @param nHasVideo
     */
    public void ChangeVideoConfigInfo(int nWidth, int nHight, int nFrameRate, int nHasVideo)
    {
        WMCapSdk.getInstance().ChangeVideoConfigInfo(nWidth,nHight,nFrameRate,nHasVideo);
    }

    /**
     * 开始推流
     * @param holder
     */
    public void startCapturer(SurfaceHolder holder,boolean bFront)
    {
        this.holder=holder;
        WMCapSdk.getInstance().SetSurfaceHolder(holder);
        WMCapSdk.getInstance().StartCapturer(holder,bFront);
        WMCapSdk.getInstance().Start();
        isStartCapturer=true;
    }
    /**
     * 关闭推流
     */
    public void stopCapturer()
    {
        if(holder!=null) {
            WMCapSdk.getInstance().StopCapturer();
            WMCapSdk.getInstance().Stop();
            holder=null;
        }
        isStartCapturer=false;
    }

    /**
     * 录像保存本地
     * @param path 全路径名
     */
    public  void startSaveVideo(String path)
    {
        WMCapSdk.getInstance().StartSaveFile(path);
        isStartSave=true;
    }

    /**
     * 关闭视频的保存
     */
    public  void stopSaveVideo()
    {
        WMCapSdk.getInstance().StopSaveFile();
        isStartSave=false;
    }

    /**
     * 推流截图
     */
    public  void TakePicture()
    {
        WMCapSdk.getInstance().TakePicture(new Camera.PictureCallback(){
            @Override
            public void onPictureTaken(byte[] bytes, Camera camera) {
                if(onSdkListener!=null)
                    onSdkListener.CapturerTakePic(bytes);
                camera.startPreview();
            }
        });
    }


    public void setOnSdkListener(OnSdkListener onSdkListener) {
        this.onSdkListener = onSdkListener;
    }


    public interface OnSdkListener {
        /**
         * veye登录成功
         */
        void VeyeLoginSucess();

        /**
         * veye登录失败
         */
        void VeyeLoginFail();

        /**
         * 即时聊天登录成功
         */
        void IMLoginSucess();

        /**
         * 即时聊天登录失败
         */
        void IMLoginFail();

        /**
         * 发起会话成功
         */
        void IMChatSucess();

        /**
         * 发起会话失败
         */
        void IMChatFail();

        /**
         * 会话回应成功
         */
        void IMChatCallSucess();

        /**
         * 会话回应失败
         */
        void IMChatCallFail();

        /**
         * 会话加入成功
         */
        void IMChatJoinSucess();

        /**
         * 会话加入失败
         */
        void IMChatJoinFail();

        /**
         * 抢麦成功
         */
        void IMRobMicSucess();

        /**
         * 抢麦失败
         */
        void IMRobMicFail();

        /**
         * 截图
         */
        void CapturerTakePic(byte[] bytes);
    }

}
