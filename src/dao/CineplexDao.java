package dao;

import entity.Cineplex;

import java.util.List;

/**
 * Ӱ�ǹ���dao��
 */
public interface CineplexDao {

    /**
     * ���Ӱ��
     * @param cineplex
     */
    void add(Cineplex cineplex);

    /**
     * �޸�Ӱ��
     * @param cineplex
     */
    void edit(Cineplex cineplex);

    /**
     * ɾ��Ӱ��
     * @param id
     */
    void delete(Integer id);

    /**
     * ӰԺӰ��
     * @param id
     */
    Cineplex queryById(Integer id);

    /**
     * Ӱ���б�
     * @return
     */
    List<Cineplex> list();

    /**
     * Ӱ�����Ʋ�ѯ
     * @param name
     * @return
     */
    Cineplex queryName(String name);
}
