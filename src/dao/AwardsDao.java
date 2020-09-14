package dao;

import entity.Actor;
import entity.Awards;

import java.util.List;

/**
 * 奖项Dao层
 */
public interface AwardsDao {

    /**
     * 添加奖项
     * @param awards
     */
    void add(Awards awards);

    /**
     * 修改奖项
     * @param awards
     */
    void edit(Awards awards);

    /**
     * 删除奖项
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据演员id删除
     * @param id
     */
    void deleteActorId(Integer id);

    /**
     * 奖项
     * @param id
     */
    Awards queryById(Integer id);

    /**
     * 奖项列表
     * @return
     */
    List<Awards> list();

    /**
     * 奖项名称查询
     * @param name
     * @return
     */
    Awards queryName(String name);
}
