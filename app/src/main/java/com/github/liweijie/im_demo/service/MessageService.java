package com.github.liweijie.im_demo.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.github.liweijie.aidl.IMMessageController;
import com.github.liweijie.aidl.domain.IMMessage;
import com.github.liweijie.aidl.domain.MessageEvent;
import com.github.liweijie.im.IMService;

/**
 * 作者：黎伟杰 on 2018/9/2.
 * 邮箱：liweijieok@qq.com
 * description：
 * update by:
 * update day:
 *
 * @author liweijie
 */
public class MessageService extends Service {

    private IMMessageController controller;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        bindIM();
        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    private void bindIM() {
        Intent server = new Intent(getApplication(), IMService.class);
        bindService(server, conn, Service.BIND_AUTO_CREATE);
    }

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            controller = IMMessageController.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    public void onDestroy() {
        super.onDestroy();
        messageHandler.removeCallbacksAndMessages(null);
    }

    @SuppressLint("HandlerLeak")
    private Handler messageHandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            int what = msg.what;
            if (what == MessageEvent.SEND_TEXT.value()) {
                IMMessage obj = (IMMessage) msg.obj;
                try {
                    controller.sendMessage(obj);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }

            } else if (what == MessageEvent.RECEIVE_TEXT.value()) {

            }
        }
    };
}
