package Classes;

public class Customer {
    private String name;
    private int accountNumber;
    private double balance;
    private String email;
    private String phone;

    public Customer(String name, int accountNumber, double balance, String email, String phone) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.phone = phone;
    }
    public Customer() {
        this("Default Name", 12345, 0.0, "some@email.com", "None");
    }
    public Customer(String name, int accountNumber, double balance) {
        this(name, accountNumber, balance, "", "");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void withdraw(double amount) {
         if(amount < 0) System.out.println("Amount is negative");
        if(getBalance()-amount < 0) System.out.println("The amount you are trying to withdraw is higher than your balance");
        this.balance -= amount;
    }
    public void deposit(double amount) {
        if(amount < 0) System.out.println("Amount is negative");
        this.balance += amount;
    }
    static void main(){
        Customer customer = new Customer();
        customer.setName("The Customer");
        customer.setBalance(12345);
        customer.setEmail("customer@contoso.com");
        customer.setPhone("(240)455-3244");
        customer.setAccountNumber(12345678);

        System.out.println("The Customer has been created");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Phone Number: " + customer.getPhone());
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Current Balance: " + customer.getBalance());
        customer.withdraw(10.00);
        System.out.println("New Balance: " + customer.getBalance());
        customer.deposit(100.00);
        System.out.println("New Balance: " + customer.getBalance());
    }
}
