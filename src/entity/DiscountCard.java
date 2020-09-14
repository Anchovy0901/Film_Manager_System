package entity;

import java.math.BigDecimal;

/**
 * 则扣卡表实体
 */
public class DiscountCard {

    /**
     * 折扣卡编号
     */
    private Integer id;

    /**
     * 折扣卡名称
     */
    private String name;

    /**
     * 则扣
     */
    private BigDecimal discount;

    /**
     * 影城编号
     */
    private Integer cineplexId;

    /**
     * 办卡金额
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
