// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.me;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AboutActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.me.AboutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296353, "field 'top_back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view = finder.findRequiredView(source, 2131296274, "field 'about_vesion'");
    target.about_vesion = finder.castView(view, 2131296274, "field 'about_vesion'");
  }

  @Override public void unbind(T target) {
    target.top_name = null;
    target.top_back = null;
    target.about_vesion = null;
  }
}
