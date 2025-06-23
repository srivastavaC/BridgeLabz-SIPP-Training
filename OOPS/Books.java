public class Books {
    String title;
    String author;
    double price;
    public Books(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Title:"+ title);
        System.out.println("Author:"+ author);
        System.out.println("Price:"+ price);
    }
}
