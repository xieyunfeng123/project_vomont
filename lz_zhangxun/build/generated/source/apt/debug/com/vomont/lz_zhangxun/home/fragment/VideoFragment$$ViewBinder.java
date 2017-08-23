// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class VideoFragment$$ViewBinder<T extends com.vomont.lz_zhangxun.home.fragment.VideoFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296511, "field 'video_back' and method 'backOnClick'");
    target.video_back = finder.castView(view, 2131296511, "field 'video_back'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.backOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296519, "field 'video_load' and method 'loadOnClick'");
    target.video_load = finder.castView(view, 2131296519, "field 'video_load'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.loadOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296510, "field 'sf_video'");
    target.sf_video = finder.castView(view, 2131296510, "field 'sf_video'");
    view = finder.findRequiredView(source, 2131296513, "field 'video_client_fail'");
    target.video_client_fail = finder.castView(view, 2131296513, "field 'video_client_fail'");
    view = finder.findRequiredView(source, 2131296350, "field 'device_id'");
    target.device_id = finder.castView(view, 2131296350, "field 'device_id'");
    view = finder.findRequiredView(source, 2131296515, "field 'video_tape' and method 'tapeOnClick'");
    target.video_tape = finder.castView(view, 2131296515, "field 'video_tape'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.tapeOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296518, "field 'video_photograph' and method 'photographOnClick'");
    target.video_photograph = finder.castView(view, 2131296518, "field 'video_photograph'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.photographOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296516, "field 'video_tape_img'");
    target.video_tape_img = finder.castView(view, 2131296516, "field 'video_tape_img'");
    view = finder.findRequiredView(source, 2131296517, "field 'video_tape_name'");
    target.video_tape_name = finder.castView(view, 2131296517, "field 'video_tape_name'");
    view = finder.findRequiredView(source, 2131296514, "field 'online_man_num'");
    target.online_man_num = finder.castView(view, 2131296514, "field 'online_man_num'");
    view = finder.findRequiredView(source, 2131296512, "field 'video_light' and method 'lightOnClick'");
    target.video_light = finder.castView(view, 2131296512, "field 'video_light'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.lightOnClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.video_back = null;
    target.video_load = null;
    target.sf_video = null;
    target.video_client_fail = null;
    target.device_id = null;
    target.video_tape = null;
    target.video_photograph = null;
    target.video_tape_img = null;
    target.video_tape_name = null;
    target.online_man_num = null;
    target.video_light = null;
  }
}
