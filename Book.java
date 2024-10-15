public class Book extends LibraryItem {
    private String author;
    private String isbh;

    public Book(String title, int yearPublished, String author, String isbh){
        super(title, yearPublished);
        this.author = author;
        this.isbh = isbh;
    }
    public String getDetails() {
        return super.getDetails() + ", Author: " + author + ", ISBH: " + isbh; 
    }
    
}
