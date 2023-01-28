public class Books {
    private int year;
    private String genre;
    private String title;
    private String author;
    private boolean isInStock;

    public Books (int year, String genre, String title, String author, int stock){
        this.year = year;
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.stock = stock;
    }
}
