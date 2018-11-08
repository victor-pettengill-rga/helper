
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNAhsNativeHelperModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAhsNativeHelperModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAhsNativeHelper";
  }

  @ReactMethod
  public void closeEvisit() {

      if(getReactApplicationContext().getCurrentActivity() != null) {
          ((AHSNativeListener) getReactApplicationContext().getCurrentActivity()).onUserLogout();
      }

  }

}