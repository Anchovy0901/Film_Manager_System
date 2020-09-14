package dao;

import entity.Film;
import entity.Palms;

import java.util.List;

/**
 * 电影管理dao层
 */
public interface FilmDao {

    /**
     * 添加电影
     * @param film
     */
    void add(Film film);

    /**
     * 修改电影
     * @param film
     */
    void edit(Film film);

    /**
     * 删除电影
     * @param id
     */
    void delete(Integer id);

    /**
     * 电影
     * @param id
     */
    Film queryById(Integer id);

    /**
     * 电影列表
     * @return
     */
    List<Film> list();

    /**
     * 电影查询
     * @param name
     * @return
     */
    Film queryName(String name);
}
