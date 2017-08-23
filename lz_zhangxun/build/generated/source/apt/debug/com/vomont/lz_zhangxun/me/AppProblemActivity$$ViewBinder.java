// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.me;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AppProblemActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.me.AppProblemActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296353, "field 'top_back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
  }

  @Override public void unbind(T target) {
    target.top_name = null;
    target.top_back = null;
  }
}
