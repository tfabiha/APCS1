public class Coin {

    //////////////////////
    //instance variables//
    //////////////////////
    
    private double value; // worth, units in dollars
    private String upFace; // face currently showing
    private String name; // name of coin
    private int flipCtr;// # of times flipped
    private int headsCtr;// # of times heads
    private int tailsCtr;// # of times tails
    private double bias; // probability of landing face; (1.0) all heads



    ////////////////
    //constructors//
    ////////////////

    /* default constructor: initializes intance vars to default vars
     * precondition: none
     * postondition: instance bars have appropriate default vars
     */
    public Coin() {
	upFace = "heads";
	bias = Math.random();
    }



    /* overloaded constructor: allows caller to specify name. value is
                               assigned according to name. assigns 
                               defaults to other instance vars 
     * precondition: params are passed in specific order
     * postondition: name has a value specified by a param
     */
    public Coin(String setterName) {
	this();
	name = setterName;
	assignValue();
    }



    /* overloaded constructor: allows caller to specify name and upFace. value 
                               is assigned according to name. assigns
                               defaults to other instance vars.
     * precondition: params are passed in specified order
     * postondition: name and upFace are specified by params
     */
    public Coin(String setterName, String setterFace) {
	this(setterName);
	upFace = setterFace;
    }

    ///////////
    //methods//
    ///////////

    // flips according to a bias, and assigns either heads or tails to upFace
    public String flip() {
	String oldFace = upFace;

	// faceProb is the random number being compared to bias
	double faceProb = Math.random();

	/* in bias, the closer it is to 1.0, the higher the probability
	 * for getting head. therefore, (0.0, bias] is the range faceProb
	 * has to be in for upFace to be heads, else it's tails
	 */
	if (faceProb <= bias) {
	    upFace = "heads";
	} else {
	    upFace = "tails";
	}

	return oldFace;
    }

    // assigns the worth of the coin
    // precondition: must have a name
    public void assignValue() {
	if (name == "penny") {
	    value = .01;
	}

	if (name == "nickel") {
	    value = .05;
	}

	if (name == "dime") {
	    value = .10;
	}

	if (name == "quarter") {
	    value = .25;
	}

	if (name == "dollar") {
	    value = 1.00;
	}
    }

    

    ///////////////////////
    //overridden toString()//
    ///////////////////////
    public String toString() {
	String toSay = "";
	toSay += name;
	toSay += ": -- ";
	toSay += upFace;

        return toSay;
    }


    ///////////////////////
    //overridden equals()//
    ///////////////////////
    public boolean equals(Coin object) {
	return upFace == object.upFace;
    }
    
    //main
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
    /*===================TOP==========================
	    ====================BOTTOM======================*/

  }//end main()
}
