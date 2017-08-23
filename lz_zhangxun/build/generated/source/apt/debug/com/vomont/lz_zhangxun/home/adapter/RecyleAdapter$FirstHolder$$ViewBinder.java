// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RecyleAdapter$FirstHolder$$ViewBinder<T extends com.vomont.lz_zhangxun.home.adapter.RecyleAdapter.FirstHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296540, "field 'item_recyle_empty_name'");
    target.item_recyle_empty_name = finder.castView(view, 2131296540, "field 'item_recyle_empty_name'");
  }

  @Override public void unbind(T target) {
    target.item_recyle_empty_name = null;
  }
}
