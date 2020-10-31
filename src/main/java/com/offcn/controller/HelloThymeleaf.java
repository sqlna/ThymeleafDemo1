package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @author 24238
 */
@Controller
//如果使用thymeleaf  就不能使用restcontroller
public class HelloThymeleaf {

    @GetMapping("/hello")
    public String helloPage(Model model){
        model.addAttribute("msg","今天是第193天");
        return "hello";
    }

    @GetMapping("/getUser")
    public String getUser(Model model){
        User user = new User(2001, 12, "小白");
        //user数据的添加
        model.addAttribute("user",user);

        //map数据的添加
        Map<String, String> map = new HashMap<>();
        map.put("phoneNum","123123123");
        map.put("address","成都市双流区");
        model.addAttribute("map",map);

        return "showUser";
    }

    @GetMapping("/showList")
    public String showList(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(2002,16,"小黑"));
        list.add(new User(2003,13,"小灰"));
        list.add(new User(2004,12,"小蓝"));
        list.add(new User(2005,11,"小红"));
        model.addAttribute("list",list);

        model.addAttribute("username","小花");
        return "list";
    }

    @GetMapping("/showIsOrNot")
    public String showIsOrNot(Model model){
        model.addAttribute("flag","no");
        return "yesOrNot";
    }

    @GetMapping("/showSwitch")
    public String showSwitch(Model model){
        model.addAttribute("author","admin");
        model.addAttribute("manager","manager");
        return "showSwitch";
    }

    @GetMapping("/showImage")
    public String showImage(){
        return "showImage";
    }

    @GetMapping("/showIndex")
    public String showIndex(){
        return "index";
    }

    @GetMapping("/showInnerObject")
    public String showInnerObject(Model model){
        model.addAttribute("date",new Date());
        model.addAttribute("price",12036.1236D);
        model.addAttribute("str","的HiFi大家发配件费附加配送费给排水平均水平附近水平飞机票司法解释普吉岛拍摄角度平均数平均分配进商品房");
        return "showInnerObj";
    }
}
