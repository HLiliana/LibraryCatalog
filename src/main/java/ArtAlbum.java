/** here we made a subclass for class Books
 * it contains a variable type String for page quality
 */
    class ArtAlbum extends Book {
    public String paperQuality;

    public ArtAlbum(String name, int numberOfPages, String paperQuality){
        super(name, numberOfPages);
        this.paperQuality=paperQuality;
    }
}
