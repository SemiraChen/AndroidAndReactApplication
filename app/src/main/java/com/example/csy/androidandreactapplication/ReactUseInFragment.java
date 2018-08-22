package com.example.csy.androidandreactapplication;

import javax.annotation.Nullable;

/**
 * @author CSY
 * Created by CSY on 2018/8/22.
 */
public class ReactUseInFragment extends ReactFragment{

    @Nullable
    @Override
    public String getMainComponentName() {
        return "MyReactNativeApp";
    }
}
