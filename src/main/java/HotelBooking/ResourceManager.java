package HotelBooking;

import java.util.ArrayList;
import java.util.List;

public class ResourceManager {
    private static ResourceManager instance; // Singleton instance
    public List<Room> availableRooms;
    public List<Booking> currentBookings;

    // Private constructor to prevent instantiation
    private ResourceManager() {
        availableRooms = new ArrayList<>();
        currentBookings = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            availableRooms.add(new Room(i));
        }
    }

    // Public method to provide access to the singleton instance
    public static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }
}
