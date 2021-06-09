package com.magic.hotelreservation;

import java.util.List;

public interface IHotelReservation {
    void addHotel(String name, Integer rate);

    Hotels findCheapestHotel(List<String> dates);

    int getSize();
}
