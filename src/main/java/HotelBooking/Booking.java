package HotelBooking;

public class Booking {
    private Room room;
    private String customerName;

    public Booking(Room room, String customerName) {
        this.room = room;
        this.customerName = customerName;
        room.setBooked(true);
    }
}
