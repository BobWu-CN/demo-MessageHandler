package com.example.msghandler;

import org.springframework.stereotype.Component;

@Component
public class MsgB extends WsMsg{

    public MsgB() {
        super("msg2");
    }

    @Override
    public void onMessage(String type, String data) {
        System.out.println("this is MsgB:"+type+"_"+data);
    }
}
