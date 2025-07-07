package md.smax;
import md.smax.model.Book;
import md.smax.services.LibraryService;

public class Main {
    public static void main (String[] args) {
//        Create objects
        LibraryService libraryService = new LibraryService();

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

//        Data assignment
        book1.setTitle("Can't Hurt Me");
        book1.setAuthor("David Goggins");
        book1.setGenre("Motivation");
        book1.setYear(2018);

        book2.setTitle("Think and get Rich");
        book2.setAuthor("Napoleon Hill");
        book2.setGenre("Psychology");
        book2.setYear(1937);

        book3.setTitle("Rich dad Poor dad");
        book3.setAuthor("Robert Kiyosaki");
        book3.setGenre("Finance");
        book3.setYear(1997);

        libraryService.addBook(book1);
        libraryService.addBook(book2);
        libraryService.addBook(book3);

//        Output
        libraryService.listBooks();
        libraryService.searchByAuthor("David Goggins");
        libraryService.searchByTitle("Rich dad Poor dad");
        libraryService.searchByGenre("Psychology");

        libraryService.searchByAuthor("Daniel Mihai");
        libraryService.searchByTitle("Deep Work");
        libraryService.searchByGenre("Love");
    }
}
