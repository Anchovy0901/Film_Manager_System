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
    private Long startTime;

    /**
     * 结束时间
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
