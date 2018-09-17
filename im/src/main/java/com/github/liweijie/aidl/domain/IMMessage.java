package com.github.liweijie.aidl.domain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 作者：黎伟杰 on 2018/9/2.
 * 邮箱：liweijieok@qq.com
 * description： 消息信息描述
 * update by:
 * update day:
 *
 * @author liweijie
 */
public class IMMessage implements Parcelable {
    private long msgId;
    private String sender;
    private String receiver;
    private int msgType;
    private String msg;
    private long sendTime;

    public IMMessage() {

    }

    protected IMMessage(Parcel in) {
        sender = in.readString();
        receiver = in.readString();
        msgType = in.readInt();
        msg = in.readString();
        sendTime = in.readLong();
        msgId = in.readLong();
    }

    public static final Creator<IMMessage> CREATOR = new Creator<IMMessage>() {
        @Override
        public IMMessage createFromParcel(Parcel in) {
            return new IMMessage(in);
        }

        @Override
        public IMMessage[] newArray(int size) {
            return new IMMessage[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(sender);
        dest.writeString(receiver);
        dest.writeInt(msgType);
        dest.writeString(msg);
        dest.writeLong(sendTime);
        dest.writeLong(msgId);
    }

    public void readFromParcel(Parcel in) {
        sender = in.readString();
        receiver = in.readString();
        msg = in.readString();
        sendTime = in.readLong();
        msgId = in.readLong();
    }

    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getSendTime() {
        return sendTime;
    }

    public void setSendTime(long sendTime) {
        this.sendTime = sendTime;
    }
}
