package dao.impl;

import dao.DiscountCardDao;
import entity.DiscountCard;
import entity.MovieHall;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiscountCardDaoImpl implements DiscountCardDao {

    @Override
    public void add(DiscountCard discountCard) {
        Connection connection = null;
        try {
            String sql = "insert into f_discount_card (`name`,discount,cineplex_id,price)values(?,?,?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, discountCard.getName());
            preparedStatement.setBigDecimal(2, discountCard.getDiscount());
            preparedStatement.setInt(3, discountCard.getCineplexId());
            preparedStatement.setBigDecimal(4, discountCard.getPrice());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(DiscountCard discountCard) {
        Connection connection = null;
        try {
            String sql = "update f_discount_card set `name`=?,discount=?,cineplex_id=?,price=? where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, discountCard.getName());
            preparedStatement.setBigDecimal(2, discountCard.getDiscount());
            preparedStatement.setInt(3, discountCard.getCineplexId());
            preparedStatement.setBigDecimal(4, discountCard.getPrice());
            preparedStatement.setInt(5, discountCard.getId());
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
            String sql = "delete from f_discount_card where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public DiscountCard queryById(Integer id) {
        Connection connection = null;
        DiscountCard discountCard = new DiscountCard();
        try {
            String sql = "select * from f_discount_card where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                discountCard.setId(resultSet.getInt("id"));
                discountCard.setName(resultSet.getString("name"));
                discountCard.setDiscount(resultSet.getBigDecimal("discount"));
                discountCard.setCineplexId(resultSet.getInt("cineplex_id"));
                discountCard.setPrice(resultSet.getBigDecimal("price"));
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return discountCard;
    }

    @Override
    public List<DiscountCard> list() {
        Connection connection = null;
        List<DiscountCard>  list = new ArrayList<>();
        try {
            String sql = "select * from f_discount_card";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                DiscountCard discountCard = new DiscountCard();
                discountCard.setId(resultSet.getInt("id"));
                discountCard.setName(resultSet.getString("name"));
                discountCard.setDiscount(resultSet.getBigDecimal("discount"));
                discountCard.setCineplexId(resultSet.getInt("cineplex_id"));
                discountCard.setPrice(resultSet.getBigDecimal("price"));
                list.add(discountCard);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public DiscountCard queryName(String name) {
        Connection connection = null;
        try {
            String sql = "select * from f_discount_card where name=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                DiscountCard discountCard = new DiscountCard();
                discountCard.setId(resultSet.getInt("id"));
                discountCard.setName(resultSet.getString("name"));
                discountCard.setDiscount(resultSet.getBigDecimal("discount"));
                discountCard.setCineplexId(resultSet.getInt("cineplex_id"));
                discountCard.setPrice(resultSet.getBigDecimal("price"));
                return discountCard;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
