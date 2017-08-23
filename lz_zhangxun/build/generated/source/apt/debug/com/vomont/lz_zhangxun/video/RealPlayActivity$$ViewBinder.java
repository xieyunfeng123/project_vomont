// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.video;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RealPlayActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.video.RealPlayActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296353, "field 'top_back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296382, "field 'surfaceview_layout'");
    target.surfaceview_layout = finder.castView(view, 2131296382, "field 'surfaceview_layout'");
    view = finder.findRequiredView(source, 2131296383, "field 'vedio_progressbar'");
    target.vedio_progressbar = finder.castView(view, 2131296383, "field 'vedio_progressbar'");
    view = finder.findRequiredView(source, 2131296385, "field 'control_stream'");
    target.control_stream = finder.castView(view, 2131296385, "field 'control_stream'");
    view = finder.findRequiredView(source, 2131296387, "field 'stream_type_sub'");
    target.stream_type_sub = finder.castView(view, 2131296387, "field 'stream_type_sub'");
    view = finder.findRequiredView(source, 2131296388, "field 'stream_type_main'");
    target.stream_type_main = finder.castView(view, 2131296388, "field 'stream_type_main'");
    view = finder.findRequiredView(source, 2131296386, "field 'play_statue_line'");
    target.play_statue_line = finder.castView(view, 2131296386, "field 'play_statue_line'");
    view = finder.findRequiredView(source, 2131296380, "field 'realplay_top'");
    target.realplay_top = finder.castView(view, 2131296380, "field 'realplay_top'");
    view = finder.findRequiredView(source, 2131296389, "field 'vedio_control_play' and method 'controlPlayClick'");
    target.vedio_control_play = finder.castView(view, 2131296389, "field 'vedio_control_play'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.controlPlayClick();
        }
      });
    view = finder.findRequiredView(source, 2131296390, "field 'stream_type'");
    target.stream_type = finder.castView(view, 2131296390, "field 'stream_type'");
    view = finder.findRequiredView(source, 2131296391, "field 'vedio_take_photo'");
    target.vedio_take_photo = finder.castView(view, 2131296391, "field 'vedio_take_photo'");
    view = finder.findRequiredView(source, 2131296392, "field 'vedio_snapshot'");
    target.vedio_snapshot = finder.castView(view, 2131296392, "field 'vedio_snapshot'");
    view = finder.findRequiredView(source, 2131296393, "field 'vedio_voice'");
    target.vedio_voice = finder.castView(view, 2131296393, "field 'vedio_voice'");
    view = finder.findRequiredView(source, 2131296394, "field 'vedio_change' and method 'screenOnClick'");
    target.vedio_change = finder.castView(view, 2131296394, "field 'vedio_change'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.screenOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296399, "field 'phone_img'");
    target.phone_img = finder.castView(view, 2131296399, "field 'phone_img'");
    view = finder.findRequiredView(source, 2131296400, "field 'empty_img'");
    target.empty_img = finder.castView(view, 2131296400, "field 'empty_img'");
    view = finder.findRequiredView(source, 2131296395, "field 'scroll_ll'");
    target.scroll_ll = finder.castView(view, 2131296395, "field 'scroll_ll'");
    view = finder.findRequiredView(source, 2131296381, "field 'vedio_all'");
    target.vedio_all = finder.castView(view, 2131296381, "field 'vedio_all'");
    view = finder.findRequiredView(source, 2131296396, "field 'video_snapshot' and method 'snapeVideo'");
    target.video_snapshot = finder.castView(view, 2131296396, "field 'video_snapshot'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.snapeVideo();
        }
      });
    view = finder.findRequiredView(source, 2131296397, "field 'real_voice_ll'");
    target.real_voice_ll = finder.castView(view, 2131296397, "field 'real_voice_ll'");
    view = finder.findRequiredView(source, 2131296398, "field 'real_voice_img'");
    target.real_voice_img = finder.castView(view, 2131296398, "field 'real_voice_img'");
    view = finder.findRequiredView(source, 2131296384, "field 'voice_real_img'");
    target.voice_real_img = finder.castView(view, 2131296384, "field 'voice_real_img'");
  }

  @Override public void unbind(T target) {
    target.top_back = null;
    target.top_name = null;
    target.surfaceview_layout = null;
    target.vedio_progressbar = null;
    target.control_stream = null;
    target.stream_type_sub = null;
    target.stream_type_main = null;
    target.play_statue_line = null;
    target.realplay_top = null;
    target.vedio_control_play = null;
    target.stream_type = null;
    target.vedio_take_photo = null;
    target.vedio_snapshot = null;
    target.vedio_voice = null;
    target.vedio_change = null;
    target.phone_img = null;
    target.empty_img = null;
    target.scroll_ll = null;
    target.vedio_all = null;
    target.video_snapshot = null;
    target.real_voice_ll = null;
    target.real_voice_img = null;
    target.voice_real_img = null;
  }
}
