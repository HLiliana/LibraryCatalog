/**here we made a subclass for class Books
 * it contains a variable String type for Novels(like mystery, sf, etc.)
 */

class Novel extends Book {
    public String typeOfNovel;

    public Novel(String name, int numberOfPages, String typeOfNovel) {
        super(name, numberOfPages);
        this.typeOfNovel = typeOfNovel;
    }
}

