package dao;

import entity.FilmSchedule;
import entity.FilmScheduleVO;
import entity.Palms;

import java.util.List;

/**
 * 排片Dao层
 */
public interface FilmScheduleDao {

    /**
     * 添加排片
     * @param filmSchedule
     */
    void add(FilmSchedule filmSchedule);

    /**
     * 删除拍片
     * @param id
     */
    void delete(Integer id);

    /**
     * 排片
     * @param id
     */
    FilmSchedule queryById(Integer id);

    /**
     * 排片列表
     * @return
     */
    List<FilmSchedule> list();

    /**
     * 排片查询
     * @param name
     * @return
     */
    FilmSchedule queryName(String name);

    /**
     * 用户首页
     * @return
     */
    List<FilmScheduleVO> userPageHome();

    /**
     * 用户首页id
     * @return
     */
    FilmScheduleVO userPageHomeId(Integer id);
}
