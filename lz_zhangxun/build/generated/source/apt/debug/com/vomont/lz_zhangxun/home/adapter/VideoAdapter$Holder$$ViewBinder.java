// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class VideoAdapter$Holder$$ViewBinder<T extends com.vomont.lz_zhangxun.home.adapter.VideoAdapter.Holder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296556, "field 'list_send_people'");
    target.list_send_people = finder.castView(view, 2131296556, "field 'list_send_people'");
    view = finder.findRequiredView(source, 2131296557, "field 'list_video_subfatory'");
    target.list_video_subfatory = finder.castView(view, 2131296557, "field 'list_video_subfatory'");
    view = finder.findRequiredView(source, 2131296558, "field 'list_video_time'");
    target.list_video_time = finder.castView(view, 2131296558, "field 'list_video_time'");
    view = finder.findRequiredView(source, 2131296559, "field 'list_video_img'");
    target.list_video_img = finder.castView(view, 2131296559, "field 'list_video_img'");
    view = finder.findRequiredView(source, 2131296560, "field 'list_video_desp'");
    target.list_video_desp = finder.castView(view, 2131296560, "field 'list_video_desp'");
    view = finder.findRequiredView(source, 2131296561, "field 'list_video_play'");
    target.list_video_play = finder.castView(view, 2131296561, "field 'list_video_play'");
    view = finder.findRequiredView(source, 2131296562, "field 'list_video_length'");
    target.list_video_length = finder.castView(view, 2131296562, "field 'list_video_length'");
    view = finder.findRequiredView(source, 2131296563, "field 'item_type'");
    target.item_type = finder.castView(view, 2131296563, "field 'item_type'");
  }

  @Override public void unbind(T target) {
    target.list_send_people = null;
    target.list_video_subfatory = null;
    target.list_video_time = null;
    target.list_video_img = null;
    target.list_video_desp = null;
    target.list_video_play = null;
    target.list_video_length = null;
    target.item_type = null;
  }
}
