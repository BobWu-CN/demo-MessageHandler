package com.example.msghandler;

import org.springframework.stereotype.Component;

@Component
public class MsgA extends WsMsg{

    public MsgA() {
        super("msg1");
    }

    @Override
    public void onMessage(String type, String data) {
        System.out.println("this is MsgA:"+type+"_"+data);
    }
}
