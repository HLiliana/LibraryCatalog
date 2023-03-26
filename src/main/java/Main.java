/**
 * create a small application that mimics a library catalog. // library
 * There are 3 separate Book properties in the LibraryCatalog. // book
 * It needs to be able to add the 3 books, delete any of the books (set it to null) // add, delete
 * and list all of the books (one by one). // list
 * Books are of two kinds: novels and art albums. // novel , art album
 * They both have a name and number of pages. // name , number of pages
 * Novels have type (like mystery, sf, etc.) while albums have paper quality. // type , paper quality
 * Model these entities (book, novel, album) with different classes and inheritance.
 *
 * Nouns: libraryCatalog / book / novel / artAlbum / name / numberOfPages / type / paperQuality
 * Verbs : addBook / deleteBook / listAllBooks
 * NOTES
 * new Java project in IntelliJ
 * respect the package structure and class & property definitions
 * every implementation requirement will be in the main() method
 * use main method and console output to describe every operation
 */

/**
 * Adrian Bucur, Feedback:
 * la tema cu books, sterge te rog ultimele 2 metode de add (cele cu parametru novel si artalbum),
 * si foloseste addBook cu parametru parinte, Book
 * catalog.addBooks(new Novels("Baltagul", 488, "Mister"), 1);
 * si nu uita, cand apelezi metoda, sa pui si index-ul la care vrei sa salveze
 * si redenumeste clasele sa fie toate la singular, Novels = Novel, etc
 * sterge tot ce ai scris in romana
 * si resubmit. Spor
 * a, si fiecare clasa cu fisierul ei, inclusiv LibraryCatalog
 */

/**
 * Adrian Bucur: Feedback
 * Yey, all good.
 * Pro tip: you can add validations before adding a book (eg: already exists, library is full) // addValidationBefore
 * and before deleting (don't try to delete a book that is not there).  // beforeDeleting
 * But only if you find time
 */

public class Main {
        public static void main (String[] args) {
            LibraryCatalog catalog = new LibraryCatalog();
            catalog.addBooks(new Novel("Baltagul", 488, "Mister"), 0);
            catalog.addBooks(new Novel("Ion", 356, "Romance"), 1);
            catalog.addBooks(new ArtAlbum("Anii `80", 120, "Recycle Quality"), 2);

            catalog.addBooks(new ArtAlbum("Muzica Populara", 110, "Nice Quality"), 3);

            catalog.listAllBooks();


            catalog.deleteAllBooks(2);

            catalog.deleteAllBooks(5);

            catalog.listAllBooks();


        }


    }