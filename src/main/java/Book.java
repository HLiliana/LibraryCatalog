/** Books is a parent class in which we set 2 variables for name and number of pages, common to all children
 * we make a constructor with 2 parameters;
 * we assign this.name to the "variable name" analog with numberOfPages
 * we made a constructor for the name of the books, to be able to list/print them.
 */
public class Book {
    public final String name;
    public int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }
}

