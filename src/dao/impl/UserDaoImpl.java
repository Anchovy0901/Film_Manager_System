package dao.impl;

import dao.UserDao;
import entity.User;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public Boolean login(String username, String password, Boolean role) {
        Connection connection = null;
        try {
            String sql;
            if(role){
                sql = "select * from f_user where username = ? and password = ?";
            }else{
                sql = "select * from f_admin where username = ? and password = ?";
            }
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                return true;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public void register(User user) {
        Connection connection = null;
        try {
            String sql = "insert into f_user (username, `name`, sex, `password`, phone, email, address) values (?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getSex());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getPhone());
            preparedStatement.setString(6, user.getEmail());
            preparedStatement.setString(7, user.getAddress());
            preparedStatement.execute();

            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Boolean forgetQuery(String username, String phone) {
        Connection connection = null;
        try {
            String sql = "select * from f_user where username = ? and phone = ?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                return true;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public void forgetUpdate(String username, String password) {
        Connection connection = null;
        try {
            String sql = "update f_user set `password`=? where username=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, username);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Boolean usernameQuery(String username) {
        Connection connection = null;
        try {
            String sql = "select * from f_user where username = ?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                return false;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }

    @Override
    public List<User> userList() {
        Connection connection = null;
        List<User> returnList = new ArrayList<>();
        try {
            String sql = "select * from f_user";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setName(resultSet.getString("name"));
                user.setSex(resultSet.getString("sex"));
                user.setPassword(resultSet.getString("password"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));
                user.setAddress(resultSet.getString("address"));
                returnList.add(user);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return returnList;
    }
}
