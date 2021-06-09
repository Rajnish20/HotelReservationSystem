import com.magic.hotelreservation.HotelReservation;
import com.magic.hotelreservation.IHotelReservation;
import com.magic.hotelreservation.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HotelReservationTest {

    @Test
    public void givenNameAndRate_AddedToList_ShouldReturnSizeThree() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110, 90, 80, 80, 3);
        operations.addHotel("BridgeWood", 150, 50, 50, 110, 4);
        operations.addHotel("RidgeWood", 220, 150, 40, 100, 5);
        int size = operations.getSize();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void givenDatesForRegularCustomer_ShouldReturnBestRatedCheapestPrice() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110, 90, 80, 80, 3);
        operations.addHotel("BridgeWood", 150, 50, 50, 110, 4);
        operations.addHotel("RidgeWood", 220, 150, 40, 100, 5);
        List<String> dates = Arrays.asList("11/9/2020", "12/9/2020");
        Response hotel = operations.findCheapestHotel(dates, "Regular");
        Assertions.assertEquals(200, hotel.getTotalPrice());
    }

    @Test
    public void givenDatesForSpecialCustomer_ShouldReturnBestRatedCheapestPrice() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110, 90, 80, 80, 3);
        operations.addHotel("BridgeWood", 150, 50, 50, 110, 4);
        operations.addHotel("RidgeWood", 220, 150, 40, 100, 5);
        List<String> dates = Arrays.asList("11/9/2020", "12/9/2020");
        Response hotel = operations.findCheapestHotel(dates, "Special");
        Assertions.assertEquals(140, hotel.getTotalPrice());
    }

    @Test
    public void givenDatesForSpecialCustomer_ShouldReturnBestRatedPrice() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110, 90, 80, 80, 3);
        operations.addHotel("BridgeWood", 150, 50, 50, 110, 4);
        operations.addHotel("RidgeWood", 220, 150, 40, 100, 5);
        List<String> dates = Arrays.asList("11/9/2020", "12/9/2020");
        Response hotel = operations.findBestRatedHotel(dates, "Special");
        Assertions.assertEquals(140, hotel.getTotalPrice());
    }

    @Test
    public void givenDatesForRegularCustomer_ShouldReturnBestRatedPrice() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110, 90, 80, 80, 3);
        operations.addHotel("BridgeWood", 150, 50, 50, 110, 4);
        operations.addHotel("RidgeWood", 220, 150, 40, 100, 5);
        List<String> dates = Arrays.asList("11/9/2020", "12/9/2020");
        Response hotel = operations.findBestRatedHotel(dates, "Regular");
        Assertions.assertEquals(370, hotel.getTotalPrice());
    }


}
