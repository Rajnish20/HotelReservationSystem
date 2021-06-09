package com.magic.hotelreservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;

public class HotelReservation implements IHotelReservation {

    List<Hotels> hotels = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

    @Override
    public void addHotel(String name, Integer weekendRate, Integer weekdaysRate, Integer weekendRateSpl, Integer weekdayRateSpl, Integer ratings) {
        hotels.add(new Hotels(name, weekendRate, weekdaysRate, weekendRateSpl, weekdayRateSpl, ratings));
    }

    @Override
    public Response findCheapestHotel(List<String> dates, String customerType) {
        List<String> days = new ArrayList<>();
        HashMap<String, Integer> hotelNameAndPrice = new HashMap<>();
        hotelNameAndPrice.put("LakeWood", 0);
        hotelNameAndPrice.put("BridgeWood", 0);
        hotelNameAndPrice.put("RidgeWood", 0);
        int price;
        String hotelName;
        for (String date : dates)
            days.add(LocalDate.parse(date, formatter).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US));
        for (String day : days) {
            if (day.equals("Sat") || day.equals("Sun")) {
                for (Hotels hotel : hotels) {
                    if (customerType.equals("Regular")) {
                        price = hotel.getWeekendRate();
                    } else {
                        price = hotel.getWeekendRateSpl();
                    }
                    hotelName = hotel.getName();
                    hotelNameAndPrice.put(hotelName, hotelNameAndPrice.get(hotelName) + price);
                }
            } else {
                for (Hotels hotel : hotels) {
                    if (customerType.equals("Regular")) {
                        price = hotel.getWeekdaysRate();
                    } else {
                        price = hotel.getWeekdayRateSpl();
                    }
                    hotelName = hotel.getName();
                    hotelNameAndPrice.put(hotelName, hotelNameAndPrice.get(hotelName) + price);

                }
            }
        }
        Map.Entry<String, Integer> minimumPrice = Collections.min(hotelNameAndPrice.entrySet(),
                Map.Entry.comparingByValue());

        List<String> cheapestHotelsName = new ArrayList<>();
        for (Map.Entry<String, Integer> set :
                hotelNameAndPrice.entrySet()) {
            if (set.getValue().equals(minimumPrice.getValue())) {
                cheapestHotelsName.add(set.getKey());
            }
        }

        Response cheapestHotel = new Response();
        cheapestHotel.setTotalPrice(minimumPrice.getValue());
        cheapestHotel.setRatings(0);
        for (int i = 0; i < cheapestHotelsName.size(); i++) {
            int finalI = i;
            Hotels hotel1 = hotels.stream().filter(hotels2 -> hotels2.getName().equals(cheapestHotelsName.get(finalI))).findAny().orElse(null);
            assert hotel1 != null;
            if (hotel1.getRatings() > cheapestHotel.getRatings())
                cheapestHotel.setName(hotel1.getName());
            cheapestHotel.setRatings(hotel1.getRatings());
        }

        return cheapestHotel;
    }

    @Override
    public Response findBestRatedHotel(List<String> dates, String customerType) {
        List<String> days = new ArrayList<>();
        Response bestRatedHotel = new Response();
        bestRatedHotel.setTotalPrice(0);
        for (String date : dates)
            days.add(LocalDate.parse(date, formatter).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US));
        Hotels hotel = hotels.stream().max(Comparator.comparing(Hotels::getRatings)).get();
        for (String day : days) {
            if (day.equals("Sat") || day.equals("Sun")) {
                if (customerType.equals("Regular"))
                    bestRatedHotel.setTotalPrice(hotel.getWeekendRate() + bestRatedHotel.getTotalPrice());
                else
                    bestRatedHotel.setTotalPrice(hotel.getWeekendRateSpl() + bestRatedHotel.getTotalPrice());
            } else {
                if (customerType.equals("Regular"))
                    bestRatedHotel.setTotalPrice(hotel.getWeekdaysRate() + bestRatedHotel.getTotalPrice());
                else
                    bestRatedHotel.setTotalPrice(hotel.getWeekdayRateSpl() + bestRatedHotel.getTotalPrice());
            }
        }
        bestRatedHotel.setName(hotel.getName());
        bestRatedHotel.setRatings(hotel.getRatings());
        return bestRatedHotel;
    }

    @Override
    public int getSize() {
        return this.hotels.size();
    }
}
