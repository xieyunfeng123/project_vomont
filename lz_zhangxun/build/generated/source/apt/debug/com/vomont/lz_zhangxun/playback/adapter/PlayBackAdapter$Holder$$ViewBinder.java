// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.playback.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PlayBackAdapter$Holder$$ViewBinder<T extends com.vomont.lz_zhangxun.playback.adapter.PlayBackAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296536, "field 'item_comment_img'");
    target.item_comment_img = finder.castView(view, 2131296536, "field 'item_comment_img'");
    view = finder.findRequiredView(source, 2131296537, "field 'item_comment_name'");
    target.item_comment_name = finder.castView(view, 2131296537, "field 'item_comment_name'");
    view = finder.findRequiredView(source, 2131296538, "field 'item_comment_time'");
    target.item_comment_time = finder.castView(view, 2131296538, "field 'item_comment_time'");
    view = finder.findRequiredView(source, 2131296539, "field 'item_comment'");
    target.item_comment = finder.castView(view, 2131296539, "field 'item_comment'");
  }

  @Override public void unbind(T target) {
    target.item_comment_img = null;
    target.item_comment_name = null;
    target.item_comment_time = null;
    target.item_comment = null;
  }
}
