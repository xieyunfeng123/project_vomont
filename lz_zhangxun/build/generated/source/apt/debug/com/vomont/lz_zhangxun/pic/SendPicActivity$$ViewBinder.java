// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.pic;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SendPicActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.pic.SendPicActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296353, "field 'go_back'");
    target.go_back = finder.castView(view, 2131296353, "field 'go_back'");
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
    view = finder.findRequiredView(source, 2131296427, "field 'create_img_getimg' and method 'getPic'");
    target.create_img_getimg = finder.castView(view, 2131296427, "field 'create_img_getimg'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.getPic();
        }
      });
    view = finder.findRequiredView(source, 2131296428, "field 'noScrollGridView'");
    target.noScrollGridView = finder.castView(view, 2131296428, "field 'noScrollGridView'");
    view = finder.findRequiredView(source, 2131296335, "field 'recorde_time'");
    target.recorde_time = finder.castView(view, 2131296335, "field 'recorde_time'");
    view = finder.findRequiredView(source, 2131296336, "field 'll_man' and method 'getGroup'");
    target.ll_man = finder.castView(view, 2131296336, "field 'll_man'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.getGroup();
        }
      });
    view = finder.findRequiredView(source, 2131296337, "field 'look_man'");
    target.look_man = finder.castView(view, 2131296337, "field 'look_man'");
    view = finder.findRequiredView(source, 2131296429, "field 'input_pic_conn'");
    target.input_pic_conn = finder.castView(view, 2131296429, "field 'input_pic_conn'");
    view = finder.findRequiredView(source, 2131296431, "field 'pic_preservation' and method 'preservationOnClick'");
    target.pic_preservation = finder.castView(view, 2131296431, "field 'pic_preservation'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.preservationOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131296432, "field 'pic_upload' and method 'loadOnClick'");
    target.pic_upload = finder.castView(view, 2131296432, "field 'pic_upload'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.loadOnClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.go_back = null;
    target.top_name = null;
    target.create_img_getimg = null;
    target.noScrollGridView = null;
    target.recorde_time = null;
    target.ll_man = null;
    target.look_man = null;
    target.input_pic_conn = null;
    target.pic_preservation = null;
    target.pic_upload = null;
  }
}
