//Team Turtlini - Shayan Chowdhury, Peter Cwalina, Tabassum Fabiha
//APCS1 pd2
//HW09 -- CMYM
//2017-10-02

public class bankAccount{
    //instance variables
    private String acctName;
    private String acctPass;
    private int pin;
    private int acctNum;
    private float balance;
    private String units = "dollars";


    
    //Constructors - sets up all the variables
    public bankAccount() {
	//Default Constructor
	acctName = "FirstName LastName";
        acctPass = "password";
        pin = 1234;
        acctNum = 123456789;
        balance = 0;
    }
    
    public bankAccount(String name, String pass, int pinn, int id){
	//Overloaded Constructor
        acctName = name;
        acctPass = pass;
        pin = pinn;
        acctNum = id;
        balance = 0;	
    }


    
    //methods
    public void deposit(float deposit) {
	//Deposits money into bank account and prints new balance.
	balance = balance + deposit;
	System.out.print("You have deposited, ");
        System.out.print(Float.toString(deposit));
        System.out.println(" "+units+".");
	System.out.print("Your new balance is, ");
        System.out.print(Float.toString(balance));
        System.out.println(" "+units+".");
    }

    public void withdraw(float withdrawl) {
	//Withdraws money from bank account and prints new balance.
        balance = balance - withdrawl;
        System.out.print("You have withdrawn, ");
        System.out.print(Float.toString(withdrawl));
        System.out.println(" "+units+".");
        System.out.print("Your new balance is, ");
        System.out.print(Float.toString(balance));
        System.out.println(" "+units+".");
    }

    public void accntInfo() { //Prints bank account info.
        System.out.println("Account Name: "+acctName);
        System.out.println("Password: "+acctPass);
        System.out.println("PIN: "+pin);
        System.out.println("Account Number: "+acctNum);
    }

    //setting attributes
    public void setName(String name) {
        acctName = name;
        System.out.println("Your account name is, "+acctName);
    }

    public void setPass(String pass) {
        acctPass = pass;
        System.out.println("Your password is, "+acctPass);
    }
    
    public void setPIN(int pinn) {
        pin = pinn;
        System.out.println("Your PIN is, "+pin);
    }

    public void setAcctNum(int accNum) {
        acctNum = accNum;
        System.out.println("Your account number is, "+acctNum);
    }

    public void setBalance(float bal) {
        balance = bal;
        System.out.println("Your balance is, "+balance+" "+units+".");
    }

    public static void main (String [] args){
        bankAccount turtle = new bankAccount("Turtle Turtleson", "secret", 4321, 987654321);
        turtle.setBalance(2500f);
        turtle.deposit(2745.325f);
        turtle.withdraw(245.532f);
        System.out.println(); //Making a new line just for ease of legibility.
        turtle.accntInfo();
    }
   
}
