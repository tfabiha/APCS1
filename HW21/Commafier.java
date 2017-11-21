// Tabassum Fabiha
// APCS1 pd2
// HW21 -- Karmacomma
// 2017-10-23

public class Commafier {
    // uses recursion to return commafied x
    public static String commafyR(int x) {
	String num = "" + x;
	int nlen = num.length();

	// if the string has 3 digits or less, it does not need a comma
	//     and should be returned as is
	if (nlen <= 3) {
	    return num;
	}
	//     finds the commafied version of the number without the last 3
	return commafyR(Integer.parseInt(num.substring(0,nlen-3)))
	    + "," + num.substring(nlen - 3);
    }// end commafyR()

    // uses for loop to return commafied x
    public static String commafyF(int x) {
	// initialize a string with the characters of x
	// initialize ret, which will contain the return value
	String num = "" + x;
	String ret = "";

	// y starts off with the first digit right after a comma, if the
	//      number has more than 3 place values
	// every time, decreases y by 3, to find the next digit right
	//      after a comma
	for (int y = num.length() - 3; num.length() > 3; y -= 3) {
	    
	    // if the for loop is true, then the number has more than
	    //    3 place values, so it needs a comma after every three
	    ret = "," + num.substring(y) + ret;

	    // truncates the string, gets rid of what's already been
	    //    looked at
	    num = num.substring(0,y);
	}
	ret = num + ret;
	return ret;
    }// end commafyF()

    public static void main(String[] args) {
	/*
	System.out.println("recursive test");
	System.out.println(commafyR(1));
	System.out.println(commafyR(10));
	System.out.println(commafyR(101));
	System.out.println(commafyR(1000));
	System.out.println(commafyR(12345));

	System.out.println("========================");

	System.out.println("iterative test");
	System.out.println(commafyF(1));
	System.out.println(commafyF(10));
	System.out.println(commafyF(101));
	System.out.println(commafyF(1000));
	System.out.println(commafyF(12345));
	*/

	System.out.println("recursive test");
	for (String s: args) {
	    System.out.println(commafyR(Integer.parseInt(s)));
	}

	System.out.println("======================");
	
	System.out.println("interative test");
	for (String s: args) {
	    System.out.println(commafyF(Integer.parseInt(s)));
	}
    }// end main()
}// end Commafier
