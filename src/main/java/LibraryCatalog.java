public class LibraryCatalog {
    public Book[] books = new Book[3];
    int length = books.length;

    public void listAllBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book #" + (i+1) + " name is " + books[i].getName());
        }
    }

    public void addBooks(Book books, int index) {
        if (index >= length) {
            System.out.println("Library is full.");

        } else {
            this.books[index] = books;
        }
    }
        public void deleteAllBooks ( int deleteThisBook){
            if (deleteThisBook >= length) {
                System.out.println("Book " + deleteThisBook + " exceeds our library dimensions.");

            } else if (deleteThisBook < length) {
                System.out.println("Book " + books[deleteThisBook].getName() + " has been deleted.");
                books[deleteThisBook] = null;
            }


        }
    }
