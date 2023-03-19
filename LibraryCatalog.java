package libraryCatalog;

public class LibraryCatalog {
    public Book[] books = new Book[3];

    public void listAllBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book #" + i + " name is " + books[i].getName());
        }
    }

    public void addBooks(Book books, int index) {
        this.books[index] = books;

    }

    public void deleteAllBooks(int deleteThisBook) {
        books[deleteThisBook] = null;
        System.out.println("Book " + deleteThisBook + " has been deleted.");

    }
}

