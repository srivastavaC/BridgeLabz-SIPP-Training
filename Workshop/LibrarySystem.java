import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibrarySystem {
    private List<Book> books;
    public static class BookNotAvailableException extends Exception {
        public BookNotAvailableException(String message) {
            super(message);
        }
    }

    public LibrarySystem() {
        books = new ArrayList<>();
    }
    
    
    class Book {
        private String title;
        private String author;
        private String status;
    
        public Book(String title, String author, String status) {
            this.title = title;
            this.author = author;
            this.status = status;
        }
    
        public String getTitle() {
            return title;
        }
    
        public String getAuthor() {
            return author;
        }
    
        public String getStatus() {
            return status;
        }
    
        public void setStatus(String status) {
            this.status = status;
        }
    
        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", Status: " + status;
        }
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author, "available"));
    }

    public void searchBooks(String partialTitle) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(partialTitle.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public void checkoutBook(String title) throws BookNotAvailableException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getStatus().equals("available")) {
                    book.setStatus("checked out");
                    System.out.println("You have checked out: " + book.getTitle());
                    return;
                } else {
                    throw new BookNotAvailableException("The book '" + title + "' is currently unavailable.");
                }
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.addBook("1984", "George Orwell");
        library.addBook("To Kill a Mockingbird", "Harper Lee");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a partial title to search: ");
        String searchQuery = scanner.nextLine();
        library.searchBooks(searchQuery);

        System.out.print("Enter a book title to check out: ");
        String checkoutTitle = scanner.nextLine();
        
        try {
            library.checkoutBook(checkoutTitle);
        } catch (BookNotAvailableException e) {
            System.err.println(e.getMessage());
        }

        library.displayBooks();
    }

}
