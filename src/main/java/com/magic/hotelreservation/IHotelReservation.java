package com.magic.hotelreservation;

import java.util.List;

public interface IHotelReservation {
    void addHotel(String name, Integer weekendRate, Integer weekdaysRate, Integer weekendRateSpl, Integer weekdayRateSpl, Integer ratings);

    Response findCheapestHotel(List<String> dates, String customerType);

    Response findBestRatedHotel(List<String> dates, String customerType);

    int getSize();
}
