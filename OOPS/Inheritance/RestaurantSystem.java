class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}


interface Worker {
    void performDuties(); 
}


class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes in the kitchen.");
    }
}


class Waiter extends Person implements Worker {
    int tableNumber;

    Waiter(String name, int id, int tableNumber) {
        super(name, id);
        this.tableNumber = tableNumber;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving table number " + tableNumber + ".");
    }
}


public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Chandan", 101, "Indian");
        Waiter waiter = new Waiter("Sinha", 202, 5);

        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
