// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GroupFragment$$ViewBinder<T extends com.vomont.lz_zhangxun.home.fragment.GroupFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296480, "field 'group_fragment_list'");
    target.group_fragment_list = finder.castView(view, 2131296480, "field 'group_fragment_list'");
    view = finder.findRequiredView(source, 2131296353, "field 'top_back' and method 'goBackOnClick'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.goBackOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296479, "field 'empty_recycle_list'");
    target.empty_recycle_list = finder.castView(view, 2131296479, "field 'empty_recycle_list'");
    view = finder.findRequiredView(source, 2131296478, "field 'pull_swiperefresh'");
    target.pull_swiperefresh = finder.castView(view, 2131296478, "field 'pull_swiperefresh'");
  }

  @Override public void unbind(T target) {
    target.group_fragment_list = null;
    target.top_back = null;
    target.top_name = null;
    target.empty_recycle_list = null;
    target.pull_swiperefresh = null;
  }
}
