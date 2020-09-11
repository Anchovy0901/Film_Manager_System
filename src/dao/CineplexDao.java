package dao;

import entity.Cineplex;

import java.util.List;

/**
 * 影城管理dao层
 */
public interface CineplexDao {

    /**
     * 添加影城
     * @param cineplex
     */
    void add(Cineplex cineplex);

    /**
     * 修改影城
     * @param cineplex
     */
    void edit(Cineplex cineplex);

    /**
     * 删除影城
     * @param id
     */
    void delete(Integer id);

    /**
     * 影院影城
     * @param id
     */
    Cineplex queryById(Integer id);

    /**
     * 影城列表
     * @return
     */
    List<Cineplex> list();

    /**
     * 影城名称查询
     * @param name
     * @return
     */
    Cineplex queryName(String name);
}
