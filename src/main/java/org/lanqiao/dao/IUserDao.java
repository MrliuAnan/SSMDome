package org.lanqiao.dao;


import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by lizq on 2017/8/30.
 */
public interface IUserDao {

    /**
     * 获取所有用户
     * @return  用户集合
     */
    List<User> getAllUser();

    /**
     * 根据id查询某一个用户
     * @param id 用户id
     * @return  用户对象
     */
    User getUserById(int id);

    /**
     * 根据id删除某个用户
     * @param id 用户id
     * @return  执行结果
     */
    int delUserById(int id);


    /**
     * 插入一个用户
     * @param user  用户对象
     * @return  执行结果
     */
    int addUser(User user);


    /**
     * 更新用户
     * @param user  用户对象
     * @return 执行结果
     */
    int updateUser(User user);

    /**
     * 根据条件查询用户
     * @param user
     * @return
     */
    List<User> getUserByCondition(User user);

    /**
     * 根据单一条件查询
     * @param user
     * @return
     */
    List<User> findUserByCondition(User user);

    /**
     * 根据条件更新用户
     * @param user
     * @return
     */
    int updateUserByCond(User user);

    List<User> getUserIn(List<Integer> list);

}
