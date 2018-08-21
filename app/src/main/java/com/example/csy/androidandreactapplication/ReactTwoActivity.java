package com.example.csy.androidandreactapplication;

import android.os.Bundle;

import com.facebook.react.ReactActivity;

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
}
