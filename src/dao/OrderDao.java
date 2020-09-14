package dao;

import entity.Order;
import entity.OrderVO;
import entity.User;

import java.util.List;

/**
 * 订单dao层
 */
public interface OrderDao {

    /**
     * 订单列表
     * @return
     */
    List<OrderVO> orderList();

    /**
     * 新增订单
     * @param order
     */
    void add(Order order);
}
