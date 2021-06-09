package com.magic.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation implements IHotelReservation{

    List<Hotels> hotels = new ArrayList<>();
    @Override
    public void addHotel(String name, Integer rate) {
        hotels.add(new Hotels(name, rate));
    }

    @Override
    public Hotels findCheapestHotel(List<String> dates) {
        Hotels hotel = hotels.get(0);
        for (int i = 1; i < hotels.size(); i++) {
            if (hotel.getRate() > hotels.get(i).getRate())
                hotel = hotels.get(i);
        }
        int price = dates.size() * hotel.getRate();
        return new Hotels(hotel.getName(),price);
    }


    @Override
    public int getSize() {
        return this.hotels.size();
    }
}
