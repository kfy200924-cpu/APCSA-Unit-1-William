package Unit5;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    //accessors
    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    //mutators
    public void setYear(int newYear) {
        year = newYear;
    }
}

