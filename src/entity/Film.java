package entity;

/**
 * 电影实体
 */
public class Film {

    /**
     * 电影编号
     */
    private Integer id;

    /**
     * 电影名称
     */
    private String name;

    /**
     * 电影类型
     */
    private String category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
