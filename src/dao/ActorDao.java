package dao;

import entity.Actor;
import entity.ActorVO;
import entity.DiscountCard;

import java.util.List;

/**
 * 演员dao层
 */
public interface ActorDao {

    /**
     * 添加折演员
     * @param actor
     */
    void add(Actor actor);

    /**
     * 修改演员
     * @param actor
     */
    void edit(Actor actor);

    /**
     * 删除演员
     * @param id
     */
    void delete(Integer id);

    /**
     * 演员
     * @param id
     */
    Actor queryById(Integer id);

    /**
     * 演员列表
     * @return
     */
    List<ActorVO> list();

    /**
     * 演员名称查询
     * @param name
     * @return
     */
    Actor queryName(String name);
}
