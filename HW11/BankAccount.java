// Hard Coders Maxwell Vale, Daniel Gelfand, Eric Wong
// APCS1 pd2
// HW10 -- Mo Money Mo Problem
// 2017-10-03 T
public class BankAccount
{

    //ADDED THE CONSTRUCTORS
    //===========================================================================
    
       /* default constructor: initializes instance vars to default vals
       precondition:  none
       postcondition: instance vars have appropriate default vals
       ````````````````````````````````````````````````````*/
    public BankAccount() {
	
    }

    /* overloaded constructor: allows caller to specify account 
                               number and passwd. Assigns defaults
                               to other instance vars.
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( int newAcctNum, String newPass ) {


	


    }

    /* overloaded constructor: allows caller to specify instance vars
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( int newAcctNum, String newPass, 
			double newBal, String newName, int newPin ) {




    }
    //instance variables
    //==================================================================
    private String name;
    private String passwd;
    private int pin;
    private int acctNum;
    private double balance;


    //mutators
    //=================================================================
    
    /* 	setName: allows accountholder to changename
      	precondition: specific param is passed in
      	postcondition: specified newName set to inst. vars name
    */
    public String setName( String newName )
    {
    String oldName = name;
    name = newName;
    return oldName;
    }

    /*	setPasswd: allows account holder to change password
     	precondition: specific param is passed in
     	postcondition: specified password set to inst. vars newPasswd
     */

    public String setPasswd( String newPasswd )
    {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
    }

    /* setPin: allows account holder to change 4-digit pin
       precondition: specific param is passed into method
       postcondition: if valid pin, then specified newPin set to pin
       				  if not, pin set to 9999 and an error message will be printed
     */
    public int setPin( int newPin )
    {
    if (newPin > 1000 && newPin < 9998) {
        int oldPin = pin;
        pin = newPin;
        return oldPin;
        }
    else {
	int oldPin = pin;
        pin = 9999;
        System.out.println("Invalid pin number. Make sure the new Pin contains 4-digits and does not start with a 0.");
	return oldPin;
        }
    }

    /*	setAcctNum: allows account holder to change the account numbers
     	precondition: specified param is passed into method
     	postcondition: if valid, then specified account number set to acctNum.
       				  if not, acctNum set to 999999999 and an error message will be printed
     */
    public int setAcctNum( int newAcctNum )
    {
    if (newAcctNum >= 100000000 && newAcctNum <= 999999998) 
    {
    int oldAcctNum = acctNum;
    acctNum = newAcctNum; 
    return oldAcctNum;
    }
       
    else {
	int oldAcctNum = acctNum;
        acctNum = 999999999;
        System.out.println("Invalid number. Make sure the account number contains 9-digits");
	return oldAcctNum;
    }

    }

    /*	setBalance: allows account holder to set the balance within their account
 	precondition: specified param is passed into method
 	postcondition: newBalance will be set to balance.
 */
    public double setBalance( double newBalance )
    {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
    }
    
    
    /*	deposit: allows account holder add money to account
 	precondition: specified param is passed into method
 	postcondition: balance is updated with added money
 	
 	*/
    public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
    }

    /* withdraw: allows account holder to take out money 
 	precondition: specified param is passed into method
 	postcondition: if valid amount, balance update
   				  if not, no transaction + error message
 */
    public boolean withdraw(double withdrawAmount){
    if(balance < withdrawAmount)
        {
        System.out.println("Transaction will not go through. Insufficient balance");
	return (balance > withdrawAmount);
        }
        else
        {
        balance -= withdrawAmount;
        return (balance > withdrawAmount);
        }
    }
    
    /*	authenticate: 
 	precondition: specified param is passed into method
 	postcondition: if valid, will allow access!
   				  if not, will return error.
 */
   public boolean authenticate(int accountNum, String pass) {
           return(accountNum == acctNum && pass == passwd);
}



   /*	toString: Overrides default toString
	precondition: none
	postcondition: returns a string containing all information
*/
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

    


    /*	main: allows for testing
 	precondition: none
 	postcondition: goes through all code.
 */
    public static void main( String[] args )
    {
        BankAccount Kevin = new BankAccount();
        Kevin.setName("Bob");
        Kevin.setPasswd("password");
        Kevin.setPin(99299);
	Kevin.setAcctNum(45672345);
        System.out.println(Kevin);
    }//end main()

    }//end class BankAccount
