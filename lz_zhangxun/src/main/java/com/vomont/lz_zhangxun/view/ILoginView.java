package com.vomont.lz_zhangxun.view;

import com.vomont.lz_zhangxun.bean.UserInfo;

/**
 * Created by Administrator on 2017/8/21 0021.
 */

public interface ILoginView {
    /**
     * 登录成功
      * @param userInfo 用户信息
     */
    void loginSucess(UserInfo userInfo);

    /**
     * 登录出错
     */
    void  loginError();

}
