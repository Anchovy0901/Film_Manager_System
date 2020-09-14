package dao.impl;

import dao.FilmDao;
import entity.Actor;
import entity.ActorVO;
import entity.Film;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDaoImpl implements FilmDao {

    @Override
    public void add(Film film) {
        Connection connection = null;
        try {
            String sql = "insert into f_film (`name`,category)values(?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, film.getName());
            preparedStatement.setString(2, film.getCategory());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(Film film) {
        Connection connection = null;
        try {
            String sql = "update f_film set `name`=?,category=? where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, film.getName());
            preparedStatement.setString(2, film.getCategory());
            preparedStatement.setInt(3,film.getId());
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
            String sql = "delete from f_film where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Film queryById(Integer id) {
        Connection connection = null;
        Film film = new Film();
        try {
            String sql = "select * from f_film where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                film.setId(resultSet.getInt("id"));
                film.setName(resultSet.getString("name"));
                film.setCategory(resultSet.getString("category"));
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return film;
    }

    @Override
    public List<Film> list() {
        Connection connection = null;
        List<Film> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM f_film";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Film film = new Film();
                film.setId(resultSet.getInt("id"));
                film.setName(resultSet.getString("name"));
                film.setCategory(resultSet.getString("category"));
                list.add(film);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public Film queryName(String name) {
        Connection connection = null;
        try {
            String sql = "select * from f_film where name=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Film film = new Film();
                film.setId(resultSet.getInt("id"));
                film.setName(resultSet.getString("name"));
                film.setCategory(resultSet.getString("category"));
                return film;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
