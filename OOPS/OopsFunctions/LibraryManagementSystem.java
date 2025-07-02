interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}


abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrower; 

  
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = null;
    }

    
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    
    protected String getBorrower() {
        return borrower;
    }

    
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Reserved: " + (isReserved ? "Yes, by " + borrower : "No"));
    }

    
    public abstract int getLoanDuration();

   
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrower = borrowerName;
            System.out.println(title + " reserved by " + borrowerName);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}


class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; 
    }
}


class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }
}


class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; 
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("B001", "The Alchemist", "Paulo Coelho");
        items[1] = new Magazine("M101", "National Geographic", "Various");
        items[2] = new DVD("D202", "Interstellar", "Christopher Nolan");

        System.out.println("=== Library Inventory ===\n");

        for (LibraryItem item : items) {
            item.getItemDetails();
            item.reserveItem("Alice");
            System.out.println("Available: " + (item.checkAvailability() ? "Yes" : "No"));
            System.out.println("-------------------------\n");
        }
    }
}
