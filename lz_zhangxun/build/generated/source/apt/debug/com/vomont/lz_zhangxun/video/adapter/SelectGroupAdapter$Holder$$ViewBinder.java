// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.video.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SelectGroupAdapter$Holder$$ViewBinder<T extends com.vomont.lz_zhangxun.video.adapter.SelectGroupAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296553, "field 'item_upload_name'");
    target.item_upload_name = finder.castView(view, 2131296553, "field 'item_upload_name'");
    view = finder.findRequiredView(source, 2131296552, "field 'catalog'");
    target.catalog = finder.castView(view, 2131296552, "field 'catalog'");
  }

  @Override public void unbind(T target) {
    target.item_upload_name = null;
    target.catalog = null;
  }
}
