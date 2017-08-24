package com.vomont.lz_zhangxun.api;

import com.vomont.lz_zhangxun.bean.DepartmentBean;
import com.vomont.lz_zhangxun.bean.ResultCallBack;
import com.vomont.lz_zhangxun.bean.Update;
import com.vomont.lz_zhangxun.bean.UserInfo;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by Administrator on 2017/8/18 0018.
 */

public interface ApiService {

    public static String  TOP_HTTP="http://";

    public static String  HTTP_IP="192.168.0.185:8051";

    /**
     *
     * @param msgid 请求的id
     * @param tel   用户的电话
     * @param pswd  用户的密码（需要md5加密）
     * @param pswd  用户设备码
     * @return 用户的信息
     */
    //,@Query("devicesn") String devicesn

    //get接口的请求方式
    //@GET("/")
    //Observable<UserInfo> getLoginInfo(@Query("msgid") String msgid, @Query("tel") String tel, @Query("pswd") String pswd);
    //post接口请求方式

    /**
     * 登录接口
     * @param msgid 接口的id
     * @param tel   用户名
     * @param pswd  密码
     * @return 用户信息
     */
    @FormUrlEncoded
    @POST("/")
    Observable<UserInfo> getLoginInfo(@Field("msgid") String msgid, @Field("tel") String tel, @Field("pswd") String pswd);
    public static  String login_msid="259";
    /**
     *更新的接口
     * @param msgid 接口的id
     * @return
     */
    @FormUrlEncoded
    @POST("/")
    Observable<Update> updateApp(@Field("msgid") String msgid);

}
