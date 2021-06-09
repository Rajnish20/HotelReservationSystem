package com.magic.hotelreservation;

import java.util.List;

public interface IHotelReservation {
    void addHotel(String name, Integer weekdaysRate,Integer weekendRate);

    int getSize();
}
