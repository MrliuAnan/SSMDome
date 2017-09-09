package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.lanqiao.bean.UserList;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 刘安 on 2017/9/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;


    @RequestMapping("/user.do")
    public String hello(User user) {
        System.out.println(user);
        return "reluct";
    }
    //list绑定
    @RequestMapping("/myList.do")
    @ResponseBody
    public String myList(UserList userList){
        return userList.toString();
    }


    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUser(){
        List<User> list=userService.getAllUser();
       /* //创建模型和视图对象
       ModelAndView modelAndView=new ModelAndView("showStu");
        //添加模型对象
        modelAndView.addObject("userList",list);*/
        return list;
    }
    @RequestMapping("/getUserById.do")
    public ModelAndView getUserById(int id){
        User user=userService.getUserById(id);
        ModelAndView modelAndView=new ModelAndView("showStu");
        modelAndView.addObject("userList",user);
        return modelAndView;
    }

    @RequestMapping("/condition.do")
    public ModelAndView getUserByCondition(User user){
        System.out.println(user);
        System.out.println("进入condition");
        List<User> list=userService.getUserByCondition(user);
        Map map=new HashMap();
        map.put("userList",list);
        return new ModelAndView("showStu",map);
    }
    @RequestMapping("/find.do")
    public ModelAndView findUserByCondition(User user){
        List<User> list=userService.findUserByCondition(user);
        Map map=new HashMap();
        map.put("userList",list);
        return new ModelAndView("showStu",map);
    }
    //REST风格添加一个用户
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    //根据id查询某一个用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable Integer id){
        User user=userService.getUserById(id);
        return user;
    }

    //根据id删除某一个用户
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public int delUserById(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }

    //更新用户
    @RequestMapping(value = "",method = RequestMethod.PUT)
    @ResponseBody
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }



}
