package com.vomont.lz_zhangxun.ui.activity;

import android.widget.EditText;

import com.vomont.lz_zhangxun.R;
import com.vomont.lz_zhangxun.api.ApiService;
import com.vomont.lz_zhangxun.base.BaseActivity;
import com.vomont.lz_zhangxun.bean.Update;
import com.vomont.lz_zhangxun.bean.UserInfo;
import com.vomont.lz_zhangxun.presenter.LoginPrensenter;
import com.vomont.lz_zhangxun.utils.MD5Util;
import com.vomont.lz_zhangxun.utils.ShareUtil;
import com.vomont.lz_zhangxun.view.ILoginView;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/8/21 0021.
 */

public class LoginActivity extends BaseActivity<LoginPrensenter> implements ILoginView {

    @Bind(R.id.login_num)
    EditText login_num;
    @Bind(R.id.login_psd)
    EditText login_psd;

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    protected LoginPrensenter createPresenter() {
        return new LoginPrensenter(this);
    }


    @Override
    public void initData() {
        super.initData();
//        login_num.setText("17601550157");
//        login_psd.setText("12345667");
    }

    @OnClick(R.id.login_app)
    public  void loginOnClick()
    {
        mPresenter.getLoginInfo(ApiService.login_msid,"17601550157", MD5Util.getMd5("123456"));
    }

    @Override
    public void initView() {
        super.initView();
    }

    @Override
    public void initListener() {
        super.initListener();
    }

    @Override
    public void loginSucess(UserInfo userInfo) {

    }

    @Override
    public void loginError() {

    }

    @Override
    public void updateSucess(Update update) {

    }

    @Override
    public void updateError() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
