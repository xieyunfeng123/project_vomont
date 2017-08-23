// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.home;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomeActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.home.HomeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296298, "field 'activity_home_frame'");
    target.activity_home_frame = finder.castView(view, 2131296298, "field 'activity_home_frame'");
    view = finder.findRequiredView(source, 2131296301, "field 'radio_group' and method 'radioOnClick'");
    target.radio_group = finder.castView(view, 2131296301, "field 'radio_group'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.radioOnClick(finder.<android.widget.RadioButton>castParam(p0, "doClick", 0, "radioOnClick", 0));
        }
      });
    view = finder.findRequiredView(source, 2131296302, "field 'radio_video' and method 'radioOnClick'");
    target.radio_video = finder.castView(view, 2131296302, "field 'radio_video'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.radioOnClick(finder.<android.widget.RadioButton>castParam(p0, "doClick", 0, "radioOnClick", 0));
        }
      });
    view = finder.findRequiredView(source, 2131296303, "field 'radio_playback' and method 'radioOnClick'");
    target.radio_playback = finder.castView(view, 2131296303, "field 'radio_playback'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.radioOnClick(finder.<android.widget.RadioButton>castParam(p0, "doClick", 0, "radioOnClick", 0));
        }
      });
    view = finder.findRequiredView(source, 2131296304, "field 'radio_me' and method 'radioOnClick'");
    target.radio_me = finder.castView(view, 2131296304, "field 'radio_me'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.radioOnClick(finder.<android.widget.RadioButton>castParam(p0, "doClick", 0, "radioOnClick", 0));
        }
      });
    view = finder.findRequiredView(source, 2131296300, "field 'activity_home_radiogroup'");
    target.activity_home_radiogroup = finder.castView(view, 2131296300, "field 'activity_home_radiogroup'");
    view = finder.findRequiredView(source, 2131296299, "field 'home_end'");
    target.home_end = finder.castView(view, 2131296299, "field 'home_end'");
  }

  @Override public void unbind(T target) {
    target.activity_home_frame = null;
    target.radio_group = null;
    target.radio_video = null;
    target.radio_playback = null;
    target.radio_me = null;
    target.activity_home_radiogroup = null;
    target.home_end = null;
  }
}
