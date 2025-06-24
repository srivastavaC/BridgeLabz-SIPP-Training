public class Hotel {
    String guestName;
    String roomType;
    int nights;

    
    public Hotel() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    
    public Hotel(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    
    public Hotel(Hotel booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}