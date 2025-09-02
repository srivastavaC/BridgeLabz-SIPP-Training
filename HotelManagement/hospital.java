import java.util.*;
class Person {
    protected String id;
    protected String name;
    protected int age;
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
class Doctor extends Person {
    private String specialization;
    public Doctor(String id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String toString() {
        return super.toString() + ", Specialization: " + specialization;
    }
}
class Patient extends Person {
    private String disease;

    public Patient(String id, String name, int age, String disease) {
        super(id, name, age);
        this.disease = disease;
    }
    public String getDisease() {
        return disease;
    }
    public String toString() {
        return super.toString() + ", Disease: " + disease;
    }
}