public class Books{
    String title;
    String author;
    double price;

    
    public Books() {
      this.title = "Unknown";
       this.author = "Unknown";
        this.price = 0.0;
    }

    
    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}