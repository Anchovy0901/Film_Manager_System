package entity;

/**
 * Ӱ����Ϣʵ��
 */
public class MovieHall {

    /**
     * Ӱ�����
     */
    private Integer id;

    /**
     * Ӱ������
     */
    private String name;

    /**
     * Ӱ�Ǳ��
     */
    private Integer cineplexId;

    /**
     * ��λ��
     */
    private Integer tableNum;

    /**
     * �Ƿ�����
     */
    private Boolean iMax;

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

    public Integer getCineplexId() {
        return cineplexId;
    }

    public void setCineplexId(Integer cineplexId) {
        this.cineplexId = cineplexId;
    }

    public Integer getTableNum() {
        return tableNum;
    }

    public void setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
    }

    public Boolean getiMax() {
        return iMax;
    }

    public void setiMax(Boolean iMax) {
        this.iMax = iMax;
    }
}
