// Tabassum Fabiha
// APCS1 pd2
// HW57 -- How Deep Does the Rabbit Hole Go?
// 2017-12-20 w

/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/


public class Matrix 
{
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix( ) {
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    }


    //constructor intializes an a*a matrix
    public Matrix( int a ) {
	matrix = new Object[a][a];
    }
    
    //return size of this matrix, where size is 1 dimension
    private int size() {
	return matrix.length;
    }


    //return the item at the specified row & column   
    private Object get( int r, int c ) {
	return matrix[r - 1][c - 1];
    }


    //return true if this matrix is empty, false otherwise
    private boolean isEmpty() {
        boolean empty = true;
	
	for (int r = 0; r < matrix.length && empty; r++) {
	    for (int c = 0; c < matrix[r].length && empty; c++) {
		empty = !(matrix[r][c] instanceof Object);
	    }
	}

	return empty;
    }


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
	Object temp = matrix[r - 1][c - 1];
	matrix[r - 1][c - 1] = newVal;
	return temp;
    }

   
    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() {
	String print = "\n";

	/*print += "    col\t";

	for (int r = 0; r < matrix.length; r++) {
	    print += r + "\t";
	}
	
	print += "\nrow\n";
	*/
	
	for (int r = 0; r < matrix.length; r++) {
	    // print += r + "\t";
	    
	    for (Object col : matrix[r]) {
		print += col + "\t";
	    }

	    print += "\n";
	}

	return print;
    }


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Matrix rightSide ) {
        if ( !(this.size() == rightSide.size())) {
	    return false; 
	}

	boolean identical = true;
	for (int r = 1; r <= this.size() && identical; r++) {

	    for (int c = 1; c <= this.size() && identical; c++) {
		Comparable mine = (Comparable) this.get(r, c);
		Comparable theirs = (Comparable) rightSide.get(r, c);
		identical = mine.compareTo(theirs) == 0;
	    }
	}

	return identical;
    }


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) {
	for (int r = 0; r < matrix.length; r++) {
	    Object temp = matrix[r][c1 - 1];
	    matrix[r][c1 - 1] = matrix[r][c2 - 1];
	    matrix[r][c2 - 1] = temp;
	    
	}
    }


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
	Object[] temp = matrix[r1 - 1];
	matrix[r1 - 1] = matrix[r2 - 1];
	matrix[r2 - 1] = temp;
    }

    

    //main method for testing
    public static void main( String[] args ) {
	Matrix mat = new Matrix();
	System.out.println("Size of max: " + mat.size());
	Matrix pat = new Matrix(5);
	System.out.println("Size of pat: " + pat.size());
	System.out.println();

	System.out.println("item at row 1 col 1 of mat: " + mat.get(1,1));
	System.out.println("is mat empty? : " + mat.isEmpty());
	System.out.println("setting row 1 col 1 of mat to 1\n" + mat.set(1,1,1));
	System.out.println("is mat empty? : " + mat.isEmpty());
	System.out.println();
	
	System.out.println("is pat empty? : " + pat.isEmpty());
	System.out.println("setting row 3 col 5 of pat to 1\n" + pat.set(3,5,1));
	System.out.println("is pat empty? : " + pat.isEmpty());
	System.out.println();

	System.out.println("mat is: " + mat);
	System.out.println("pat is: " + pat);

	System.out.println("mat equals pat? : " + mat.equals(pat));
	System.out.println();

	Matrix foo = new Matrix();
	Matrix boo = new Matrix();

	for (int x = 1; x <= foo.size(); x++) {
	    for(int y = 1; y <= foo.size(); y++) {
		foo.set(x,y,x+y);
	    }
	}
       	
	for (int x = 1; x <= boo.size(); x++) {
	    for(int y = 1; y <= boo.size(); y++) {
		boo.set(x,y,x+y);
	    }
	}

	System.out.println("foo is: " + foo);
	System.out.println("boo is: " + boo);
	System.out.println("foo equals boo? : " + foo.equals(boo));
	System.out.println();

	System.out.println("foo is :" + foo);
	System.out.println("swap rows 1 and 2 of foo");
	foo.swapRows(1,2);
	System.out.println("foo is :" + foo);

	System.out.println("boo is :" + boo);
	System.out.println("swap columns 1 and 2 of boo");
	boo.swapColumns(1,2);
	System.out.println("boo is :" + boo);

    }
    
}//end class Matrix
