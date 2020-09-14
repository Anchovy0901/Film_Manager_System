package entity;

import java.math.BigDecimal;

/**
 * ����ʵ��
 */
public class OrderVO {

    /**
     * �û�����
     */
    private String remarkName;

    /**
     * Ӱ������
     */
    private String cineplexName;

    /**
     * Ӱ������
     */
    private String movieName;

    /**
     * �����۸�
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
