// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.list;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ListVideoActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.list.ListVideoActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296320, "field 'load_vedio_back'");
    target.load_vedio_back = finder.castView(view, 2131296320, "field 'load_vedio_back'");
    view = finder.findRequiredView(source, 2131296321, "field 'action_delete'");
    target.action_delete = finder.castView(view, 2131296321, "field 'action_delete'");
    view = finder.findRequiredView(source, 2131296322, "field 'to_loadingactivity'");
    target.to_loadingactivity = finder.castView(view, 2131296322, "field 'to_loadingactivity'");
    view = finder.findRequiredView(source, 2131296323, "field 'now_updata_size'");
    target.now_updata_size = finder.castView(view, 2131296323, "field 'now_updata_size'");
    view = finder.findRequiredView(source, 2131296324, "field 'updata_size'");
    target.updata_size = finder.castView(view, 2131296324, "field 'updata_size'");
    view = finder.findRequiredView(source, 2131296325, "field 'updata_ks'");
    target.updata_ks = finder.castView(view, 2131296325, "field 'updata_ks'");
    view = finder.findRequiredView(source, 2131296327, "field 'tv_vedio_size' and method 'textOnClick'");
    target.tv_vedio_size = finder.castView(view, 2131296327, "field 'tv_vedio_size'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.textOnClick(finder.<android.widget.TextView>castParam(p0, "doClick", 0, "textOnClick", 0));
        }
      });
    view = finder.findRequiredView(source, 2131296328, "field 'tv_all_vedio' and method 'textOnClick'");
    target.tv_all_vedio = finder.castView(view, 2131296328, "field 'tv_all_vedio'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.textOnClick(finder.<android.widget.TextView>castParam(p0, "doClick", 0, "textOnClick", 0));
        }
      });
    view = finder.findRequiredView(source, 2131296329, "field 'vedio_cursor'");
    target.vedio_cursor = finder.castView(view, 2131296329, "field 'vedio_cursor'");
    view = finder.findRequiredView(source, 2131296330, "field 'load_vedio_viewpager'");
    target.load_vedio_viewpager = finder.castView(view, 2131296330, "field 'load_vedio_viewpager'");
  }

  @Override public void unbind(T target) {
    target.load_vedio_back = null;
    target.action_delete = null;
    target.to_loadingactivity = null;
    target.now_updata_size = null;
    target.updata_size = null;
    target.updata_ks = null;
    target.tv_vedio_size = null;
    target.tv_all_vedio = null;
    target.vedio_cursor = null;
    target.load_vedio_viewpager = null;
  }
}
