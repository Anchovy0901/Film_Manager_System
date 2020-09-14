package dao;

import entity.Actor;
import entity.Palms;

import java.util.List;

/**
 * �񽱼�¼Dao
 */
public interface PalmsDao {

    /**
     * ��ӻ񽱼�¼
     * @param palms
     */
    void add(Palms palms);

    /**
     * �޸Ļ񽱼�¼
     * @param palms
     */
    void edit(Palms palms);

    /**
     * ɾ���񽱼�¼
     * @param id
     */
    void delete(Integer id);

    /**
     * ������Աidɾ��
     * @param id
     */
    void deleteActorId(Integer id);

    /**
     * �񽱼�¼
     * @param id
     */
    Palms queryById(Integer id);

    /**
     * �񽱼�¼�б�
     * @return
     */
    List<Palms> list();

    /**
     * �񽱼�¼��ѯ
     * @param name
     * @return
     */
    Palms queryName(String name);

}
