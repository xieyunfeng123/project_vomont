// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SearchManActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.home.SearchManActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296353, "field 'top_back' and method 'goBack'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.goBack();
        }
      });
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296414, "field 'filter_edit'");
    target.filter_edit = finder.castView(view, 2131296414, "field 'filter_edit'");
    view = finder.findRequiredView(source, 2131296415, "field 'sort_name'");
    target.sort_name = finder.castView(view, 2131296415, "field 'sort_name'");
    view = finder.findRequiredView(source, 2131296416, "field 'dialog'");
    target.dialog = finder.castView(view, 2131296416, "field 'dialog'");
    view = finder.findRequiredView(source, 2131296417, "field 'sidrbar'");
    target.sidrbar = finder.castView(view, 2131296417, "field 'sidrbar'");
  }

  @Override public void unbind(T target) {
    target.top_back = null;
    target.top_name = null;
    target.filter_edit = null;
    target.sort_name = null;
    target.dialog = null;
    target.sidrbar = null;
  }
}
