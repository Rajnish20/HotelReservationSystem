package com.magic.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation implements IHotelReservation{

    List<Hotels> hotels = new ArrayList<>();
    @Override
    public void addHotel(String name, Integer weekdaysRate,Integer weekendRate){
        hotels.add(new Hotels(name, weekdaysRate,weekendRate));
    }


    @Override
    public int getSize() {
        return this.hotels.size();
    }
}
