package dao.impl;

import dao.PalmsDao;
import entity.Actor;
import entity.Palms;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PalmsDaoImpl implements PalmsDao {

    @Override
    public void add(Palms palms) {
        Connection connection = null;
        try {
            String sql = "insert into f_palms (actor_id,category,`level`)values(?,?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, palms.getActorId());
            preparedStatement.setString(2, palms.getCategory());
            preparedStatement.setString(3, palms.getLevel());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(Palms palms) {
        Connection connection = null;
        try {
            String sql = "update f_palms set actor_id=?,category=?,`level`=? where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, palms.getActorId());
            preparedStatement.setString(2, palms.getCategory());
            preparedStatement.setString(3, palms.getLevel());
            preparedStatement.setInt(4,palms.getId());
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
            String sql = "delete from f_palms where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteActorId(Integer id) {
        Connection connection = null;
        try {
            String sql = "delete from f_palms where actor_id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Palms queryById(Integer id) {
        Connection connection = null;
        Palms palms = new Palms();
        try {
            String sql = "select * from f_palms where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                palms.setId(resultSet.getInt("id"));
                palms.setActorId(resultSet.getInt("actor_id"));
                palms.setCategory(resultSet.getString("category"));
                palms.setLevel(resultSet.getString("level"));
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return palms;
    }

    @Override
    public List<Palms> list() {
        Connection connection = null;
        List<Palms>  list = new ArrayList<>();
        try {
            String sql = "select * from f_palms";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Palms palms = new Palms();
                palms.setId(resultSet.getInt("id"));
                palms.setActorId(resultSet.getInt("actor_id"));
                palms.setCategory(resultSet.getString("category"));
                palms.setLevel(resultSet.getString("level"));
                list.add(palms);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public Palms queryName(String name) {
        Connection connection = null;
        try {
            String sql = "select * from f_palms where name=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Palms palms = new Palms();
                palms.setId(resultSet.getInt("id"));
                palms.setActorId(resultSet.getInt("actor_id"));
                palms.setCategory(resultSet.getString("category"));
                palms.setLevel(resultSet.getString("level"));
                return palms;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
