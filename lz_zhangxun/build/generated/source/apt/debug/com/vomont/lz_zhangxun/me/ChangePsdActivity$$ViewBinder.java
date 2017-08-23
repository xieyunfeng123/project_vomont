// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.me;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ChangePsdActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.me.ChangePsdActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296353, "field 'top_back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view = finder.findRequiredView(source, 2131296291, "field 'change_psd_error_againpsd'");
    target.change_psd_error_againpsd = finder.castView(view, 2131296291, "field 'change_psd_error_againpsd'");
    view = finder.findRequiredView(source, 2131296288, "field 'old_password'");
    target.old_password = finder.castView(view, 2131296288, "field 'old_password'");
    view = finder.findRequiredView(source, 2131296289, "field 'change_new_password'");
    target.change_new_password = finder.castView(view, 2131296289, "field 'change_new_password'");
    view = finder.findRequiredView(source, 2131296290, "field 'change_again_password'");
    target.change_again_password = finder.castView(view, 2131296290, "field 'change_again_password'");
    view = finder.findRequiredView(source, 2131296292, "field 'change_psd_look'");
    target.change_psd_look = finder.castView(view, 2131296292, "field 'change_psd_look'");
    view = finder.findRequiredView(source, 2131296293, "field 'change_psd_finish'");
    target.change_psd_finish = finder.castView(view, 2131296293, "field 'change_psd_finish'");
  }

  @Override public void unbind(T target) {
    target.top_name = null;
    target.top_back = null;
    target.change_psd_error_againpsd = null;
    target.old_password = null;
    target.change_new_password = null;
    target.change_again_password = null;
    target.change_psd_look = null;
    target.change_psd_finish = null;
  }
}
