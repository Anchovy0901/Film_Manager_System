package entity;

import java.math.BigDecimal;

/**
 * ����ʵ��
 */
public class Order {

    /**
     * �������
     */
    private Integer id;

    /**
     * �û����
     */
    private Integer userId;

    /**
     * Ӱ�Ǳ��
     */
    private Integer cineplesId;

    /**
     * Ӱ�����
     */
    private Integer movieHallId;

    /**
     * ������
     */
    private BigDecimal price;

    /**
     * ����
     */
    private BigDecimal score;

    /**
     * ��������
     */
    private String remark;
}
