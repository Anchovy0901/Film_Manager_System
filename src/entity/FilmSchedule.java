package entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 电影排片实体
 */
public class FilmSchedule {

    /**
     * 排片编号
     */
    private Integer id;

    /**
     * 影城编号
     */
    private Integer cineplexId;

    /**
     * 影厅编号
     */
    private Integer movieHallId;

    /**
     * 电影编号
     */
    private Integer filmId;

    /**
     * 票价
     */
    private BigDecimal ticketRates;

    /**
     * 开映时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 折扣卡编号
     */
    private Integer discountCardId;
}
