package entity;

/**
 * Ӱ����Ϣʵ��
 */
public class Cineplex {

    /**
     * Ӱ�Ǳ��
     */
    private Integer id;

    /**
     * Ӱ������
     */
    private String remark;

    /**
     * Ӱ�ǵ�ַ
     */
    private String address;

    /**
     * ��ϵ��ʽ
     */
    private String phone;

    /**
     * ��ɫ����
     */
    private String characteristicService;

    /**
     * Ӱ������
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
