package entity;

/**
 * ��Ӱʵ��
 */
public class Film {

    /**
     * ��Ӱ���
     */
    private Integer id;

    /**
     * ��Ӱ����
     */
    private String name;

    /**
     * ��Ӱ����
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
