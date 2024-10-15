public class Magazine extends LibraryItem {
    private int issueNumber;
    private String published;
    
    public Magazine(String title, int yearPublished, int issueNumber, String published) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.published = published;
    }
    public String getDetails() {
        return super.getDetails() + ", Issue Number: " + issueNumber + ", Published: " + published;
    }
}
