public class Book {
    private String title;
    private String author;
    private String isbn;
    private String status;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = "available";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getStatus() {
        return status;
    }

    public void rentBook() {
        if ("available".equals(status)) {
            status = "rented";
        } else {
            System.out.println("Книга уже арендована.");
        }
    }

    public void returnBook() {
        status = "available";
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ") - Status: " + status;
    }
}
