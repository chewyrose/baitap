public class LibraryManagemenSystem {
    public static void main(String[] args) {
        LibraryItem[] libraryItems = {
            new Book("The Great Gatsby", 1925, "F.Scott Fitzgerald", "9780743273565"),
            new Magazine("National Geographic", 2023, 12, "National Geographic partners"),
            new Book("To Kill a Mockingbird", 1960, "Harper Lee", "9780061120084"),
            new Magazine("TIME", 2022, 35,"Time USA LLC")
        };
        for (LibraryItem item : libraryItems) {
            system.out.println(item.getDetails());
        }
    }
    
}
