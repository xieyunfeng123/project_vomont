// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.playback;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PlayBackActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.playback.PlayBackActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296353, "field 'top_back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view = finder.findRequiredView(source, 2131296352, "field 'vedio_top'");
    target.vedio_top = finder.castView(view, 2131296352, "field 'vedio_top'");
    view = finder.findRequiredView(source, 2131296368, "field 'snape_ll'");
    target.snape_ll = finder.castView(view, 2131296368, "field 'snape_ll'");
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296366, "field 'playback_comment'");
    target.playback_comment = finder.castView(view, 2131296366, "field 'playback_comment'");
    view = finder.findRequiredView(source, 2131296357, "field 'scroll_manager'");
    target.scroll_manager = finder.castView(view, 2131296357, "field 'scroll_manager'");
    view = finder.findRequiredView(source, 2131296355, "field 'vedio_playback'");
    target.vedio_playback = finder.castView(view, 2131296355, "field 'vedio_playback'");
    view = finder.findRequiredView(source, 2131296359, "field 'playback_upload_name'");
    target.playback_upload_name = finder.castView(view, 2131296359, "field 'playback_upload_name'");
    view = finder.findRequiredView(source, 2131296367, "field 'add_more_desp' and method 'addMoreDesp'");
    target.add_more_desp = finder.castView(view, 2131296367, "field 'add_more_desp'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.addMoreDesp();
        }
      });
    view = finder.findRequiredView(source, 2131296360, "field 'playback_video_sn'");
    target.playback_video_sn = finder.castView(view, 2131296360, "field 'playback_video_sn'");
    view = finder.findRequiredView(source, 2131296361, "field 'playback_video_length'");
    target.playback_video_length = finder.castView(view, 2131296361, "field 'playback_video_length'");
    view = finder.findRequiredView(source, 2131296362, "field 'playback_video_createtime'");
    target.playback_video_createtime = finder.castView(view, 2131296362, "field 'playback_video_createtime'");
    view = finder.findRequiredView(source, 2131296363, "field 'playback_video_desp'");
    target.playback_video_desp = finder.castView(view, 2131296363, "field 'playback_video_desp'");
    view = finder.findRequiredView(source, 2131296364, "field 'playback_desp_num'");
    target.playback_desp_num = finder.castView(view, 2131296364, "field 'playback_desp_num'");
    view = finder.findRequiredView(source, 2131296369, "field 'send_desp'");
    target.send_desp = finder.castView(view, 2131296369, "field 'send_desp'");
    view = finder.findRequiredView(source, 2131296370, "field 'send_desp_button' and method 'sendDespOnclick'");
    target.send_desp_button = finder.castView(view, 2131296370, "field 'send_desp_button'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.sendDespOnclick();
        }
      });
    view = finder.findRequiredView(source, 2131296356, "field 'playback_img'");
    target.playback_img = finder.castView(view, 2131296356, "field 'playback_img'");
    view = finder.findRequiredView(source, 2131296358, "field 'info_show'");
    target.info_show = finder.castView(view, 2131296358, "field 'info_show'");
  }

  @Override public void unbind(T target) {
    target.top_back = null;
    target.vedio_top = null;
    target.snape_ll = null;
    target.top_name = null;
    target.playback_comment = null;
    target.scroll_manager = null;
    target.vedio_playback = null;
    target.playback_upload_name = null;
    target.add_more_desp = null;
    target.playback_video_sn = null;
    target.playback_video_length = null;
    target.playback_video_createtime = null;
    target.playback_video_desp = null;
    target.playback_desp_num = null;
    target.send_desp = null;
    target.send_desp_button = null;
    target.playback_img = null;
    target.info_show = null;
  }
}
