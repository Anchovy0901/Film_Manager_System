package dao;

import entity.Actor;
import entity.Palms;

import java.util.List;

/**
 * 获奖记录Dao
 */
public interface PalmsDao {

    /**
     * 添加获奖记录
     * @param palms
     */
    void add(Palms palms);

    /**
     * 修改获奖记录
     * @param palms
     */
    void edit(Palms palms);

    /**
     * 删除获奖记录
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据演员id删除
     * @param id
     */
    void deleteActorId(Integer id);

    /**
     * 获奖记录
     * @param id
     */
    Palms queryById(Integer id);

    /**
     * 获奖记录列表
     * @return
     */
    List<Palms> list();

    /**
     * 获奖记录查询
     * @param name
     * @return
     */
    Palms queryName(String name);

}
