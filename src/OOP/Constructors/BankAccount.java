package OOP.Constructors;

public class BankAccount {
    private String accNumber;
    private double accBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("1234",10.5,customerEmail,customerName,customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(){
        this("231221",2.50,"Jane","123-123-222","abc@gmail.com");
        System.out.println("empty constructor called");
    }

    public BankAccount(String accNumber, double accBalance, String customerName, String customerPhoneNumber, String customerEmail){
    this.accNumber = accNumber;
    this.accBalance = accBalance;
    this.customerPhoneNumber = customerPhoneNumber;
    this.customerEmail = customerEmail;
    this.customerName = customerName;
    }

// Deposit func
    public void deposit(double depositAmount){
        this.accBalance += depositAmount;
        System.out.println("You have "+this.accBalance);
    }
// Withdraw func
    public void withdraw(double withdrawAmount){
        if(accBalance - withdrawAmount <0){
            System.out.println("Insufficient amount");
    } else {
            accBalance -= withdrawAmount;
            System.out.println("you have "+accBalance);
        }
    }
    public void getAccName(){
        System.out.println(this.customerName);
    }
}
