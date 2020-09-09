package dao;


import entity.User;

public interface UserDao {

    Boolean login(String username, String password, Boolean role);

    Boolean register(User user);
}
