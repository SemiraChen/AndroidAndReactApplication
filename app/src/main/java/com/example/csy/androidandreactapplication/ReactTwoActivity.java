package com.example.csy.androidandreactapplication;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;

import javax.annotation.Nullable;

/**
 * @author CSY
 */
public class ReactTwoActivity extends ReactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "MyReactNativeApp";
    }

    @Override
    public ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, getMainComponentName()) {
            @Override
            protected Bundle getLaunchOptions() {
                Bundle bundle=new Bundle();
                bundle.putString("param","我是从ReactTwoActivity传过来的");
                return bundle;
            }
        };
    }
}
