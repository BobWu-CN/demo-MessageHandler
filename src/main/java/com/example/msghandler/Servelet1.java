package com.example.msghandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Servelet1 {

    //1。监听的方法，需要遍历才行，除非转成HashMap
    @Autowired()
    List<MsgListener> msgListenerList;

    //2。直接注册到HashMap的方法，服务启动时已经自动注册
    private static Map<String,MsgListener> handlers = new HashMap<>();
    public static void registerMsgHandler(MsgListener handler){
        handlers.put(handler.getType(),handler);
    }


    @GetMapping("/test")
    public String test(){
        String test1= "msg1";
        if(handlers.containsKey(test1)){
            handlers.get(test1).onMessage(test1,"this is a testing!");
        }

        String test2= "msg2";
        if(handlers.containsKey(test2)){
            handlers.get(test2).onMessage(test2,"this is a testing!");
        }

        String test3= "msg3";
        if(handlers.containsKey(test3)){

        }else {
            System.out.println("不存在" + test3);
        }

        return "done";
    }

}
