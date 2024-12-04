package Main;

import HotelBooking.Booking;
import HotelBooking.ResourceManager;
import HotelBooking.Room;

public class Main {
    public static void main(String[] args) {
        // Access the Singleton instance
        ResourceManager resourceManager1 = ResourceManager.getInstance();
        ResourceManager resourceManager2 = ResourceManager.getInstance();

        // Example usage
        Room room = resourceManager1.availableRooms.get(0);
        Booking booking = new Booking(room, "Jane Doe");
        resourceManager2.currentBookings.add(booking);

        // Demonstrating that both resourceManager1 and resourceManager2 are the same instance
        System.out.println("Available Rooms: " + resourceManager1.availableRooms.size());
        System.out.println("Current Bookings: " + resourceManager1.currentBookings.size());
    }
}

