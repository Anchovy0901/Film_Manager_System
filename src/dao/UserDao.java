package dao;


import entity.User;

/**
 * 用户管理dao层
 */
public interface UserDao {

    Boolean login(String username, String password, Boolean role);

    void register(User user);

    Boolean forgetQuery(String username, String phone);

    void forgetUpdate(String username, String password);

    Boolean usernameQuery(String username);
}
