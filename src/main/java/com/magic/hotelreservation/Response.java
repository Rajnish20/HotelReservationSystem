package com.magic.hotelreservation;

public class Response {
    private String name;
    private Integer totalPrice;
    private Integer ratings;

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", totalPrice=" + totalPrice + "$" +
                ", ratings=" + ratings +
                '}';
    }
}
