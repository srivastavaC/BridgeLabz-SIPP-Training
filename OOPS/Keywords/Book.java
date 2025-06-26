public class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn; // final variable
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("This is not a valid Book instance.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "978-0451524935");
        book1.displayLibraryName();
        book1.displayBookDetails();

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        book2.displayLibraryName();
        book2.displayBookDetails();
    }
}