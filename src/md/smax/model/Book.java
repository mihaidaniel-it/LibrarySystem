package md.smax.model;

public class Book {
//    Fields
    private String title;
    private String author;
    private int year;
    private String genre;

//    Setters
    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

//    Getters
    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    int getYear() {
        return this.year;
    }

    String getGenre() {
        return this.genre;
    }

//    Methods
    public String getBookInfo() {
        System.out.println("Book " + this.title + " written by " + this.author + " in " + this.year + ". Genre: " + this.genre);
    }
}
