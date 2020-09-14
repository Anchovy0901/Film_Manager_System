package entity;

/**
 * 获奖记录实体
 */
public class Palms {

    /**
     * 获奖编号
     */
    private Integer id;

    /**
     * 演员编号
     */
    private Integer actorId;

    /**
     * 获奖类别
     */
    private String category;

    /**
     * 获奖级别
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
