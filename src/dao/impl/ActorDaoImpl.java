package dao.impl;

import dao.ActorDao;
import entity.Actor;
import entity.ActorVO;
import entity.DiscountCard;
import utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorDaoImpl implements ActorDao {
    @Override
    public void add(Actor actor) {
        Connection connection = null;
        try {
            String sql = "insert into f_actor (`name`,sex,nation,birthday,remark)values(?,?,?,?,?)";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, actor.getName());
            preparedStatement.setString(2, actor.getSex());
            preparedStatement.setString(3, actor.getNation());
            preparedStatement.setString(4, actor.getBirthday());
            preparedStatement.setString(5,actor.getRemark());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(Actor actor) {
        Connection connection = null;
        try {
            String sql = "update f_actor set `name`=?,sex=?,nation=?,birthday=?,remark=? where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, actor.getName());
            preparedStatement.setString(2, actor.getSex());
            preparedStatement.setString(3, actor.getNation());
            preparedStatement.setString(4, actor.getBirthday());
            preparedStatement.setString(5,actor.getRemark());
            preparedStatement.setInt(6,actor.getId());
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
            String sql = "delete from f_actor where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Actor queryById(Integer id) {
        Connection connection = null;
        Actor actor = new Actor();
        try {
            String sql = "select * from f_actor where id=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                actor.setId(resultSet.getInt("id"));
                actor.setName(resultSet.getString("name"));
                actor.setSex(resultSet.getString("sex"));
                actor.setNation(resultSet.getString("nation"));
                actor.setBirthday(resultSet.getString("birthday"));
                actor.setRemark(resultSet.getString("remark"));
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return actor;
    }

    @Override
    public List<ActorVO> list() {
        Connection connection = null;
        List<ActorVO> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM f_actor a left join f_palms b  on a.id=b.actor_id left join f_awards c on a.id=c.actor_id";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                ActorVO actorVO = new ActorVO();
                actorVO.setId(resultSet.getInt("id"));
                actorVO.setName(resultSet.getString("name"));
                actorVO.setSex(resultSet.getString("sex"));
                actorVO.setNation(resultSet.getString("nation"));
                actorVO.setBirthday(resultSet.getString("birthday"));
                actorVO.setRemark(resultSet.getString("remark"));
                actorVO.setAwardsName(resultSet.getString("awards_name"));
                actorVO.setPeriods(resultSet.getString("periods"));
                actorVO.setYear(resultSet.getString("year"));
                actorVO.setSite(resultSet.getString("site"));
                actorVO.setCategory(resultSet.getString("category"));
                actorVO.setLevel(resultSet.getString("level"));
                list.add(actorVO);
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public Actor queryName(String name) {
        Connection connection = null;
        try {
            String sql = "select * from f_actor where name=?";
            PreparedStatement preparedStatement = ConnectionUtils.getConnect(connection).prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Actor actor = new Actor();
                actor.setId(resultSet.getInt("id"));
                actor.setName(resultSet.getString("name"));
                actor.setSex(resultSet.getString("sex"));
                actor.setNation(resultSet.getString("nation"));
                actor.setBirthday(resultSet.getString("birthday"));
                actor.setRemark(resultSet.getString("remark"));
                return actor;
            }
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
