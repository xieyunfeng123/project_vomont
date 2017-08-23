// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.me;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class VideoSettingActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.me.VideoSettingActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296448, "field 'video_setting_go_back'");
    target.video_setting_go_back = finder.castView(view, 2131296448, "field 'video_setting_go_back'");
  }

  @Override public void unbind(T target) {
    target.video_setting_go_back = null;
  }
}
