// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.load;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoadVideoActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.load.LoadVideoActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296316, "field 'load_go_back' and method 'onFinish'");
    target.load_go_back = finder.castView(view, 2131296316, "field 'load_go_back'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onFinish();
        }
      });
    view = finder.findRequiredView(source, 2131296319, "field 'video_load_list'");
    target.video_load_list = finder.castView(view, 2131296319, "field 'video_load_list'");
    view = finder.findRequiredView(source, 2131296318, "field 'load_delete' and method 'deleteVideo'");
    target.load_delete = finder.castView(view, 2131296318, "field 'load_delete'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.deleteVideo();
        }
      });
  }

  @Override public void unbind(T target) {
    target.load_go_back = null;
    target.video_load_list = null;
    target.load_delete = null;
  }
}
