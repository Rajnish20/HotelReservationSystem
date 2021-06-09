package com.magic.hotelreservation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Hotel Reservation");

        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110, 90, 80, 80, 3);
        operations.addHotel("BridgeWood", 150, 50, 50, 110, 4);
        operations.addHotel("RidgeWood", 220, 150, 40, 100, 5);
        List<String> dates = Arrays.asList("11/9/2020", "12/9/2020");
        Response cheapestHotel = operations.findCheapestHotel(dates, "Special");
        System.out.println(cheapestHotel);
        Response cheapestHotel1 = operations.findCheapestHotel(dates, "Regular");
        System.out.println(cheapestHotel1);
        Response bestRatedHotel = operations.findBestRatedHotel(dates, "Regular");
        System.out.println(bestRatedHotel);
        Response bestRatedHotel1 = operations.findBestRatedHotel(dates, "Special");
        System.out.println(bestRatedHotel1);
    }
}
