package dao.impl;

import dao.CineplexDao;
import entity.Cineplex;
import entity.User;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CineplexDaoImpl implements CineplexDao {

    @Override
    public void add(Cineplex cineplex) {
        Connection connection = null;
        try {
            String sql = "insert into f_cineplex (`name`,address,remark,phone,characteristic_service)values(?,?,?,?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, cineplex.getName());
            preparedStatement.setString(2, cineplex.getAddress());
            preparedStatement.setString(3, cineplex.getRemark());
            preparedStatement.setString(4, cineplex.getPhone());
            preparedStatement.setString(5, cineplex.getCharacteristicService());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(Cineplex cineplex) {
        Connection connection = null;
        try {
            String sql = "update f_cineplex set `name`=?,address=?,remark=?,phone=?,characteristic_service=? where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, cineplex.getName());
            preparedStatement.setString(2, cineplex.getAddress());
            preparedStatement.setString(3, cineplex.getRemark());
            preparedStatement.setString(4, cineplex.getPhone());
            preparedStatement.setString(5, cineplex.getCharacteristicService());
            preparedStatement.setInt(6,cineplex.getId());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        Connection connection = null;
        try {
            String sql = "delete from f_cineplex where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Cineplex queryById(Integer id) {
        Connection connection = null;
        Cineplex cineplex = new Cineplex();
        try {
            String sql = "select * from f_cineplex where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                cineplex.setId(resultSet.getInt("id"));
                cineplex.setRemark(resultSet.getString("remark"));
                cineplex.setAddress(resultSet.getString("address"));
                cineplex.setPhone(resultSet.getString("phone"));
                cineplex.setCharacteristicService(resultSet.getString("characteristic_service"));
                cineplex.setName(resultSet.getString("name"));
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cineplex;
    }

    @Override
    public List<Cineplex> list() {
        Connection connection = null;
        List<Cineplex> returnList = new ArrayList<>();
        try {
            String sql = "select * from f_cineplex";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Cineplex cineplex = new Cineplex();
                cineplex.setId(resultSet.getInt("id"));
                cineplex.setRemark(resultSet.getString("remark"));
                cineplex.setAddress(resultSet.getString("address"));
                cineplex.setPhone(resultSet.getString("phone"));
                cineplex.setCharacteristicService(resultSet.getString("characteristic_service"));
                cineplex.setName(resultSet.getString("name"));
                returnList.add(cineplex);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return returnList;
    }

    @Override
    public Cineplex queryName(String name) {
        Connection connection = null;
        try {
            String sql = "select * from f_cineplex where name=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Cineplex cineplex = new Cineplex();
                cineplex.setId(resultSet.getInt("id"));
                cineplex.setRemark(resultSet.getString("remark"));
                cineplex.setAddress(resultSet.getString("address"));
                cineplex.setPhone(resultSet.getString("phone"));
                cineplex.setCharacteristicService(resultSet.getString("characteristic_service"));
                cineplex.setName(resultSet.getString("name"));
                return cineplex;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
