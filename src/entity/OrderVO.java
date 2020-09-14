package entity;

import java.math.BigDecimal;

/**
 * 订单实体
 */
public class OrderVO {

    /**
     * 用户名称
     */
    private String remarkName;

    /**
     * 影城名称
     */
    private String cineplexName;

    /**
     * 影厅名称
     */
    private String movieName;

    /**
     * 订单价格
     */
    private BigDecimal price;

    /**
     * 评分
     */
    private BigDecimal score;

    /**
     * 评论内容
     */
    private String remark;


    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }

    public String getCineplexName() {
        return cineplexName;
    }

    public void setCineplexName(String cineplexName) {
        this.cineplexName = cineplexName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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
