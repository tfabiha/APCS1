// Tabassum Fabiha
// APCS1 pd2
// HW16 -- Get it While you Can
// 2017-10-15

/***
  driver for class Coin
  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Move the "TOP" line below the first statement. 
  (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM
***/

public class Driver
{
  public static void main( String[] args )
  {

    //build Objects from blueprint specified by class Coin

    //test default constructor
    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);
    
    //test equals() method
    if ( yours.equals(wayne) ) {
	System.out.println( "Matchee matchee!" );
    } else {
	System.out.println( "No match. Firestarter you can not be." );
    }

    // test while loop until x number of heads
    int x = 50;
    System.out.println("\nKeeps flipping until one coin has reached 50 heads.");
    while ((yours.retHeads() < x) || (wayne.retHeads() < x)) {
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);
    }
    System.out.println("\nYou've reached 50 heads.");

    // test until y number of matches
    int match = 0;
    int y = 50;
    System.out.println("\nKeeps flipping until there's been 50 matches.");
    while (match < y) {
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	if (yours.retUpFace() == wayne.retUpFace()) {
	    match += 1;
	}
    }
    System.out.println("\nYou've reached 50 matches.");

    // test for at least 13000 matches, and matches divisible by 2001
    match = 0;
    while ((match < 13000) || ((match % 2001) != 0)) {
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	if (yours.retUpFace() == wayne.retUpFace()) {
	    match += 1;
	}
    }
    System.out.println("\nYou've reached "+match+" matches.");
    
    /*===================TOP==========================
	    ====================BOTTOM======================*/

  }//end main()

}//end class
