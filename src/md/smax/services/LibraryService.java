package md.smax.services;
import md.smax.model.Book;

public class LibraryService {
//    Vars
    private Book[] books = new Book[10];
    private int bookCount = 0;

//    Methods
    public void addBook(Book book) {
        if (bookCount < books.length ) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full");
        }
    }

    public void listBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].getBookInfo());
        }
    }

    public void searchByTitle(String title) {
        boolean bookFound = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println(books[i].getBookInfo());
                bookFound = true;
            }
        }
        if (!bookFound) {
            System.out.println("We don't have book - " + "'" + title + "'");
        }
    }

    public void searchByAuthor(String author) {
        boolean authorFound = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i].getBookInfo());
                authorFound = true;
            }
        }
        if (!authorFound) {
            System.out.println("We don't have books of " + author);
        }
    }

    public void searchByGenre(String genre) {
        boolean genreFound = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getGenre().equals(genre)) {
                System.out.println(books[i].getBookInfo());
                genreFound = true;
            }
        }
        if (!genreFound) {
            System.out.println("We don't have books of " + genre + " genre");
        }
    }
}