package com.emedinaa.multipleflavors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.emedinaa.mymodule.BuildConfig;
import com.emedinaa.mymodule.MyClass;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;

    private TextView tviApplicationID,tviHost;
    private MyClass myClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tviApplicationID= (TextView)findViewById(R.id.tviApplicationID) ;
        tviHost= (TextView)findViewById(R.id.tviHost) ;
        myClass= new MyClass();

        String applicationID= BuildConfig.APPLICATION_ID;
        String host=myClass.getFlavorHost();

        tviApplicationID.setText("APPLICATION ID "+applicationID);
        tviHost.setText("HOST "+host);

        Log.v(TAG, "APPLICATION ID "+applicationID);
        Log.v(TAG, "HOST "+host);
    }
}
