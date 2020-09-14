package dao;

import entity.Actor;
import entity.Awards;

import java.util.List;

/**
 * ����Dao��
 */
public interface AwardsDao {

    /**
     * ��ӽ���
     * @param awards
     */
    void add(Awards awards);

    /**
     * �޸Ľ���
     * @param awards
     */
    void edit(Awards awards);

    /**
     * ɾ������
     * @param id
     */
    void delete(Integer id);

    /**
     * ������Աidɾ��
     * @param id
     */
    void deleteActorId(Integer id);

    /**
     * ����
     * @param id
     */
    Awards queryById(Integer id);

    /**
     * �����б�
     * @return
     */
    List<Awards> list();

    /**
     * �������Ʋ�ѯ
     * @param name
     * @return
     */
    Awards queryName(String name);
}
