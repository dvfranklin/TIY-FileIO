public class Book {

    private String title;
    private String author;
    private String genre;
    private String isbn;
    private String price;

    public Book(){

    }

    public Book(String title, String author, String genre, String isbn, String price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString(){
        return "Title: " + this.title + "\n" +
                "Author: " + this.author + "\n" +
                "Genre: " + this.genre + "\n" +
                "ISBN: " + this.isbn + "\n" +
                "Price: " + this.price + "\n";
    }
}
