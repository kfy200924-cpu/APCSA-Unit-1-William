package Unit6.Lab1;

public class Book {
    private String author;
    private String title;
    private int yearPublished;
    private int id;

    public Book(String author, String title, int yearPublished, int id) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorLastName() {
        if(author.contains(" ")) {
            //"J.K. Rowling", "John Smith", "Agatha Mary Clarissa Miller"
            int space = author.lastIndexOf(" ");
            return author.substring(space + 1);
        }
        return author;
    }

    public String toString() {
        return "id: " + id + " - " + title + " by " + author + " (" + yearPublished + ")";
    }

    public static void main(String[] args) {
        Book b = new Book("George Orwell", "1984", 1949, 101);
        System.out.println(b.getAuthorLastName());
        System.out.println(b);
    }
}
