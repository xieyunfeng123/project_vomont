// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.login;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.login.LoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296344, "field 'login_num'");
    target.login_num = finder.castView(view, 2131296344, "field 'login_num'");
    view = finder.findRequiredView(source, 2131296345, "field 'login_psd'");
    target.login_psd = finder.castView(view, 2131296345, "field 'login_psd'");
    view = finder.findRequiredView(source, 2131296347, "field 'login_app' and method 'loginOnClick'");
    target.login_app = finder.castView(view, 2131296347, "field 'login_app'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.loginOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296346, "field 'login_psd_look' and method 'lookPsdOnClick'");
    target.login_psd_look = finder.castView(view, 2131296346, "field 'login_psd_look'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.lookPsdOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296351, "field 'ipsetting' and method 'IPSettingOnclick'");
    target.ipsetting = finder.castView(view, 2131296351, "field 'ipsetting'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.IPSettingOnclick();
        }
      });
    view = finder.findRequiredView(source, 2131296342, "field 'user_img'");
    target.user_img = finder.castView(view, 2131296342, "field 'user_img'");
    view = finder.findRequiredView(source, 2131296348, "field 'newuser_register' and method 'registerOnClick'");
    target.newuser_register = finder.castView(view, 2131296348, "field 'newuser_register'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.registerOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296349, "field 'register_login' and method 'codeLogin'");
    target.register_login = finder.castView(view, 2131296349, "field 'register_login'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.codeLogin();
        }
      });
    view = finder.findRequiredView(source, 2131296350, "field 'device_id'");
    target.device_id = finder.castView(view, 2131296350, "field 'device_id'");
  }

  @Override public void unbind(T target) {
    target.login_num = null;
    target.login_psd = null;
    target.login_app = null;
    target.login_psd_look = null;
    target.ipsetting = null;
    target.user_img = null;
    target.newuser_register = null;
    target.register_login = null;
    target.device_id = null;
  }
}
