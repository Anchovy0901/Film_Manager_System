package dao.impl;

import dao.UserDao;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Override
    public Boolean login(String username, String password) {
        Connection connection = null;

        try {
            String sql = "select * from user where user_name = ? and pass_word = ?";
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
}
