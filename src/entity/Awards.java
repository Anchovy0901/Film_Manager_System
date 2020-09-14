package entity;

/**
 * 奖项信息表
 */
public class Awards {

    /**
     * 奖项编号
     */
    private Integer id;

    /**
     * 奖项名称
     */
    private String awardsName;

    /**
     * 期数
     */
    private String periods;

    /**
     * 获奖年份
     */
    private String year;

    /**
     * 举办地点
     */
    private String site;

    /**
     * 演员编号
     */
    private Integer actorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAwardsName() {
        return awardsName;
    }

    public void setAwardsName(String awardsName) {
        this.awardsName = awardsName;
    }

    public String getPeriods() {
        return periods;
    }

    public void setPeriods(String periods) {
        this.periods = periods;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }
}
