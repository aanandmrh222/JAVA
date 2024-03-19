class LibraryItem {
    protected String itemID;
    protected String title;
    protected String author;

    public void checkout() {
        System.out.println("Book Checkout");
    }
    public void returnItem() {
        System.out.println("Book Return");
    }
}

class Books extends LibraryItem {
    private String iSBN;
    Books(String itemId, String title, String author) {
        this.itemID = itemId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "itemID='" + itemID + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class Magazine extends LibraryItem {
    public String issueNumber;
}
class DVD extends LibraryItem {
    public int durationInSec;
}

public class AK_54_PracticeSet {
    public static void main(String[] args) {
        Books book = new Books("01","S Chand", "XYZ");
        System.out.println(book);
        System.out.println(book.itemID);
        LibraryItem lb = new LibraryItem();


    }
}
