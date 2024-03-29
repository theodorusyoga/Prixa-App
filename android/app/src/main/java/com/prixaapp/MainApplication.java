package com.prixaapp;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.swmansion.rnscreens.RNScreensPackage;
import com.wheelpicker.WheelPickerPackage;
import com.voximplant.reactnative.VoxImplantReactPackage;
import com.zxcpoiu.incallmanager.InCallManagerPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.proyecto26.inappbrowser.RNInAppBrowserPackage;
import com.imagepicker.ImagePickerPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNScreensPackage(),
            new WheelPickerPackage(),
            new VoxImplantReactPackage(),
            new InCallManagerPackage(),
            new RNGestureHandlerPackage(),
            new RNInAppBrowserPackage(),
            new ImagePickerPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
