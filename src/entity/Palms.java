package entity;

/**
 * �񽱼�¼ʵ��
 */
public class Palms {

    /**
     * �񽱱��
     */
    private Integer id;

    /**
     * ��Ա���
     */
    private Integer actorId;

    /**
     * �����
     */
    private String category;

    /**
     * �񽱼���
     */
    private String level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
