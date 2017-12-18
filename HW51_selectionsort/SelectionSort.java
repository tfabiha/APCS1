// Tabassum Fabiha
// APCS1 pd2
// HW51 -- Selection
// 2017-12-11

/***************************************
 * class SelectionSort -- implements SelectionSort algorithm
 ***************************************/

import java.util.ArrayList;

public class SelectionSort 
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
    // returns the smallest element in an arraylist starting from the
    // given index to the right end
    public static int indexOfSmallest(ArrayList<Comparable> list,
				      int startInd) {
	int indOfSmallest = startInd;

	for (int x = startInd + 1; x < list.size(); x++) {
	    if (list.get(indOfSmallest).compareTo(list.get(x)) > 0) {
		indOfSmallest = x;
	    }
	}

	return indOfSmallest;
    }

     // copies all the elements of copy into paste
    public static void copyOver(ArrayList<Comparable> copy,
				ArrayList<Comparable> paste) {
	for (Comparable each : copy) {
	    paste.add(each);
	}
    }

    // swaps the item at element a of temp with the item at element b of temp
    public static void swap(ArrayList<Comparable> temp, int a, int b) {
	Comparable store = temp.get(a);
	temp.set(a, temp.get(b));
	temp.set(b, store);
    }
	
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )  {
      for (int x = 0; x < data.size() - 1; x++) {
	  int smallest = indexOfSmallest(data, x);
	  swap(data, x, smallest);
	  //System.out.println(data);
      }
  }//end selectionSortV


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable>
	selectionSort( ArrayList<Comparable> input ) {

	ArrayList<Comparable> temp = new ArrayList<Comparable>();
	copyOver(input, temp);

	selectionSortV(temp);

	return temp;
    }//end selectionSort 


  public static void main( String [] args ) 
  {/*===============for VOID methods=============
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      selectionSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

      ============================================*/

    
    	ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" 
      + cocoSorted );
/*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
