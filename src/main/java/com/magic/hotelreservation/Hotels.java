package com.magic.hotelreservation;

public class Hotels {
    private String name;
    private Integer rate;

    public Hotels(String name, Integer rate) {
        this.name = name;
        this.rate = rate;
    }


    public String getName() {
        return name;
    }

    public Integer getRate() {
        return rate;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return "Hotels{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
