import cs1.Keyboard;

/* Tabassum Fabiha
 * APCS1 pd2
 * HW#40 -- Make it Better
 * 2017-11-26
 * 
 * The program asks the user prints an array, and provides column and row 
 * numbers. The user is then asked to input the rows and columns for first
 * the first item, and then the second item. If the user attempts to 
 * swap an item that does not exist, they will be asked to reenter the row
 * and column numbers for that item. The user must confirm each item that 
 * will be swapped. After both items have been determined, they will be
 * swapped, and the array will once again be printed.
 *
 *
 * Update - 2017-11-26
 * Robustified the code so that it didn't repeat itself unnecessarily by
 * adding a helper function. 
 */

public class Swapper {

    // variables
    public static String[][] arrays;
    public static int[][] swappers;

    // sets up the array 
    public static void setUp() {
	arrays = new String[3][2];
	swappers = new int[2][2];
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

    // takes in the parameters of what item it is, and what position it is
    // sets the row and column numbers for the specified item being swapped
    public static void item(int[] item, String position) {
	int accept = 0;

	while (accept != 1) {
	    System.out.println("What is the column of the " + position +" item you would like to swap?");
	    item[1] = readInt() - 1;

	    System.out.println("What is the row of the " + position +" item you would like to swap?");
	    item[0] = readInt() -1;

	    if (item[0] < arrays.length && item[1] < arrays[item[0]].length) {
		System.out.println("Is this what you wish to swap?");
		System.out.println();
		System.out.println("\t\t1:yes");
		System.out.println("\t\t2:no");
		System.out.println();
		System.out.println(arrays[item[0]][item[1]]);
		
		accept = readInt();
	    } else {
		System.out.println("That combination is not possible. \nPlease try again.");
	    }
	}
    } 
    
    // finds the row and column numbers for the second item
    public static void secondItem() {
	item(swappers[1], "second");
    }

    // finds the row and column numbers for the first item
    public static void firstItem() {
	item(swappers[0], "first");
    }

    // finds the first and second items
    public static void getSwapInfo() {
	firstItem();
	secondItem();
    }

    // swaps the two found items
    public static void swap() {
	int row1 = swappers[0][0];
	int col1 = swappers[0][1];
	int row2 = swappers[1][0];
	int col2 = swappers[1][1];
	
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
	System.out.println("This is your swapped array.");
	print(arrays);
    }
}
