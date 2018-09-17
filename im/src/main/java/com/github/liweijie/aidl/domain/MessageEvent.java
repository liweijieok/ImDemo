package com.github.liweijie.aidl.domain;

/**
 * 作者：黎伟杰 on 2018/9/2.
 * 邮箱：liweijieok@qq.com
 * description： 他的作用是主进程中，UI和MessageService交互
 * update by:
 * update day:
 *
 * @author liweijie
 */
public enum MessageEvent {
    /**
     * 发消息
     */
    SEND_TEXT(1),
    /**
     * 收到消息
     */
    RECEIVE_TEXT(2);

    private int value;

    MessageEvent(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}
