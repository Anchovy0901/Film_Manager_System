package dao;

import entity.Film;
import entity.Palms;

import java.util.List;

/**
 * ��Ӱ����dao��
 */
public interface FilmDao {

    /**
     * ��ӵ�Ӱ
     * @param film
     */
    void add(Film film);

    /**
     * �޸ĵ�Ӱ
     * @param film
     */
    void edit(Film film);

    /**
     * ɾ����Ӱ
     * @param id
     */
    void delete(Integer id);

    /**
     * ��Ӱ
     * @param id
     */
    Film queryById(Integer id);

    /**
     * ��Ӱ�б�
     * @return
     */
    List<Film> list();

    /**
     * ��Ӱ��ѯ
     * @param name
     * @return
     */
    Film queryName(String name);
}
