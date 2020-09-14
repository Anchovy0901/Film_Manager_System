package entity;

import java.time.LocalDateTime;

/**
 * 演员实体
 */
public class Actor {

    /**
     * 演员编号
     */
    private Integer id;

    /**
     * 演员名称
     */
    private String name;

    /**
     * 演员性别
     */
    private String sex;

    /**
     * 国家
     */
    private String nation;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 从业经历
     */
    private String remark;


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
