package entity;

import java.time.LocalDateTime;

/**
 * ��Աʵ��
 */
public class Actor {

    /**
     * ��Ա���
     */
    private Integer id;

    /**
     * ��Ա����
     */
    private String name;

    /**
     * ��Ա�Ա�
     */
    private String sex;

    /**
     * ����
     */
    private String nation;

    /**
     * ����
     */
    private String birthday;

    /**
     * ��ҵ����
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
