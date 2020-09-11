package dao;

import entity.Cineplex;
import entity.MovieHall;

import java.util.List;

/**
 * Ӱ��dao��
 */
public interface MovieHallDao {

    /**
     * ���Ӱ��
     * @param movieHall
     */
    void add(MovieHall movieHall);

    /**
     * �޸�Ӱ��
     * @param movieHall
     */
    void edit(MovieHall movieHall);

    /**
     * ɾ��Ӱ��
     * @param id
     */
    void delete(Integer id);

    /**
     * Ӱ��
     * @param id
     */
    MovieHall queryById(Integer id);

    /**
     * Ӱ���б�
     * @return
     */
    List<MovieHall> list();

    /**
     * Ӱ�����Ʋ�ѯ
     * @param name
     * @return
     */
    MovieHall queryName(String name);
}
