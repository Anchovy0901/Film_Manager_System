package dao.impl;

import dao.OrderDao;
import entity.Order;
import entity.OrderVO;
import entity.User;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Override
    public List<OrderVO> orderList() {
        Connection connection = null;
        List<OrderVO> returnList = new ArrayList<>();
        try {
            String sql = "select d.`name` remark_name,b.`name` cineplex_name,c.`name` movie_name,a.price,a.score,a.remark from f_order a left join f_cineplex b on a.cineples_id=b.id left join f_movie_hall c on a.movie_hall_id=c.id left join f_user d on a.user_id=d.id";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                OrderVO order = new OrderVO();
                order.setRemarkName(resultSet.getString("remark_name"));
                order.setCineplexName(resultSet.getString("cineplex_name"));
                order.setMovieName(resultSet.getString("movie_name"));
                order.setPrice(resultSet.getBigDecimal("price"));
                order.setScore(resultSet.getBigDecimal("score"));
                order.setRemark(resultSet.getString("remark"));
                returnList.add(order);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return returnList;
    }

    @Override
    public void add(Order order) {
        Connection connection = null;
        try {
            String sql = "insert into f_order (cineples_id,movie_hall_id,price)values(?,?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, order.getCineplesId());
            preparedStatement.setInt(2, order.getMovieHallId());
            preparedStatement.setBigDecimal(3, order.getPrice());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
