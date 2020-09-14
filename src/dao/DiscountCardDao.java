package dao;

import entity.DiscountCard;
import entity.MovieHall;

import java.util.List;

/**
 * ’€ø€ø®Dao≤„
 */
public interface DiscountCardDao {

    /**
     * ÃÌº”’€ø€ø®
     * @param discountCard
     */
    void add(DiscountCard discountCard);

    /**
     * –ﬁ∏ƒ’€ø€ø®
     * @param discountCard
     */
    void edit(DiscountCard discountCard);

    /**
     * …æ≥˝’€ø€ø®
     * @param id
     */
    void delete(Integer id);

    /**
     * ’€ø€ø®
     * @param id
     */
    DiscountCard queryById(Integer id);

    /**
     * ’€ø€ø®¡–±Ì
     * @return
     */
    List<DiscountCard> list();

    /**
     * ’€ø€ø®√˚≥∆≤È—Ø
     * @param name
     * @return
     */
    DiscountCard queryName(String name);
}
