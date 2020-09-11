package dao;

import entity.Cineplex;
import entity.MovieHall;

import java.util.List;

/**
 * 影厅dao层
 */
public interface MovieHallDao {

    /**
     * 添加影厅
     * @param movieHall
     */
    void add(MovieHall movieHall);

    /**
     * 修改影厅
     * @param movieHall
     */
    void edit(MovieHall movieHall);

    /**
     * 删除影厅
     * @param id
     */
    void delete(Integer id);

    /**
     * 影厅
     * @param id
     */
    MovieHall queryById(Integer id);

    /**
     * 影厅列表
     * @return
     */
    List<MovieHall> list();

    /**
     * 影厅名称查询
     * @param name
     * @return
     */
    MovieHall queryName(String name);
}
