package com.magic.hotelreservation;

public class Hotels {
    private String name;
    private Integer weekendRate;
    private Integer weekdaysRate;
    private Integer weekendRateSpl;
    private Integer weekdayRateSpl;
    private Integer ratings;

    public Hotels(String name, Integer weekendRate, Integer weekdaysRate, Integer weekendRateSpl, Integer weekdayRateSpl, Integer ratings) {
        this.name = name;
        this.weekendRate = weekendRate;
        this.weekdaysRate = weekdaysRate;
        this.weekendRateSpl = weekendRateSpl;
        this.weekdayRateSpl = weekdayRateSpl;
        this.ratings = ratings;
    }

    public void setWeekendRateSpl(Integer weekendRateSpl) {
        this.weekendRateSpl = weekendRateSpl;
    }

    public void setWeekdayRateSpl(Integer weekdayRateSpl) {
        this.weekdayRateSpl = weekdayRateSpl;
    }

    public Integer getWeekendRateSpl() {
        return weekendRateSpl;
    }

    public Integer getWeekdayRateSpl() {
        return weekdayRateSpl;
    }

    public String getName() {
        return name;
    }

    public Integer getRatings() {
        return ratings;
    }

    public Integer getWeekendRate() {
        return weekendRate;
    }

    public Integer getWeekdaysRate() {
        return weekdaysRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public void setWeekendRate(Integer weekendRate) {
        this.weekendRate = weekendRate;
    }

    public void setWeekdaysRate(Integer weekdaysRate) {
        this.weekdaysRate = weekdaysRate;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "name='" + name + '\'' +
                ", weekendRate=" + weekendRate +
                ", weekdaysRate=" + weekdaysRate +
                ", ratings=" + ratings +
                '}';
    }
}
