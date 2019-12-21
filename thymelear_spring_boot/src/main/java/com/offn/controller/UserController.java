package com.offn.controller;

import com.offn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @Auther: wyan
 * @Date: 2019-12-19 13:48
 * @Description:
 */
@Controller
public class UserController {

    @RequestMapping("findName")
    public String findName(Model model){
        String name = "zs";
        model.addAttribute("name",name);
        return "index";
    }
    @RequestMapping("findUser")
    public String findUser(Model model){

        User user= new User();
        user.setId(1);
        user.setName("老张");
        user.setSex("老头");
        user.setAge(69);
        model.addAttribute("user",user);
        return "index";
    }
    @RequestMapping("findAll")
    public String findAll(Model model){
        User user= new User();
        user.setId(1);
        user.setName("老李");
        user.setSex("男");
        user.setAge(19);
        User user1= new User();
        user1.setId(2);
        user1.setName("老张");
        user1.setSex("老头");
        user1.setAge(69);
        User user2= new User();
        user2.setId(3);
        user2.setName("老赵");
        user2.setSex("男孩");
        user2.setAge(49);
        List users =new ArrayList();
        users.add(user);
        users.add(user1);
        users.add(user2);
        model.addAttribute("users",users);
        System.out.println(users);
        return "userList";
    }
    @RequestMapping("findSex")
    public String findSex(Model model){
        Map map = new HashMap() ;
        map.put("boy","1.jpg");
        map.put("girl","2.jpg");
        model.addAttribute("sex","M");
        model.addAttribute("map",map);
        return "sex";
    }
    @RequestMapping("addUser")
    public String addUser(Model model){
        System.out.println("添加用户的请求到了后台");
        return "index";
    }
    @RequestMapping("formatTest")
    public String formatTest(Model model){
        model.addAttribute("money",12.3456d);
        model.addAttribute("birthday",new Date());
        model.addAttribute("replaceStr","tost");
        String userInfo="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n";
        model.addAttribute("infoDesc",userInfo);
        return "format";
    }
}
