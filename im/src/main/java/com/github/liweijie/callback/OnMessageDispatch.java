package com.github.liweijie.callback;

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
public interface OnMessageDispatch {

    /**
     * 分发消息，用在UI进程和UI service之间
     * @param msg
     */
    void onDispatchMessage(IMMessage msg);

}
