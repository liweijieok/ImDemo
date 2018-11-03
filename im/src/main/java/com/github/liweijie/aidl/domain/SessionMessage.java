package com.github.liweijie.aidl.domain;

import com.github.liweijie.aidl.domain.status.ChatType;
import com.github.liweijie.aidl.domain.status.MessageType;
import com.github.liweijie.aidl.domain.status.MsgStatus;

/**
 * 作者：黎伟杰 on 2018/10/28.
 * 邮箱：liweijieok@qq.com
 * description：
 * update by:
 * update day:
 *
 * @author liweijie
 */
public class SessionMessage {
    
    private int id;
    /**
     * 会话id
     */
    private String chatId;
    /**
     * 唯一id
     */
    private String sessionId;
    /**
     * 最后一条消息的id
     */
    private String lastMsgId;
    /**
     * 发送者id
     */
    private String sender;
    /**
     * 接受者id
     */
    private String receiver;

    /**
     * 最后的消息
     */
    private String lastMsg;
    /**
     * 会话name
     */
    private String chatName;

    /**
     * 会话头像
     * 是群就是群头像，聊天的话是对方的头像
     * 接收方也是需要更改的
     */
    private String chatAvatar;

    /**
     * 发送状态
     */
    private MsgStatus sendStatus;
    /**
     * 发送类型
     */
    private MessageType msgType;
    /**
     * 会话类型
     */
    private ChatType chatType;


}
