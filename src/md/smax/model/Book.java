package md.smax.model;

public class Book {
//    Fields
    private String title;
    private String author;
    private int year;
    private String genre;

//    Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

//    Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getGenre() {
        return this.genre;
    }

//    Methods
    public String getBookInfo() {
        return "Book " + this.title + " written by " + this.author + " in " + this.year + ". Genre: " + this.genre;
    }
}
