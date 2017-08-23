// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RecyleAdapter$ThreeHolder$$ViewBinder<T extends com.vomont.lz_zhangxun.home.adapter.RecyleAdapter.ThreeHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296546, "field 'item_recyle_man_img'");
    target.item_recyle_man_img = finder.castView(view, 2131296546, "field 'item_recyle_man_img'");
    view = finder.findRequiredView(source, 2131296547, "field 'item_recyle_man_name'");
    target.item_recyle_man_name = finder.castView(view, 2131296547, "field 'item_recyle_man_name'");
    view = finder.findRequiredView(source, 2131296548, "field 'item_recyle_man_online'");
    target.item_recyle_man_online = finder.castView(view, 2131296548, "field 'item_recyle_man_online'");
    view = finder.findRequiredView(source, 2131296549, "field 'item_recyle_man_monitor'");
    target.item_recyle_man_monitor = finder.castView(view, 2131296549, "field 'item_recyle_man_monitor'");
    view = finder.findRequiredView(source, 2131296550, "field 'item_recyle_man_intercom'");
    target.item_recyle_man_intercom = finder.castView(view, 2131296550, "field 'item_recyle_man_intercom'");
    view = finder.findRequiredView(source, 2131296551, "field 'item_recyle_man_playback'");
    target.item_recyle_man_playback = finder.castView(view, 2131296551, "field 'item_recyle_man_playback'");
  }

  @Override public void unbind(T target) {
    target.item_recyle_man_img = null;
    target.item_recyle_man_name = null;
    target.item_recyle_man_online = null;
    target.item_recyle_man_monitor = null;
    target.item_recyle_man_intercom = null;
    target.item_recyle_man_playback = null;
  }
}
