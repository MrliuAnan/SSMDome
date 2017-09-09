package org.lanqiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.bind.SchemaOutputResolver;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 刘安 on 2017/9/1.
 */
@Controller                //告诉spring ,这个类是一个controller
@RequestMapping("/test")  //请求的地址
public class HelloController {
    @RequestMapping("/hello.do")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/test.do")  //请求的地址
    public String test(){
        //进行了一些业务处理
        return "redirect:/test/hello.do";
    }
    @RequestMapping("/forTest.do")  //请求的地址
    public String forwordTest01(){
        System.out.println("进行了一些业务处理....");
        return "forward:/hello.jsp";
    }

    @RequestMapping("/forwardTest.do")  //请求的地址
    public ModelAndView forwardTest02(){
        Map map=new HashMap();
        map.put("name","lizq");
        return new ModelAndView("forward:/hello.jsp",map);
    }

}
