package entity;

/**
 * 影城信息实体
 */
public class Cineplex {

    /**
     * 影城编号
     */
    private Integer id;

    /**
     * 影城内容
     */
    private String remark;

    /**
     * 影城地址
     */
    private String address;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 特色服务
     */
    private String characteristicService;

    /**
     * 影城名称
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCharacteristicService() {
        return characteristicService;
    }

    public void setCharacteristicService(String characteristicService) {
        this.characteristicService = characteristicService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
