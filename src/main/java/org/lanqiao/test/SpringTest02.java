package org.lanqiao.test;

import org.lanqiao.bean.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 刘安 on 2017/8/30.
 */
public class SpringTest02 {
    public static void main(String[] args) {
        //1.读取spring的配置文件
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        Chinese chinese=app.getBean("chinese",Chinese.class);
        chinese.useAxe();
    }
}
