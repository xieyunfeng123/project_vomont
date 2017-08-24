package com.vomont.lz_zhangxun.presenter;

import android.util.Log;

import com.socks.library.KLog;
import com.vomont.lz_zhangxun.base.BasePresenter;
import com.vomont.lz_zhangxun.bean.Update;
import com.vomont.lz_zhangxun.bean.UserInfo;
import com.vomont.lz_zhangxun.view.ILoginView;

import rx.Subscriber;

/**
 * Created by Administrator on 2017/8/21 0021.
 */

public class LoginPrensenter extends BasePresenter<ILoginView> {

    public LoginPrensenter(ILoginView view) {
        super(view);
    }

    //String devicesn
    public void getLoginInfo(String msgid, String tel, String pswd) {
        addSubscription(mApiService.getLoginInfo(msgid, tel, pswd), new Subscriber<UserInfo>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                KLog.e(e.getLocalizedMessage());
                mView.loginError();
            }

            @Override
            public void onNext(UserInfo userInfo) {
                mView.loginSucess(userInfo);
                if (userInfo != null)
                    KLog.e(userInfo.result+"");
            }
        });
    }


    public void  updateApp(String  msgid)
    {
        addSubscription(mApiService.updateApp(msgid), new Subscriber<Update>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                KLog.e(e.getLocalizedMessage());
                mView.updateError();
            }

            @Override
            public void onNext(Update update) {
                mView.updateSucess(update);
                if (update != null)
                    KLog.e(update.result+"");
            }


        });
    }
}
