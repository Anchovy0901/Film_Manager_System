package dao;

import entity.Order;
import entity.OrderVO;
import entity.User;

import java.util.List;

/**
 * ����dao��
 */
public interface OrderDao {

    /**
     * �����б�
     * @return
     */
    List<OrderVO> orderList();

    /**
     * ��������
     * @param order
     */
    void add(Order order);
}
