// IMMessageController.aidl
package com.github.liweijie.aidl;
import com.github.liweijie.aidl.domain.IMMessage;

// Declare any non-default types here with import statements

interface IMMessageController {
    void sendMessage(in IMMessage msg);

    IMMessage queryMessage(int msgId);

}
