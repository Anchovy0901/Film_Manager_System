package dao.impl;

import dao.AwardsDao;
import entity.Actor;
import entity.Awards;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AwardsDaoImpl implements AwardsDao {

    @Override
    public void add(Awards awards) {
        Connection connection = null;
        try {
            String sql = "insert into f_awards (awards_name,periods,`year`,site,actor_id)values(?,?,?,?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, awards.getAwardsName());
            preparedStatement.setString(2,awards.getPeriods());
            preparedStatement.setString(3,awards.getYear());
            preparedStatement.setString(4,awards.getSite());
            preparedStatement.setInt(5,awards.getActorId());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(Awards awards) {
        Connection connection = null;
        try {
            String sql = "update f_awards set awards_name=?,periods=?,`year`=?,site=?,actor_id=? where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, awards.getAwardsName());
            preparedStatement.setString(2,awards.getPeriods());
            preparedStatement.setString(3,awards.getYear());
            preparedStatement.setString(4,awards.getSite());
            preparedStatement.setInt(5,awards.getActorId());
            preparedStatement.setInt(6,awards.getId());
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
            String sql = "delete from f_awards where id=?";
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
            String sql = "delete from f_awards where actor_id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Awards queryById(Integer id) {
        Connection connection = null;
        Awards awards = new Awards();
        try {
            String sql = "select * from f_awards where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                awards.setId(resultSet.getInt("id"));
                awards.setAwardsName(resultSet.getString("awards_name"));
                awards.setPeriods(resultSet.getString("periods"));
                awards.setYear(resultSet.getString("year"));
                awards.setSite(resultSet.getString("site"));
                awards.setActorId(resultSet.getInt("actor_id"));
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return awards;
    }

    @Override
    public List<Awards> list() {
        Connection connection = null;
        List<Awards>  list = new ArrayList<>();
        try {
            String sql = "select * from f_awards";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Awards awards = new Awards();
                awards.setId(resultSet.getInt("id"));
                awards.setAwardsName(resultSet.getString("awards_name"));
                awards.setPeriods(resultSet.getString("periods"));
                awards.setYear(resultSet.getString("year"));
                awards.setSite(resultSet.getString("site"));
                awards.setActorId(resultSet.getInt("actor_id"));
                list.add(awards);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public Awards queryName(String name) {
        Connection connection = null;
        try {
            String sql = "select * from f_awards where name=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Awards awards = new Awards();
                awards.setId(resultSet.getInt("id"));
                awards.setAwardsName(resultSet.getString("awards_name"));
                awards.setPeriods(resultSet.getString("periods"));
                awards.setYear(resultSet.getString("year"));
                awards.setSite(resultSet.getString("site"));
                awards.setActorId(resultSet.getInt("actor_id"));
                return awards;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
