
public class Book
{
    private String bookTitle;
    private String bookAuthor;
    private String yearPublish;
    private double price;
    private int counter;
    
    public Book (){}
    
    public Book (String bt, String a, String yp, double p, int c){
        this.bookTitle = bt;
        this.bookAuthor = a;
        this.yearPublish = yp;
        this.price = p;
        this.counter = c;
    }
    
    public void setBookTitle (String bookTitle ) { this.bookTitle = bookTitle;}
    public void setBookAuthor ( String bookAuthor ) { this.bookAuthor = bookAuthor;}
    public void setYearPublish ( String yearPublish ) { this.yearPublish = yearPublish;}
    public void setPrice ( double price ) { this.price = price; }
    public void setCounter ( int counter ) { this.counter = counter; }
    
    public String getBookTitle () {return this.bookTitle;}
    public String getBookAuthor () {return this.bookAuthor;}
    public String getYearPublish () {return this.yearPublish;}
    public double getPrice () {return this.price;}
    public int getCounter () {return this.counter;}
    
    public String toString (){
        return "\n\n Book Title : " + this.bookTitle + "\n" +
               " Book Author : " + this.bookAuthor + "\n" + 
               " Book Year Publish : " + this.yearPublish + "\n" +
               " Book Price  :RM " + this.price + "\n" ;
               
    }
    
    
}
