public class DsgsLoginData {
    public static void main(String[] args) {
        System.out.println("Hello nikhil i am your Asus");

        BankCustomer dsgs1 = new BankCustomer("Jane Smith", 1001, "JSM", "Chase Bank",
                "CHASUS33", "1234567890", 19900215, 7500L, 12345678L, true);

        BankCustomer dsgs2 = new BankCustomer("John Doe", 1002, "JHN", "Bank of America",
                "BOFAUS3N", "2345678901", 19851103, 5000L, 87654321L, true);

        BankCustomer dsgs3 = new BankCustomer("Alice Johnson", 1003, "ALJ", "Wells Fargo",
                "WFUSUS6S", "3456789012", 19790425, 3000L, 98765432L, true);

        BankCustomer dsgs4 = new BankCustomer("Bob Williams", 1004, "BMW", "Citibank",
                "CITIUS33", "4567890123", 19821210, 4000L, 54321678L, true);

        BankCustomer dsgs5 = new BankCustomer("Mary Lee", 1005, "MLE", "US Bank",
                "USBKUS44", "5678901234", 19981115, 6000L, 65432187L, true);

        BankCustomer dsgs6 = new BankCustomer("David Brown", 1006, "DBR", "PNC Bank",
                "PNCCUS33", "6789012345", 19770620, 2000L, 76543216L, true);

        BankCustomer dsgs7 = new BankCustomer("Samantha Green", 1007, "SGR", "TD Bank",
                "NRTHUS33", "7890123456", 19890830, 8000L, 87654321L, true);

        BankCustomer dsgs8 = new BankCustomer("Michael Chen", 1008, "MCH", "Capital One",
                "NFBKUS33", "8901234567", 19930518, 10000L, 98765432L, true);

        BankCustomer dsgs9 = new BankCustomer("Emily Kim", 1009, "EKM", "HSBC Bank",
                "MRMDUS33", "9012345678", 20001005, 1500L, 23456789L, true);

        BankCustomer dsgs10 = new BankCustomer("Alex Rodriguez", 1010, "ARO", "BB&T Bank",
                "BRBTUS33", "0123456789", 19800101, 9000L, 98765432L, true);
        
        
        dsgs1.displayCustomerDetails();
        dsgs2.displayCustomerDetails();
        dsgs3.displayCustomerDetails();
        dsgs4.displayCustomerDetails();
        dsgs5.displayCustomerDetails();
        dsgs6.displayCustomerDetails();
        dsgs7.displayCustomerDetails();
        dsgs8.displayCustomerDetails();
        dsgs9.displayCustomerDetails();
        dsgs10.displayCustomerDetails();
    }
}

class BankCustomer {
    private String name;
    private int id;
    private String trigram;
    private String bankName;
    private String ifscCode;
    private String accountNum;
    private int dob;
    private long accountBalance;
    private long password;
    private boolean accountStatus;

    // Constructor to initialize the fields
    public BankCustomer(String name, int id, String trigram, String bankName, String ifscCode,
                        String accountNum, int dob, long accountBalance, long password, boolean accountStatus) {
        this.name = name;
        this.id = id;
        this.trigram = trigram;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.accountNum = accountNum;
        this.dob = dob;
        this.accountBalance = accountBalance;
        this.password = password;
        this.accountStatus = accountStatus;
    }
    // Constructor number 1 .... type 1 , no argument no return type
    public void displayCustomerDetails() {
        System.out.println("Name of user: " + name);
        System.out.println("Id of user: " + id);
        System.out.println("Trigram of user: " + trigram);
        System.out.println("Bank name of user: " + bankName);
        System.out.println("Account number of user: " + accountNum);
        System.out.println("Date of birth of user: " + dob);
        System.out.println("Account balance of user: " + accountBalance);
        System.out.println("User password: " + password);
        System.out.println("User account status: " + accountStatus);
        System.out.println("<------------------------------------>");
    }
    
    
    // Constructor type 2 , with argument no return type 
    //void changeUserPasseord()
}
