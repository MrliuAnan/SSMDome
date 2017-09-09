package org.lanqiao.dao;

import org.lanqiao.bean.Classes;
import org.lanqiao.bean.Student;

import java.util.List;

/**
 * Created by 刘安 on 2017/9/4.
 */
public interface IClassDao {
    /**
     * 查询所有的班级信息,包含班级老师信息
     * @return
     */
    List<Classes> getAllClassInfo();

    List<Student> getClassInfoById(int id);
}
