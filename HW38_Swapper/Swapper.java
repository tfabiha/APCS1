import cs1.Keyboard;

/* Tabassum Fabiha
 * APCS1 pd2
 * HW#38: Put it Together
 * 2017-11-21
 * 
 * The program asks the user prints an array, and provides column and row 
 * numbers. The user is then asked to input the rows and columns for first
 * the first item, and then the second item. If the user attempts to 
 * swap an item that does not exist, they will be asked to reenter the row
 * and column numbers for that item. The user must confirm each item that 
 * will be swapped. After both items have been determined, they will be
 * swapped, and the array will once again be printed.
 */

public class Swapper {

    // variables
    public static String[][] arrays;
    public static int col1, row1, col2, row2; 

    // sets up the array 
    public static void setUp() {
	arrays = new String[3][2];

	initialize(arrays);
	
    }

    // adds items into each slot in the array
    public static void initialize(String[][] a) {
	for (int row = 0; row < a.length; row++) {
	    
	    for (int col = 0; col < a[row].length; col++) {
		a[row][col] = "" + row + col + row * col; 
	    }
	}
    }

    // prints the array
    public static void print( String[][] a )
    {
	int maxx = maxColumn(a);
	String retStr = "";
	retStr += "Column >";

	for (int x = 1; x <= a[0].length; x++) {
	    retStr += "\t" + x;
	}

	retStr += "\n" + "Row v \n";
	
	for (int row = 0; row < a.length; row++) {
	    retStr += (row + 1) + "\t\t";
	    
	    for (String thing : a[row]) {
		retStr += thing + "\t";
	    }
	    retStr += "\n";
	}
	
	System.out.println(retStr);
    }

    // finds the row and column numbers for the second item
    public static void secondItem() {
	int accept = 0;

	while (accept != 1) {
	    System.out.println("What is the column of the second item you would like to swap?");
	    col2 = readInt() - 1;

	    System.out.println("What is the row of the second item you would like to swap?");
	    row2 = readInt() -1;

	    if (row2 < arrays.length && col2 < arrays[row2].length) {
		System.out.println("Is this what you wish to swap?");
		System.out.println();
		System.out.println("\t\t1:yes");
		System.out.println("\t\t2:no");
		System.out.println();
		System.out.println(arrays[row2][col2]);
		
		accept = readInt();
	    } else {
		System.out.println("That combination is not possible. \nPlease try again.");
	    }
	}
    }

    // finds the row and column numbers for the first item
    public static void firstItem() {
	int accept = 0;

	while (accept != 1) {
	    System.out.println("What is the column of the first item you would like to swap?");
	    col1 = readInt() - 1;

	    System.out.println("What is the row of the first item you would like to swap?");
	    row1 = readInt() -1;

	    if (row1 < arrays.length && col1 < arrays[row1].length) {
		System.out.println("Is this what you wish to swap?");
		System.out.println();
		System.out.println("\t\t1:yes");
		System.out.println("\t\t2:no");
		System.out.println();
		System.out.println(arrays[row1][col1]);
		
		accept = readInt();
	    } else {
		System.out.println("That combination is not possible. \nPlease try again.");
	    }
	}
    }

    // finds the first and second items
    public static void getSwapInfo() {
	firstItem();
	secondItem();
    }

    // swaps the two found items
    public static void swap() {
	String place = arrays[row1][col1];
	arrays[row1][col1] = arrays[row2][col2];
	arrays[row2][col2] = place;
    }
    
    //extra methods
    public static int maxColumn(String[][] arrays) {
	int maxx = 0;
	for (String[] each : arrays) {
	    if (maxx < each.length) {
		maxx = each.length;
	    }
	}
	return maxx;
    }

    public static int readInt() {
	return Keyboard.readInt();
    }

    public static void main(String[] args) {
	setUp();
	print(arrays);

	getSwapInfo();
	swap();

	System.out.println();
	System.out.println("This is your swapped code.");
	print(arrays);
    }
}
