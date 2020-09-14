package dao.impl;

import dao.FilmScheduleDao;
import entity.DiscountCard;
import entity.FilmSchedule;
import entity.FilmScheduleVO;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilmScheduleDaoImpl implements FilmScheduleDao {
    @Override
    public void add(FilmSchedule filmSchedule) {
        Connection connection = null;
        try {
            String sql = "insert into f_film_schedule (cineples_id,movie_hall_id,film_id,ticket_rates,start_time,end_time)values(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, filmSchedule.getCineplexId());
            preparedStatement.setInt(2, filmSchedule.getMovieHallId());
            preparedStatement.setInt(3, filmSchedule.getFilmId());
            preparedStatement.setBigDecimal(4, filmSchedule.getTicketRates());
            preparedStatement.setLong(5, filmSchedule.getStartTime());
            preparedStatement.setLong(6, filmSchedule.getEndTime());
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
            String sql = "delete from f_film_schedule where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public FilmSchedule queryById(Integer id) {
        Connection connection = null;
        FilmSchedule filmSchedule = new FilmSchedule();
        try {
            String sql = "select * from f_film_schedule where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                filmSchedule.setCineplexId(resultSet.getInt("cineplex_id"));
                filmSchedule.setMovieHallId(resultSet.getInt("movie_hall_id"));
                filmSchedule.setFilmId(resultSet.getInt("film_id"));
                filmSchedule.setTicketRates(resultSet.getBigDecimal("ticket_rates"));
                filmSchedule.setStartTime(resultSet.getLong("start_time"));
                filmSchedule.setEndTime(resultSet.getLong("end_time"));
                filmSchedule.setId(resultSet.getInt("id"));
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return filmSchedule;
    }

    @Override
    public List<FilmSchedule> list() {
        Connection connection = null;
        List<FilmSchedule>  list = new ArrayList<>();
        try {
            String sql = "select * from f_film_schedule";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                FilmSchedule filmSchedule = new FilmSchedule();
                filmSchedule.setCineplexId(resultSet.getInt("cineplex_id"));
                filmSchedule.setMovieHallId(resultSet.getInt("movie_hall_id"));
                filmSchedule.setFilmId(resultSet.getInt("film_id"));
                filmSchedule.setTicketRates(resultSet.getBigDecimal("ticket_rates"));
                filmSchedule.setStartTime(resultSet.getLong("start_time"));
                filmSchedule.setEndTime(resultSet.getLong("end_time"));
                filmSchedule.setId(resultSet.getInt("id"));
                list.add(filmSchedule);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public FilmSchedule queryName(String name) {
        Connection connection = null;
        try {
            String sql = "select * from f_film_schedule where name=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                FilmSchedule filmSchedule = new FilmSchedule();
                filmSchedule.setCineplexId(resultSet.getInt("cineplex_id"));
                filmSchedule.setMovieHallId(resultSet.getInt("movie_hall_id"));
                filmSchedule.setFilmId(resultSet.getInt("film_id"));
                filmSchedule.setTicketRates(resultSet.getBigDecimal("ticket_rates"));
                filmSchedule.setStartTime(resultSet.getLong("start_time"));
                filmSchedule.setEndTime(resultSet.getLong("end_time"));
                filmSchedule.setId(resultSet.getInt("id"));
                return filmSchedule;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<FilmScheduleVO> userPageHome() {
        Connection connection = null;
        List<FilmScheduleVO>  list = new ArrayList<>();
        try {
            String sql = "select a.id,b.`name` cineplex_name,c.`name` movie_hall_name,d.`name` film,a.ticket_rates,a.start_time,a.end_time, b.id cineplex_id,c.id movie_hall_id,d.id film_id from f_film_schedule a left join f_cineplex b on a.cineplex_id=b.id left join f_movie_hall c on a.movie_hall_id=c.id left join f_film d on a.film_id=d.id";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                FilmScheduleVO filmScheduleVO = new FilmScheduleVO();
                filmScheduleVO.setId(resultSet.getInt("id"));
                filmScheduleVO.setCineplexName(resultSet.getString("cineplex_name"));
                filmScheduleVO.setMovieHallName(resultSet.getString("movie_hall_name"));
                filmScheduleVO.setFilm(resultSet.getString("film"));
                filmScheduleVO.setTicketRates(resultSet.getBigDecimal("ticket_rates"));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                filmScheduleVO.setStartTime(sdf.format(new Date(Long.valueOf(resultSet.getLong("start_time")))));
                filmScheduleVO.setEndTime(sdf.format(new Date(Long.valueOf(resultSet.getLong("end_time")))));
                list.add(filmScheduleVO);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public FilmScheduleVO userPageHomeId(Integer id) {
        Connection connection = null;
        try {
            String sql = "select a.id,b.`name` cineplex_name,c.`name` movie_hall_name,d.`name` film,a.ticket_rates,a.start_time,a.end_time, b.id cineplex_id,c.id movie_hall_id,d.id film_id from f_film_schedule a left join f_cineplex b on a.cineplex_id=b.id left join f_movie_hall c on a.movie_hall_id=c.id left join f_film d on a.film_id=d.id where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                FilmScheduleVO filmScheduleVO = new FilmScheduleVO();
                filmScheduleVO.setId(resultSet.getInt("id"));
                filmScheduleVO.setCineplexName(resultSet.getString("cineplex_name"));
                filmScheduleVO.setMovieHallName(resultSet.getString("movie_hall_name"));
                filmScheduleVO.setFilm(resultSet.getString("film"));
                filmScheduleVO.setTicketRates(resultSet.getBigDecimal("ticket_rates"));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                filmScheduleVO.setStartTime(sdf.format(new Date(Long.valueOf(resultSet.getLong("start_time")))));
                filmScheduleVO.setEndTime(sdf.format(new Date(Long.valueOf(resultSet.getLong("end_time")))));
                filmScheduleVO.setCineplexId(resultSet.getInt("cineplex_id"));
                filmScheduleVO.setMovieHallId(resultSet.getInt("movie_hall_id"));
                filmScheduleVO.setFilmId(resultSet.getInt("film_id"));
                return filmScheduleVO;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
