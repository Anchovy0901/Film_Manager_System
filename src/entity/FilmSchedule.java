package entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * ��Ӱ��Ƭʵ��
 */
public class FilmSchedule {

    /**
     * ��Ƭ���
     */
    private Integer id;

    /**
     * Ӱ�Ǳ��
     */
    private Integer cineplexId;

    /**
     * Ӱ�����
     */
    private Integer movieHallId;

    /**
     * ��Ӱ���
     */
    private Integer filmId;

    /**
     * Ʊ��
     */
    private BigDecimal ticketRates;

    /**
     * ��ӳʱ��
     */
    private LocalDateTime startTime;

    /**
     * ����ʱ��
     */
    private LocalDateTime endTime;

    /**
     * �ۿۿ����
     */
    private Integer discountCardId;
}
