class Doctor {
    private String name;
    private String specialty;
    private boolean availableOnWeekend;
    public Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name; this.specialty = specialty; this.availableOnWeekend = availableOnWeekend;
    }
    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
    public boolean isAvailableOnWeekend() { return availableOnWeekend; }
    public String toString() { return name + " - " + specialty; }
}

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Jones", "Orthopedics", false),
            new Doctor("Dr. Brown", "Dermatology", true),
            new Doctor("Dr. Taylor", "Neurology", true)
        );

        doctors.stream()
            .filter(Doctor::isAvailableOnWeekend)
            .sorted(Comparator.comparing(Doctor::getSpecialty))
            .forEach(System.out::println);
    }
}
