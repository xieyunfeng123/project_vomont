// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.ui.activity.LoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493029, "field 'login_num'");
    target.login_num = finder.castView(view, 2131493029, "field 'login_num'");
    view = finder.findRequiredView(source, 2131493030, "field 'login_psd'");
    target.login_psd = finder.castView(view, 2131493030, "field 'login_psd'");
    view = finder.findRequiredView(source, 2131493032, "method 'loginOnClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.loginOnClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.login_num = null;
    target.login_psd = null;
  }
}
