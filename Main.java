public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java Programming", "John Doe", "1234567890"));
        library.addBook(new Book("Learn Java", "Jane Smith", "0987654321"));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "1122334455"));

        Librarian librarian = new Librarian("Mark");
        librarian.displayBooks(library);

        Reader reader = new Reader("Alice");
        Book book1 = library.getBooks().get(0);
        Book book2 = library.getBooks().get(1);

        reader.rentBook(book1);
        reader.rentBook(book2);

        Book book3 = library.getBooks().get(2);
        reader.rentBook(book3);

        reader.returnBook(book1);

        reader.rentBook(book1);

        System.out.println("\nПоиск книг по запросу 'Java':");
        for (Book book : library.searchBooks("Java")) {
            System.out.println(book);
        }
    }
}
