package com.example.msghandler;

public interface MsgListener {
    void onMessage(String type,String data);
    String getType();
}
