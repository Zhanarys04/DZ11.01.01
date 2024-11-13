import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> rentedBooks;
    private static final int MAX_RENTAL_LIMIT = 3;

    public Reader(String name) {
        this.name = name;
        this.rentedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void rentBook(Book book) {
        if (rentedBooks.size() < MAX_RENTAL_LIMIT) {
            if ("available".equals(book.getStatus())) {
                book.rentBook();
                rentedBooks.add(book);
                System.out.println(name + " арендовал книгу: " + book.getTitle());
            } else {
                System.out.println("Книга " + book.getTitle() + " уже арендована.");
            }
        } else {
            System.out.println(name + " достиг лимита по аренде книг.");
        }
    }

    public void returnBook(Book book) {
        if (rentedBooks.contains(book)) {
            book.returnBook();
            rentedBooks.remove(book);
            System.out.println(name + " вернул книгу: " + book.getTitle());
        } else {
            System.out.println(name + " не арендовал эту книгу.");
        }
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }
}
