package org.lanqiao.service;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by lizq on 2017/8/30.
 */
public interface IUserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> getAllUser();
    /**
     * 根据id查询某一个用户
     * @param id 用户id
     * @return  用户对象
     */
    User getUserById(int id);
    /**
     * 添加一个用户
     */

    int addUser(User user);
    /**
     * 更新一个用户
     */
    int updateUser(User user);
    /**
     * 根据id删除一个用户
     */
    int deleteUserById(int id);

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


}
