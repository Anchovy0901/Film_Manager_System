package dao.impl;

import dao.MovieHallDao;
import entity.Cineplex;
import entity.MovieHall;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieHallDaoImpl implements MovieHallDao {
    @Override
    public void add(MovieHall movieHall) {
        Connection connection = null;
        try {
            String sql = "insert into f_movie_hall (`name`,cineplex_id,table_num)values(?,?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, movieHall.getName());
            preparedStatement.setInt(2, movieHall.getCineplexId());
            preparedStatement.setInt(3, movieHall.getTableNum());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(MovieHall movieHall) {
        Connection connection = null;
        try {
            String sql = "update f_movie_hall set `name`=?,cineplex_id=?,table_num=? where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, movieHall.getName());
            preparedStatement.setInt(2, movieHall.getCineplexId());
            preparedStatement.setInt(3, movieHall.getTableNum());
            preparedStatement.setInt(4, movieHall.getId());
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
            String sql = "delete from f_movie_hall where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public MovieHall queryById(Integer id) {
        Connection connection = null;
        MovieHall movieHall = new MovieHall();
        try {
            String sql = "select * from f_movie_hall where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                movieHall.setId(resultSet.getInt("id"));
                movieHall.setName(resultSet.getString("name"));
                movieHall.setCineplexId(resultSet.getInt("cineplex_id"));
                movieHall.setTableNum(resultSet.getInt("table_num"));
                movieHall.setiMax(resultSet.getBoolean("i_max"));
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return movieHall;
    }

    @Override
    public List<MovieHall> list() {
        Connection connection = null;
        List<MovieHall> list = new ArrayList<>();
        try {
            String sql = "select * from f_movie_hall";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                MovieHall movieHall = new MovieHall();
                movieHall.setId(resultSet.getInt("id"));
                movieHall.setName(resultSet.getString("name"));
                movieHall.setCineplexId(resultSet.getInt("cineplex_id"));
                movieHall.setTableNum(resultSet.getInt("table_num"));
                movieHall.setiMax(resultSet.getBoolean("i_max"));
                list.add(movieHall);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public MovieHall queryName(String name) {
        Connection connection = null;
        try {
            String sql = "select * from f_movie_hall where name=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                MovieHall movieHall = new MovieHall();
                movieHall.setId(resultSet.getInt("id"));
                movieHall.setName(resultSet.getString("name"));
                movieHall.setCineplexId(resultSet.getInt("cineplex_id"));
                movieHall.setTableNum(resultSet.getInt("table_num"));
                movieHall.setiMax(resultSet.getBoolean("i_max"));
                return movieHall;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
