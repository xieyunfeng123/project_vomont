// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MeFragment$$ViewBinder<T extends com.vomont.lz_zhangxun.home.fragment.MeFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296487, "field 'me_problem' and method 'problem'");
    target.me_problem = finder.castView(view, 2131296487, "field 'me_problem'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.problem();
        }
      });
    view = finder.findRequiredView(source, 2131296488, "field 'me_view' and method 'yijian'");
    target.me_view = finder.castView(view, 2131296488, "field 'me_view'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.yijian();
        }
      });
    view = finder.findRequiredView(source, 2131296489, "field 'me_change_psd' and method 'changPsd'");
    target.me_change_psd = finder.castView(view, 2131296489, "field 'me_change_psd'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.changPsd();
        }
      });
    view = finder.findRequiredView(source, 2131296490, "field 'me_video_setting' and method 'videoSetting'");
    target.me_video_setting = finder.castView(view, 2131296490, "field 'me_video_setting'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.videoSetting();
        }
      });
    view = finder.findRequiredView(source, 2131296491, "field 'video_av'");
    target.video_av = finder.castView(view, 2131296491, "field 'video_av'");
    view = finder.findRequiredView(source, 2131296493, "field 'me_setting' and method 'setting'");
    target.me_setting = finder.castView(view, 2131296493, "field 'me_setting'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.setting();
        }
      });
    view = finder.findRequiredView(source, 2131296494, "field 'me_about' and method 'about'");
    target.me_about = finder.castView(view, 2131296494, "field 'me_about'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.about();
        }
      });
    view = finder.findRequiredView(source, 2131296496, "field 'exit' and method 'exit'");
    target.exit = finder.castView(view, 2131296496, "field 'exit'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.exit();
        }
      });
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296485, "field 'user_name'");
    target.user_name = finder.castView(view, 2131296485, "field 'user_name'");
    view = finder.findRequiredView(source, 2131296484, "field 'user_image_top' and method 'circle'");
    target.user_image_top = finder.castView(view, 2131296484, "field 'user_image_top'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.circle();
        }
      });
    view = finder.findRequiredView(source, 2131296492, "field 'me_can_use'");
    target.me_can_use = finder.castView(view, 2131296492, "field 'me_can_use'");
  }

  @Override public void unbind(T target) {
    target.me_problem = null;
    target.me_view = null;
    target.me_change_psd = null;
    target.me_video_setting = null;
    target.video_av = null;
    target.me_setting = null;
    target.me_about = null;
    target.exit = null;
    target.top_name = null;
    target.user_name = null;
    target.user_image_top = null;
    target.me_can_use = null;
  }
}
