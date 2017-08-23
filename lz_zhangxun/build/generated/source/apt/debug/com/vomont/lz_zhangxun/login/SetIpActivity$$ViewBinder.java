// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.login;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SetIpActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.login.SetIpActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296311, "field 'ip_go_back' and method 'finishOnclick'");
    target.ip_go_back = finder.castView(view, 2131296311, "field 'ip_go_back'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.finishOnclick();
        }
      });
    view = finder.findRequiredView(source, 2131296312, "field 'ip_sure' and method 'sureIPOnclick'");
    target.ip_sure = finder.castView(view, 2131296312, "field 'ip_sure'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.sureIPOnclick();
        }
      });
    view = finder.findRequiredView(source, 2131296313, "field 'input_ip'");
    target.input_ip = finder.castView(view, 2131296313, "field 'input_ip'");
    view = finder.findRequiredView(source, 2131296314, "field 'clear_ip' and method 'clearOnClick'");
    target.clear_ip = finder.castView(view, 2131296314, "field 'clear_ip'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clearOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296315, "field 'history_ip'");
    target.history_ip = finder.castView(view, 2131296315, "field 'history_ip'");
  }

  @Override public void unbind(T target) {
    target.ip_go_back = null;
    target.ip_sure = null;
    target.input_ip = null;
    target.clear_ip = null;
    target.history_ip = null;
  }
}
