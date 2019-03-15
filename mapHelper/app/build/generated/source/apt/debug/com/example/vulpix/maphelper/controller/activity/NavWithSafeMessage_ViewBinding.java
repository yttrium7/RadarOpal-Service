// Generated code from Butter Knife. Do not modify!
package com.example.vulpix.maphelper.controller.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.vulpix.maphelper.R;
import com.mapbox.mapboxsdk.maps.MapView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NavWithSafeMessage_ViewBinding implements Unbinder {
  private NavWithSafeMessage target;

  @UiThread
  public NavWithSafeMessage_ViewBinding(NavWithSafeMessage target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NavWithSafeMessage_ViewBinding(NavWithSafeMessage target, View source) {
    this.target = target;

    target.mapView = Utils.findRequiredViewAsType(source, R.id.map_view, "field 'mapView'", MapView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NavWithSafeMessage target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mapView = null;
  }
}
