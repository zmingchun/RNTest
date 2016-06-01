package com.film.custom.log;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * <p>LogCustomModule类 概述，提供XXX功能</p>
 *
 * @author zmingchun
 * @version 1.0 (2016/6/1 16:45)
 */
public class LogCustomModule extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME="LogUtil";
    /**
     * 默认TAG
     */
    private static final String TAG = "---LogCustomModule---";

    public LogCustomModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void i(String tag,String msg){
        Log.i(tag,msg);
    }

    @ReactMethod
    public void d(String tag,String msg){
        Log.d(tag,msg);
    }

    /**
     * v级别 自定义TAG的log
     *
     * @param tag 标志
     * @param msg log内容
     */
    @ReactMethod
    public void v(String tag, String msg) {
        Log.v(tag, msg);
    }

    /**
     * e级别 自定义TAG的log
     *
     * @param tag 标志
     * @param msg log内容
     */
    @ReactMethod
    public void e(String tag, String msg) {
        Log.e(tag, msg);
    }
}