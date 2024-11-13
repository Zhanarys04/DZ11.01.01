public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void displayBooks(Library library) {
        System.out.println("Список книг в библиотеке:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
