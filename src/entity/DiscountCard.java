package entity;

import java.math.BigDecimal;

/**
 * ��ۿ���ʵ��
 */
public class DiscountCard {

    /**
     * �ۿۿ����
     */
    private Integer id;

    /**
     * �ۿۿ�����
     */
    private String name;

    /**
     * ���
     */
    private BigDecimal discount;

    /**
     * Ӱ�Ǳ��
     */
    private Integer cineplexId;

    /**
     * �쿨���
     */
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getCineplexId() {
        return cineplexId;
    }

    public void setCineplexId(Integer cineplexId) {
        this.cineplexId = cineplexId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
