import java.util.*;


class PetInfo<T> {
    T type;            
    int age;
    boolean isAdopted;

    PetInfo(T type, int age, boolean isAdopted) {
        this.type = type;
        this.age = age;
        this.isAdopted = isAdopted;
    }

    public String toString() {
        return "Type: " + type + ", Age: " + age + ", Adopted: " + isAdopted;
    }
}


class PetAdoption<T> {
    List<PetInfo<T>> pets = new ArrayList<>();

    void addPet(T type, int age, boolean isAdopted) {
        PetInfo<T> newPet = new PetInfo<>(type, age, isAdopted);
        pets.add(newPet);
    }

    
    void showAllPets() {
        for (PetInfo<T> p : pets) {
            System.out.println(p);
        }
    }

   
    void filterPets(T type, int maxAge) {
        System.out.println("Available " + type + "s age <= " + maxAge + ":");
        for (PetInfo<T> p : pets) {
            if (!p.isAdopted && p.type.equals(type) && p.age <= maxAge) {
                System.out.println(p);
            }
        }
    }
}




public class Pet {
    public static void main(String[] args) {
        PetAdoption<String> portal = new PetAdoption<>();

        
        portal.addPet("Dog", 2, false);
        portal.addPet("Cat", 1, false);
        portal.addPet("Dog", 5, true);
        portal.addPet("Bird", 1, false);
        portal.addPet("Cat", 3, true);

        
        System.out.println("All Pets:");
        portal.showAllPets();

        
        System.out.println();
        portal.filterPets("Dog", 3);
    }
}
