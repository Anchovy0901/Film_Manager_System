package entity;

/**
 * ������Ϣ��
 */
public class Awards {

    /**
     * ������
     */
    private Integer id;

    /**
     * ��������
     */
    private String awardsName;

    /**
     * ����
     */
    private String periods;

    /**
     * �����
     */
    private String year;

    /**
     * �ٰ�ص�
     */
    private String site;

    /**
     * ��Ա���
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
