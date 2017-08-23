// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PlayBackFragment$$ViewBinder<T extends com.vomont.lz_zhangxun.home.fragment.PlayBackFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296353, "field 'top_back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296509, "field 'video_listview'");
    target.video_listview = finder.castView(view, 2131296509, "field 'video_listview'");
    view = finder.findRequiredView(source, 2131296497, "field 'rl_upload_man' and method 'manOnClick'");
    target.rl_upload_man = finder.castView(view, 2131296497, "field 'rl_upload_man'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.manOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296499, "field 'upload_man_img'");
    target.upload_man_img = finder.castView(view, 2131296499, "field 'upload_man_img'");
    view = finder.findRequiredView(source, 2131296500, "field 'upload_man_name'");
    target.upload_man_name = finder.castView(view, 2131296500, "field 'upload_man_name'");
    view = finder.findRequiredView(source, 2131296501, "field 'rl_start_time' and method 'startOnClick'");
    target.rl_start_time = finder.castView(view, 2131296501, "field 'rl_start_time'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.startOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296503, "field 'start_time_img'");
    target.start_time_img = finder.castView(view, 2131296503, "field 'start_time_img'");
    view = finder.findRequiredView(source, 2131296504, "field 'start_time_name'");
    target.start_time_name = finder.castView(view, 2131296504, "field 'start_time_name'");
    view = finder.findRequiredView(source, 2131296505, "field 'rl_end_time' and method 'endOnClick'");
    target.rl_end_time = finder.castView(view, 2131296505, "field 'rl_end_time'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.endOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296507, "field 'end_time_img'");
    target.end_time_img = finder.castView(view, 2131296507, "field 'end_time_img'");
    view = finder.findRequiredView(source, 2131296508, "field 'end_time_name'");
    target.end_time_name = finder.castView(view, 2131296508, "field 'end_time_name'");
  }

  @Override public void unbind(T target) {
    target.top_back = null;
    target.top_name = null;
    target.video_listview = null;
    target.rl_upload_man = null;
    target.upload_man_img = null;
    target.upload_man_name = null;
    target.rl_start_time = null;
    target.start_time_img = null;
    target.start_time_name = null;
    target.rl_end_time = null;
    target.end_time_img = null;
    target.end_time_name = null;
  }
}
