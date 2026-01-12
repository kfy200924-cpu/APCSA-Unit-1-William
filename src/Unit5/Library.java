package Unit5;

public class Library {
    public static void main(String[] args) {
        Book b = new Book("Special Relativity", "Albert Einstein", 1920); //title = null, author = null, year = 0
        //default values for all types:
        //boolean -> false
        //int -> 0
        //double -> 0.0
        //Any reference -> null
        //System.out.println(b.title + b.author + b.year); //nullnull0

        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getYear());

        b.setYear(1995);

        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getYear()); //the year is updated
    }
}
