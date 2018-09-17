package com.github.liweijie.im;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.github.liweijie.aidl.IMMessageController;
import com.github.liweijie.aidl.domain.IMMessage;

/**
 * 作者：黎伟杰 on 2018/9/2.
 * 邮箱：liweijieok@qq.com
 * description：
 * update by:
 * update day:
 *
 * @author liweijie
 */
public class IMService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return server;
    }

    private Binder server = new IMMessageController.Stub() {
        @Override
        public void sendMessage(IMMessage msg) throws RemoteException {

        }

        @Override
        public IMMessage queryMessage(int msgId) throws RemoteException {
            return null;
        }
    };
}
