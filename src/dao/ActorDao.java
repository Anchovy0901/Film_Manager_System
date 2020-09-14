package dao;

import entity.Actor;
import entity.ActorVO;
import entity.DiscountCard;

import java.util.List;

/**
 * ��Աdao��
 */
public interface ActorDao {

    /**
     * �������Ա
     * @param actor
     */
    void add(Actor actor);

    /**
     * �޸���Ա
     * @param actor
     */
    void edit(Actor actor);

    /**
     * ɾ����Ա
     * @param id
     */
    void delete(Integer id);

    /**
     * ��Ա
     * @param id
     */
    Actor queryById(Integer id);

    /**
     * ��Ա�б�
     * @return
     */
    List<ActorVO> list();

    /**
     * ��Ա���Ʋ�ѯ
     * @param name
     * @return
     */
    Actor queryName(String name);
}
