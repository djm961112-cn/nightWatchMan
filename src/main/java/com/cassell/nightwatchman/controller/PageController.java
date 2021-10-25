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
        * 最新论坛信息页
        * */
        return "sayall";
    }

    //从数据库捞取鸡汤文案给前端
    @RequestMapping(value = "/chickenmsg",method = RequestMethod.GET)
    @ResponseBody
    public String toChickenMsg(){
        //String msg="加油!";
        //获取随机数，用于捞取数据库数据
        Random r = new Random();
        int msg_id=1;
        while (true){
            int msg_id_num=r.nextInt(11);
            if (msg_id_num!=0) {
                msg_id=msg_id_num;
                break;
            }
        }
        //通过访问数据库接口获取鸡汤文案
        ChickenMsg msg=chickenService.findMsg(msg_id);
        //将获取的文案塞到json类型的对象给到前端
        JSONObject chicken=new JSONObject();
        chicken.put("status",true);
        chicken.put("msg",msg);
        chicken.put("msg_id",msg_id);
        log.info(chicken.toJSONString());
        return chicken.toJSONString();
    }

    //从数据库捞取帖子简介给前端
    @RequestMapping(value = "/titlemsg",method = RequestMethod.GET)
    @ResponseBody
    public String toTitleMsg(){
        //通过访问数据库接口获取帖子简介及简介title
        //将获取的文案塞到json类型的对象给到前端
        return "here is tiezi";
    }
}
