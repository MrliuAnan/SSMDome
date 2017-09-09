package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 刘安 on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class IClassDaoTest {


    @Autowired
    IClassDao classDao;
    @Test
    public void getAllClassInfo() throws Exception {

        List<Classes> classesList=classDao.getAllClassInfo();
        System.out.println(classesList);

    }

    @Test
    public void getClassInfoById() throws Exception {
        System.out.println(classDao.getClassInfoById(1));
    }

}