import java.util.Calendar;

/**
 * Created by badkass on 7/19/2017.
 */
public class Book {
    private String bookName;
    private String author;
    private long isbn;
    private double price;
    private Calendar dateOfPublish;

    public Book() {
    }

    public Book(String bookName, String author, long isbn, double price, Calendar dateOfPublish) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.dateOfPublish = dateOfPublish;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Calendar getDateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(Calendar dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                ", dateOfPublish=" + dateOfPublish +
                '}';
    }
}
