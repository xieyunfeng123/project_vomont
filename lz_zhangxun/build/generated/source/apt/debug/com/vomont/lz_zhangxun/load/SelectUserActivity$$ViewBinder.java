// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.load;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SelectUserActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.load.SelectUserActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296421, "field 'detalman_search'");
    target.detalman_search = finder.castView(view, 2131296421, "field 'detalman_search'");
    view = finder.findRequiredView(source, 2131296422, "field 'detalman_list'");
    target.detalman_list = finder.castView(view, 2131296422, "field 'detalman_list'");
    view = finder.findRequiredView(source, 2131296418, "field 'copyman_back'");
    target.copyman_back = finder.castView(view, 2131296418, "field 'copyman_back'");
    view = finder.findRequiredView(source, 2131296420, "field 'copyman_sure'");
    target.copyman_sure = finder.castView(view, 2131296420, "field 'copyman_sure'");
    view = finder.findRequiredView(source, 2131296424, "field 'detalman_sidrbar'");
    target.detalman_sidrbar = finder.castView(view, 2131296424, "field 'detalman_sidrbar'");
  }

  @Override public void unbind(T target) {
    target.detalman_search = null;
    target.detalman_list = null;
    target.copyman_back = null;
    target.copyman_sure = null;
    target.detalman_sidrbar = null;
  }
}
