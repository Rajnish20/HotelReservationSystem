package com.magic.hotelreservation;

public class Hotels {
    private String name;
    private Integer weekendRate;
    private Integer weekdaysRate;

    public Hotels(String name, Integer weekdaysRate, Integer weekendRate) {
        this.name = name;
        this.weekendRate = weekendRate;
        this.weekdaysRate = weekdaysRate;
    }


    public String getName() {
        return name;
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
                '}';
    }
}
