package com.cassell.nightwatchman.controller;

import com.cassell.nightwatchman.entity.ChickenMsg;
import com.cassell.nightwatchman.service.ChickenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;

import java.util.Random;

/**
 * create by 金明 on 2021/8/13.
 */
@Slf4j
@Controller
public class PageController {

    @Autowired
    ChickenService chickenService;

    @RequestMapping("/home")
    public String toHomePage(){
        /*
        * 首页
        * */
        return "home";
    }

    @RequestMapping("/sayall")
    public String toSayAll(){
        /*
        * 论坛页
        * */
        return "sayall";
    }

    @RequestMapping(value = "/chickenmsg",method = RequestMethod.GET)
    @ResponseBody
    public String toChickenMsg(){
        //String msg="加油!";
        Random r = new Random();
        int msg_id=1;
        while (true){
            int msg_id_num=r.nextInt(11);
            if (msg_id_num!=0) {
                msg_id=msg_id_num;
                break;
            }
        }
        ChickenMsg msg=chickenService.findMsg(msg_id);
        JSONObject chicken=new JSONObject();
        chicken.put("status",true);
        chicken.put("msg",msg);
        chicken.put("msg_id",msg_id);
        log.info(chicken.toJSONString());
        return chicken.toJSONString();
    }
}
