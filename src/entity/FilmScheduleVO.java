package entity;

import java.math.BigDecimal;

public class FilmScheduleVO {

    /**
     * ��Ƭ���
     */
    private Integer id;

    /**
     * Ӱ��
     */
    private String cineplexName;

    /**
     * Ӱ��id
     */
    private Integer cineplexId;

    /**
     * Ӱ��
     */
    private String movieHallName;

    /**
     * Ӱ��id
     */
    private Integer movieHallId;

    /**
     * ��Ӱ
     */
    private String film;

    /**
     * ��Ӱid
     */
    private Integer filmId;

    /**
     * Ʊ��
     */
    private BigDecimal ticketRates;

    /**
     * ��ӳʱ��
     */
    private String startTime;

    /**
     * ����ʱ��
     */
    private String endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCineplexName() {
        return cineplexName;
    }

    public void setCineplexName(String cineplexName) {
        this.cineplexName = cineplexName;
    }

    public Integer getCineplexId() {
        return cineplexId;
    }

    public void setCineplexId(Integer cineplexId) {
        this.cineplexId = cineplexId;
    }

    public String getMovieHallName() {
        return movieHallName;
    }

    public void setMovieHallName(String movieHallName) {
        this.movieHallName = movieHallName;
    }

    public Integer getMovieHallId() {
        return movieHallId;
    }

    public void setMovieHallId(Integer movieHallId) {
        this.movieHallId = movieHallId;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
