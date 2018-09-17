package  com.github.liweijie.aidl.callback;
import com.github.liweijie.aidl.domain.IMMessage;

interface MessageCallback{

    void onMessageCallback(in IMMessage msg);
}