// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.pic;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SelectPicSettingActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.pic.SelectPicSettingActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296436, "field 'pic_local' and method 'picLocal'");
    target.pic_local = finder.castView(view, 2131296436, "field 'pic_local'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.picLocal();
        }
      });
    view = finder.findRequiredView(source, 2131296432, "field 'pic_upload' and method 'picUpLoad'");
    target.pic_upload = finder.castView(view, 2131296432, "field 'pic_upload'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.picUpLoad();
        }
      });
    view = finder.findRequiredView(source, 2131296353, "field 'top_back' and method 'back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.back();
        }
      });
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
  }

  @Override public void unbind(T target) {
    target.pic_local = null;
    target.pic_upload = null;
    target.top_back = null;
    target.top_name = null;
  }
}
