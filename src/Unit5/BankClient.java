package Unit5;

public class BankClient {
    private String name;
    private String id;
    private String membership;

    public static final String BANK_NAME = "Bank of China";

    private boolean isLocal;

    public static int totalClients = 0;

    public BankClient(String name, String id) {
        this.name = name; //Parameter name hides the attribute name
        this.id = id;
        totalClients++;
    }

    public BankClient(String name, String id, boolean isLocal, String m) {
        this(name, id); //Calling a first constructor
        this.isLocal = isLocal; //This helps to avoid hiding
        membership = m; //Gold, Silver, Bronze
    }

    public void compareClients(BankClient another) {
        System.out.println("This client has status: " + this.membership + "another client has status: " + another.membership);
    }

    //You can use static variables (functions) inside instance methods.
    public void printClientInfo() {
        System.out.println("Client name: " + this.name);
        System.out.println("Client id: " + this.id);

        System.out.println("Total clients: " + totalClients);
    }

    //You cannot use instance variables (methods) in static context.
    public static int getTotalClients() {
        //System.out.println("Client name: " + name); X
        return totalClients;
    }

    @Override
    public String toString() {
        return "The bank client. \nName: " + name + "\nID: " + id;
    }

    public static void main(String[] args) {
        BankClient bc = new BankClient("John", "12345");
        BankClient bc1 = new BankClient("Mary", "54321");
        bc.printClientInfo();
        bc1.printClientInfo();

        System.out.println(bc); //This line of code will print the specific memory location.
        System.out.println(BankClient.BANK_NAME);


    }
}
