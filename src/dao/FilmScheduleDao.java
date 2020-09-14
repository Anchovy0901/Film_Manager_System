package dao;

import entity.FilmSchedule;
import entity.FilmScheduleVO;
import entity.Palms;

import java.util.List;

/**
 * ��ƬDao��
 */
public interface FilmScheduleDao {

    /**
     * �����Ƭ
     * @param filmSchedule
     */
    void add(FilmSchedule filmSchedule);

    /**
     * ɾ����Ƭ
     * @param id
     */
    void delete(Integer id);

    /**
     * ��Ƭ
     * @param id
     */
    FilmSchedule queryById(Integer id);

    /**
     * ��Ƭ�б�
     * @return
     */
    List<FilmSchedule> list();

    /**
     * ��Ƭ��ѯ
     * @param name
     * @return
     */
    FilmSchedule queryName(String name);

    /**
     * �û���ҳ
     * @return
     */
    List<FilmScheduleVO> userPageHome();

    /**
     * �û���ҳid
     * @return
     */
    FilmScheduleVO userPageHomeId(Integer id);
}
