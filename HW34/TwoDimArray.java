/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// T. Fabiha
// APCS1 pd2
// HW34 -- 2D arrays
// 2017-11-17

public class TwoDimArray {

    public static int maxColumn(int[][] arrays) {
	int maxx = 0;
	for (int[] each : arrays) {
	    if (maxx < each.length) {
		maxx = each.length;
	    }
	}
	return maxx;
    }
    
    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a )
    {
	String print;
        int maxx = maxColumn(a);
      
	for (int x = 0; x < maxx; x++) {
	    print = ""; //restarts with the start of a new

	    //looks at the xth row
	    for (int y = 0; y < a.length; y++) {
		// if an array does not have a value at the xth row,
		// adds an empty space in its place
		if (a[y].length > x) {
		    print += a[y][x];
		} else {
		    print += " ";
		}
	    }
	    
	    System.out.println(print); //prints the entire xth row
	}

	System.out.println(); //new line
    }


    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) {
	int maxx = maxColumn(a);
	String[] print = new String[maxx]; // creates print array with the number of rows
	
	initializeStringArray(print); // makes all the items empty strings
	
	for (int[] each : a) {
	    int x = 0;

	    // adds all the items in each item to their respective rows
	    while (x < each.length) {
		print[x] += each[x];
		x += 1;
	    }

	    // adds empty spaces for columns that dont have a maxxed out row
	    while (x < maxx) {
		print[x] += " ";
		x += 1;
	    }
	}

        printStringArray(print);
	System.out.println();
    }

    public static void initializeStringArray(String[] array) {
	for (int x = 0; x < array.length; x++) {
	    array[x] = "";
	}
    }

    public static void printStringArray(String[] array) {
	for (String each : array) {
	    System.out.println(each);
	}
    }
    

    //postcond: returns sum of all items in 2D int array a
    public static int sum1( int[][] a ) {
	int summ = 0;

	for (int[] each : a) {
	    for (int num : each) {
		summ += num;
	    }
	}

	return summ;
    }


    //postcond: returns sum of all items in 2D int array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m )
    {
	int summ = 0;

	for (int[] each : m) {
	    summ += sumRow(each);
	}

	return summ;
	// *** YOUR IMPLEMENTATION HERE ***
    }

    public static int sumRow(int[] ints) {
	int summ = 0;

	for (int each : ints) {
	    summ += each;
	}

	return summ;
    }


    //postcond: returns sum of all items on row r of 2D int array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a )
    {
	return 0;
	// *** YOUR IMPLEMENTATION HERE ***
    }


    //postcond: returns sum of all items on row r of 2D int array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] m)
    {
	return 0;
	// *** YOUR IMPLEMENTATION HERE ***
    }


    public static void main( String [] args )
    {
    
	int [][] m1 = new int[4][2];
	int [][] m2 = { {2,4,6}, {3,5,7} };
	int [][] m3 = { {2}, {4,6}, {1,3,5} };
	
	print1(m1);
	print1(m2);
	print1(m3);
	
	print2(m1);
	print2(m2);
	print2(m3);
	
	System.out.print("testing sum1...\n");
	System.out.println("sum m1 : " + sum1(m1));
	System.out.println("sum m2 : " + sum1(m2));
	System.out.println("sum m3 : " + sum1(m3));

	System.out.print("testing sum2...\n");
	System.out.println("sum m1 : " + sum2(m1));
	System.out.println("sum m2 : " + sum2(m2));
	System.out.println("sum m3 : " + sum2(m3));
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class TwoDimArray
