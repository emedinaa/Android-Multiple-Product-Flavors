package com.emedinaa.mymodule;

import android.util.Log;

/**
 * Created by eduardomedina on 16/01/17.
 */
public class MyClass {

    private static final String TAG = "MyClass";

    public void  init(){

        Log.v(TAG, "HOST "+ BuildConfig.HOST);
    }

    public String getFlavorHost(){
        return BuildConfig.HOST;
    }
}
