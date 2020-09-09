package entity;

import java.math.BigDecimal;

/**
 * 订单实体
 */
public class Order {

    /**
     * 订单编号
     */
    private Integer id;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 影城编号
     */
    private Integer cineplesId;

    /**
     * 影厅编号
     */
    private Integer movieHallId;

    /**
     * 付款金额
     */
    private BigDecimal price;

    /**
     * 评分
     */
    private BigDecimal score;

    /**
     * 评价内容
     */
    private String remark;
}
