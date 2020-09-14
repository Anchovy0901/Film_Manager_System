package dao;

import entity.DiscountCard;
import entity.MovieHall;

import java.util.List;

/**
 * �ۿۿ�Dao��
 */
public interface DiscountCardDao {

    /**
     * ����ۿۿ�
     * @param discountCard
     */
    void add(DiscountCard discountCard);

    /**
     * �޸��ۿۿ�
     * @param discountCard
     */
    void edit(DiscountCard discountCard);

    /**
     * ɾ���ۿۿ�
     * @param id
     */
    void delete(Integer id);

    /**
     * �ۿۿ�
     * @param id
     */
    DiscountCard queryById(Integer id);

    /**
     * �ۿۿ��б�
     * @return
     */
    List<DiscountCard> list();

    /**
     * �ۿۿ����Ʋ�ѯ
     * @param name
     * @return
     */
    DiscountCard queryName(String name);
}
