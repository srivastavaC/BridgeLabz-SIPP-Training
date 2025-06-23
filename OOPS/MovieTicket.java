public class MovieTicket {
    String MovieName;
    int SeatNumber;
    double Price;

    public MovieTicket(String MovieName, int SeatNumber, double Price) {
        this.MovieName = MovieName;
        this.SeatNumber = SeatNumber;
        this.Price = Price;
    }

    public void display() {
        System.out.println("Movie Name: " + MovieName);
        System.out.println("Seat Number: " + SeatNumber);
        System.out.println("Price: " + Price);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", 42, 12.99);
        ticket.display();
    }
}
