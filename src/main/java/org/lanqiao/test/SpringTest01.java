package org.lanqiao.test;

import org.lanqiao.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 刘安 on 2017/8/30.
 */
public class SpringTest01 {
    public static void main(String[] args) {
        //1.读取spring的配置文件
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        User user=app.getBean("user",User.class);
        User user2=app.getBean("user",User.class);
        //3.输出Usre
        user.setName("Lee");
        user.printHello();
        //4.比较user和user2   结果为true 说明usre和user2为同一对象
        System.out.println(user==user2);
    }
}
