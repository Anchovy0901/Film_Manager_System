package dao;


import entity.User;

import java.util.List;

/**
 * 用户管理dao层
 */
public interface UserDao {

    /**
     * 登录
     * @param username
     * @param password
     * @param role
     * @return
     */
    Boolean login(String username, String password, Boolean role);

    /**
     * 注册
     * @param user
     */
    void register(User user);

    /**
     * 修改密码手机账号校验
     * @param username
     * @param phone
     * @return
     */
    Boolean forgetQuery(String username, String phone);

    /**
     * 修改密码
     * @param username
     * @param password
     */
    void forgetUpdate(String username, String password);

    /**
     * 账号是否重复
     * @param username
     * @return
     */
    Boolean usernameQuery(String username);

    /**
     * 查询用户列表
     * @return
     */
    List<User> userList();
}
