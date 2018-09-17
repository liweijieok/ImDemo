package com.github.liweijie.im;

import com.github.liweijie.aidl.domain.IMMessage;
import com.github.liweijie.callback.OnMessageDispatch;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：黎伟杰 on 2018/9/2.
 * 邮箱：liweijieok@qq.com
 * description： 消息分发，在UI进程中，是UI Service收到消息分发到UI中显示
 * update by:
 * update day:
 *
 * @author liweijie
 */
public class MessageDispense {
    private List<OnMessageDispatch> observers = new ArrayList<>();

    private static final class MessageDispenseHolder {
        private static final MessageDispense INSTANCE = new MessageDispense();
    }

    public static MessageDispense getInstance() {
        return MessageDispenseHolder.INSTANCE;
    }

    public void register(OnMessageDispatch dispatch) {
        observers.add(dispatch);
    }

    public void unRegister(OnMessageDispatch dispatch) {
        if (observers == null || observers.isEmpty()) {
            return;
        }
        observers.remove(dispatch);
    }


    /**
     * @param msg
     */
    public synchronized void dispatch(IMMessage msg) {
        if (observers == null || observers.isEmpty()) {
            return;
        }
        for (OnMessageDispatch dispatch : observers) {
            dispatch.onDispatchMessage(msg);
        }
    }
}
