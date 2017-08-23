// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RecyleAdapter$TwoHolder$$ViewBinder<T extends com.vomont.lz_zhangxun.home.adapter.RecyleAdapter.TwoHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296542, "field 'item_recyle_group_img'");
    target.item_recyle_group_img = finder.castView(view, 2131296542, "field 'item_recyle_group_img'");
    view = finder.findRequiredView(source, 2131296543, "field 'item_recyle_group_name'");
    target.item_recyle_group_name = finder.castView(view, 2131296543, "field 'item_recyle_group_name'");
    view = finder.findRequiredView(source, 2131296544, "field 'item_recyle_group_item_num'");
    target.item_recyle_group_item_num = finder.castView(view, 2131296544, "field 'item_recyle_group_item_num'");
    view = finder.findRequiredView(source, 2131296545, "field 'item_recyle_group_num'");
    target.item_recyle_group_num = finder.castView(view, 2131296545, "field 'item_recyle_group_num'");
  }

  @Override public void unbind(T target) {
    target.item_recyle_group_img = null;
    target.item_recyle_group_name = null;
    target.item_recyle_group_item_num = null;
    target.item_recyle_group_num = null;
  }
}
