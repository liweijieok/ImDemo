package com.github.liweijie.im_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.liweijie.aidl.domain.IMMessage;
import com.github.liweijie.callback.OnMessageDispatch;
import com.github.liweijie.im.MessageDispense;

/**
 *
 * @author liweijie
 */
public class MainActivity extends AppCompatActivity implements OnMessageDispatch {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MessageDispense.getInstance().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MessageDispense.getInstance().unRegister(this);
    }

    @Override
    public void onDispatchMessage(IMMessage msg) {

    }
}
