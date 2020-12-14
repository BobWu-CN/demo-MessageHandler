package com.example.msghandler;


public class WsMsg implements MsgListener{

    private String type;
    public WsMsg(String type){
        this.type = type;
        Servelet1.registerMsgHandler(this);
        System.out.println("注册组件:" + this.type);
    }

    @Override
    public void onMessage(String type, String data) {
        //print log
    }

    @Override
    public String getType() {
        return type;
    }
}
