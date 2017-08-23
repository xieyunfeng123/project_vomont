// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.video;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoadActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.video.LoadActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296353, "field 'top_back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296583, "field 'right_text'");
    target.right_text = finder.castView(view, 2131296583, "field 'right_text'");
    view = finder.findRequiredView(source, 2131296333, "field 'play_video'");
    target.play_video = finder.castView(view, 2131296333, "field 'play_video'");
    view = finder.findRequiredView(source, 2131296334, "field 'll_attribute'");
    target.ll_attribute = finder.castView(view, 2131296334, "field 'll_attribute'");
    view = finder.findRequiredView(source, 2131296335, "field 'recorde_time'");
    target.recorde_time = finder.castView(view, 2131296335, "field 'recorde_time'");
    view = finder.findRequiredView(source, 2131296336, "field 'll_man' and method 'selectOnClick'");
    target.ll_man = finder.castView(view, 2131296336, "field 'll_man'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296337, "field 'look_man'");
    target.look_man = finder.castView(view, 2131296337, "field 'look_man'");
    view = finder.findRequiredView(source, 2131296338, "field 'input_vedio_conn'");
    target.input_vedio_conn = finder.castView(view, 2131296338, "field 'input_vedio_conn'");
    view = finder.findRequiredView(source, 2131296340, "field 'vedio_preservation' and method 'preservationOnClick'");
    target.vedio_preservation = finder.castView(view, 2131296340, "field 'vedio_preservation'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.preservationOnClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131296341, "field 'vedio_upload' and method 'uploadOnClick'");
    target.vedio_upload = finder.castView(view, 2131296341, "field 'vedio_upload'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.uploadOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296331, "field 'top_layout'");
    target.top_layout = finder.castView(view, 2131296331, "field 'top_layout'");
    view = finder.findRequiredView(source, 2131296339, "field 'll_vedio_action'");
    target.ll_vedio_action = finder.castView(view, 2131296339, "field 'll_vedio_action'");
    view = finder.findRequiredView(source, 2131296332, "field 're_video'");
    target.re_video = finder.castView(view, 2131296332, "field 're_video'");
  }

  @Override public void unbind(T target) {
    target.top_back = null;
    target.top_name = null;
    target.right_text = null;
    target.play_video = null;
    target.ll_attribute = null;
    target.recorde_time = null;
    target.ll_man = null;
    target.look_man = null;
    target.input_vedio_conn = null;
    target.vedio_preservation = null;
    target.vedio_upload = null;
    target.top_layout = null;
    target.ll_vedio_action = null;
    target.re_video = null;
  }
}
