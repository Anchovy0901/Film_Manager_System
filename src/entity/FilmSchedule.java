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
    private Long startTime;

    /**
     * ����ʱ��
     */
    private Long endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCineplexId() {
        return cineplexId;
    }

    public void setCineplexId(Integer cineplexId) {
        this.cineplexId = cineplexId;
    }

    public Integer getMovieHallId() {
        return movieHallId;
    }

    public void setMovieHallId(Integer movieHallId) {
        this.movieHallId = movieHallId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public BigDecimal getTicketRates() {
        return ticketRates;
    }

    public void setTicketRates(BigDecimal ticketRates) {
        this.ticketRates = ticketRates;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
