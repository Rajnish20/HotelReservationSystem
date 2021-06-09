import com.magic.hotelreservation.HotelReservation;
import com.magic.hotelreservation.Hotels;
import com.magic.hotelreservation.IHotelReservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HotelReservationTest {

    @Test
    public void givenNameAndRate_AddedToList_ShouldReturnSizeThree() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110);
        operations.addHotel("BridgeWood", 150);
        operations.addHotel("RidgeWood", 220);
        int size = operations.getSize();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void givenDates_ShouldReturnCheapestPrice() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110);
        operations.addHotel("BridgeWood", 160);
        operations.addHotel("RidgeWood", 220);
        List<String> dates = Arrays.asList("10/9/2020", "11/9/2020");
        Hotels hotel = operations.findCheapestHotel(dates);
        int price = hotel.getRate();
        System.out.println(hotel.toString());
        Assertions.assertEquals(220, price);
    }
}
