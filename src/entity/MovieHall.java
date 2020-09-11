package entity;

/**
 * 影厅信息实体
 */
public class MovieHall {

    /**
     * 影厅编号
     */
    private Integer id;

    /**
     * 影厅名称
     */
    private String name;

    /**
     * 影城编号
     */
    private Integer cineplexId;

    /**
     * 座位数
     */
    private Integer tableNum;

    /**
     * 是否坐满
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
