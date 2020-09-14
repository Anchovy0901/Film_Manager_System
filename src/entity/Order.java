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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCineplesId() {
        return cineplesId;
    }

    public void setCineplesId(Integer cineplesId) {
        this.cineplesId = cineplesId;
    }

    public Integer getMovieHallId() {
        return movieHallId;
    }

    public void setMovieHallId(Integer movieHallId) {
        this.movieHallId = movieHallId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
