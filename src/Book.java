public class Book {
    String title;
    String author;
    double price;
    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String toString() {
        return "Title: " + title + ";" + " Author: " + author + ";" + " Price: " + price;
    }

    public static void main(String[] args) {
        Book b = new Book("David Copperfield", "Charles Dickens", 19.99);
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.toString());
    }

}
