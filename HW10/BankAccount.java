// Team Kitkat - Tabassum Fabiha, Kaitlin Wan, Bill Ni
// APCS1 pd2
// HW10 -- More Supreme BankAccount
// 2017-10-03

public class BankAccount
{
    //instance variables
    private String name;
    private String passwd;
    private int pin;
    private int acctNum;
    private double balance;


    //mutators
    public String setName( String newName )
    {
	String oldName = name;
	name = newName;
	return oldName;
    }

    public String setPasswd( String newPasswd )
    {
	String oldPasswd = passwd;
	passwd = newPasswd;
	return oldPasswd;
    }

    public int setPin( int newPin )
    {
	int oldPin = pin;
    
	//WILL BE THE NEWPIN VALUE AS LONG AS NEWPIN MEETS THE CRITERIA
	int settingPin = newPin;
    
	if ((newPin > 9998) || (newPin < 1000)) {
	    //Will set the Pin to 9999 and print error message
	    settingPin = 9999;
	    System.out.println("That number is INVALID. Must be between 1000 and 9998");
	}
    
	pin = settingPin;
	return oldPin;
    }

    public int setAcctNum( int newAcctNum ){
	int oldAcctNum = acctNum;
      
	//WILL SET ACCOUNT NUM IF BETWEEN [100000000,999999998]
	int settingNum = newAcctNum;
      
	if ((newAcctNum > 999999998) || (newAcctNum < 100000000)){
	    //Will set the Account Number to 999999999 and print error message
	    settingNum = 999999999;
	    System.out.println("That number is INVALID. Must be between 100000000 and 999999998");
	}
      
	// Will set new Account Num 
	acctNum = settingNum;
	return oldAcctNum;
    }
       

    public double setBalance( double newBalance )
    {
	double oldBalance = balance;
	balance = newBalance;
	return oldBalance;
    }

    public void deposit( double depositAmount ) {
	balance = balance + depositAmount;
    }

    //NEW WITHDRAW METHOD
    public boolean withdraw(double withdrawal){
        if (withdrawal > balance){
            //ERROR MESSAGE FOR IF THE USER TRIES TO WITHDRAW MORE THAN THEY HAVE
            String message;
            message = "Transaction failed.";
            message += "\nYou currently only have "+balance+" in your balance.";
            System.out.println(message);
            
            return false;
            
        } else {
            //TAKES OUT MONEY FROM THE BALANCE
            double newBalance;
            newBalance = balance - withdrawal;
            setBalance(newBalance);
          
            return true;
        }
    } 
    
    public void auth(int inAcctNum, String inAcctPass){
        if((inAcctNum == acctNum) && (inAcctPass == passwd)){
	    //CHECKS IF GIVEN ACCOUNT NUMBER + PASS ARE THE SAME AS THE ONE ON FILE
            System.out.println("Welcome to your bank account, " + name);
        }
        else {
            System.out.println("Incorrect. Please try again");
        
	}}// END OF AUTH
    
    //overwritten toString()
    public String toString() {
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + passwd;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: " + balance;
	retStr = retStr + "\n=======================";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args )
    {
	BankAccount richard = new BankAccount();
	System.out.println(richard);
	richard.setName("richard");
	richard.setAcctNum(111111111);
	richard.setPasswd("coolbro");
	System.out.println(richard);
	richard.auth(1111111, "hi");
	richard.auth(1111111, "coolbro");
	richard.auth(111111111, "hi");
	richard.auth(111111111, "coolbro");
	System.out.println(richard);
    }//end main()

}//end class BankAccount


