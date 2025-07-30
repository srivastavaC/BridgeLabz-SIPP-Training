import java.util.*;
class Reservation<T> {
    String customerName;
    int tableNumber;
    String reservationTime;
    T branch;  

    Reservation(String customerName, int tableNumber, String reservationTime, T branch) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.reservationTime = reservationTime;
        this.branch = branch;
    }

    public String toString() {
        return "Customer: " + customerName + ", Table: " + tableNumber + ", Time: " +
               reservationTime + ", Branch: " + branch;
    }

   
    public String getKey() {
        return tableNumber + "@" + reservationTime;
    }
}


class ReservationManager<T> {
    private List<Reservation<T>> reservations = new ArrayList<>();
    private Set<String> reservedSlots = new HashSet<>();

    
    public void addReservation(String customerName, int tableNumber, String time, T branch) {
        String key = tableNumber + "@" + time;
        if (reservedSlots.contains(key)) {
            System.out.println("❌ Table " + tableNumber + " is already reserved at " + time);
            return;
        }

        Reservation<T> newReservation = new Reservation<>(customerName, tableNumber, time, branch);
        reservations.add(newReservation);
        reservedSlots.add(key);
        System.out.println("✅ Reservation added: " + newReservation);
    }

    
    public void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No upcoming reservations.");
            return;
        }

        System.out.println("📅 Upcoming Reservations:");
        for (Reservation<T> r : reservations) {
            System.out.println(r);
        }
    }
}


public class Resturant{
    public static void main(String[] args) {
        ReservationManager<String> manager = new ReservationManager<>();

        
        manager.addReservation("Anuraj", 5, "7:00 PM", "Noida Branch");
        manager.addReservation("Bobby", 2, "7:30 PM", "Gurgoan Branch");
        manager.addReservation("Chandan", 5, "7:00 PM", "Noida Branch"); 

        System.out.println();
        manager.viewReservations();
    }
}
