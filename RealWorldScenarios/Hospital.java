import java.util.*;
class Appointment<T> {
    String patientName;
    String doctorOrServiceName;
    String timeSlot;
    T type;  

    Appointment(String patientName, String doctorOrServiceName, String timeSlot, T type) {
        this.patientName = patientName;
        this.doctorOrServiceName = doctorOrServiceName;
        this.timeSlot = timeSlot;
        this.type = type;
    }

    public String toString() {
        return "Patient: " + patientName + ", With: " + doctorOrServiceName +
                ", Time: " + timeSlot + ", Type: " + type;
    }
}


class AppointmentManager<T> {
    Queue<Appointment<T>> queue = new LinkedList<>();

   
    void addAppointment(String patientName, String doctorOrServiceName, String timeSlot, T type) {
        Appointment<T> appt = new Appointment<>(patientName, doctorOrServiceName, timeSlot, type);
        queue.add(appt);
        System.out.println("Appointment booked: " + appt);
    }

    
    void serveNext() {
        if (queue.isEmpty()) {
            System.out.println("No appointments to serve.");
        } else {
            Appointment<T> next = queue.poll();
            System.out.println("Serving Appointment: " + next);
        }
    }

   
    void viewNext() {
        if (queue.isEmpty()) {
            System.out.println("No upcoming appointments.");
        } else {
            System.out.println("Next Appointment: " + queue.peek());
        }
    }

    
    void showAll() {
        if (queue.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            System.out.println("All Scheduled Appointments:");
            for (Appointment<T> appt : queue) {
                System.out.println(appt);
            }
        }
    }
}


public class Hospital {
    public static void main(String[] args) {
        
        AppointmentManager<String> hospitalQueue = new AppointmentManager<>();

      
        hospitalQueue.addAppointment("Alice", "Dr. Smith", "10:00 AM", "Doctor");
        hospitalQueue.addAppointment("Bob", "Dr. Khan", "10:30 AM", "Doctor");
        hospitalQueue.addAppointment("Charlie", "Lab Technician", "11:00 AM", "Lab Test");

        System.out.println();
        hospitalQueue.showAll();

        
        System.out.println();
        hospitalQueue.viewNext();

        
        System.out.println();
        hospitalQueue.serveNext();
        hospitalQueue.serveNext();

        
        System.out.println();
        hospitalQueue.showAll();
    }
}
