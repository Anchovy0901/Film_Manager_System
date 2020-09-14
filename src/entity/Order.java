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
