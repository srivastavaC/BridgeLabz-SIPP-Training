import java.util.ArrayList;
import java.util.List;

public class Hospital {

    class Doctor {
        private String name;
        private List<Patient> patients;

        public Doctor(String name) {
            this.name = name;
            this.patients = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addPatient(Patient patient) {
            if (!patients.contains(patient)) {
                patients.add(patient);
                patient.addDoctor(this); 
            }
        }

        public void consult(Patient patient) {
            System.out.println("Dr. " + name + " is consulting patient " + patient.getName() + ".");
        }

        public void showPatients() {
            System.out.println("Dr. " + name + "'s Patients:");
            for (Patient p : patients) {
                System.out.println("- " + p.getName());
            }
        }
    }

    class Patient {
        private String name;
        private List<Doctor> doctors;

        public Patient(String name) {
            this.name = name;
            this.doctors = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addDoctor(Doctor doctor) {
            if (!doctors.contains(doctor)) {
                doctors.add(doctor);
                doctor.addPatient(this); 
            }
        }

        public void showDoctors() {
            System.out.println("Patient " + name + "'s Doctors:");
            for (Doctor d : doctors) {
                System.out.println("- Dr. " + d.getName());
            }
        }
    }

    
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doc1 = hospital.new Doctor("Smith");
        Doctor doc2 = hospital.new Doctor("Williams");

        Patient pat1 = hospital.new Patient("Alice");
        Patient pat2 = hospital.new Patient("Bob");

       
        doc1.addPatient(pat1);
        doc1.addPatient(pat2);
        doc2.addPatient(pat1); 

    
        doc1.consult(pat1);
        doc2.consult(pat1);

        
        doc1.showPatients();
        doc2.showPatients();

        pat1.showDoctors();
        pat2.showDoctors();
    }
}
