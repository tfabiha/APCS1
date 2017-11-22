// Tabassum Fabiha
// APCS1 PD2
// HW37 -- Be More --(Chill)-- Rational
// 2017-11-20

public class Rational {
    //////////////////////
    //INSTANCE VARIABLES//
    //////////////////////
    private int numerator;
    private int denominator;

    ////////////////
    //CONSTRUCTORS//
    ////////////////

    // default constructor
    public Rational() {
	numerator = 0;
	denominator = 1;
    }

    // overloaded constructor
    public Rational(int newNum, int newDen) {
        this();

	if (newDen != 0) {
	    numerator = newNum;
	    denominator = newDen;
	} else {
	    System.out.println("Invalid denominator attempted.");
	}
        //reduce();
    }

    ///////////
    //METHODS//
    ///////////

    //returns the visual representation of the fraction
    public String toString() {
        return  numerator + " / " + denominator;
    }

    // return the most accurate value of the fraction
    public double floatValue() {
	return (double) numerator / denominator;
    }

    // adds thing. to this.
    public void add(Rational thing) {
	numerator = numerator * thing.denominator + thing.numerator * denominator;
	denominator *= thing.denominator;
	reduce();
    }

    // subtracts thing. from this.
    public int subtract(Rational thing) {
	numerator = numerator * thing.denominator - thing.numerator * denominator;
	denominator *= thing.denominator;
	reduce();

	//extra return statement to deal with compareTo
	return numerator;
    }
    
    public void multiply(Rational thing) {
	numerator *= thing.numerator;
	denominator *= thing.denominator;
	//reduce();
    }

    public void divide(Rational thing) {
	if (thing.numerator != 0) {
	    numerator *= thing.denominator;
	    denominator *= thing.numerator;
	} else {
	    System.out.println("Invalid denominator attempted.");
	}
	//reduce();
    }

    public int compareTo(Rational thing) {
	Rational placeHolder = new Rational(numerator, denominator);
	return placeHolder.subtract(thing);
    }

    /////////////////
    //extra methods//
    /////////////////

    //simplifies the fraction
    public void reduce() {
	if (numerator != 0 && denominator != 0) {
	    int GCD = gcd(Math.abs(numerator), denominator);
	    numerator /= GCD;
	    denominator /= GCD;
	}
    }

    // recursively finds the gcd of the numbers
    public int gcd(int a, int b){
	// if mod == 0, then b is divisible by a, and a is the gcd
	if (b % a == 0){
	    return a;
	}else {
	    int big = max(a, b);
	    int smol = min(a, b);
	    return gcd(big - smol, smol);
	}
    }

    // finds the max of two numbers
    // takes two integer parameters
    public int max(int a, int b){
        int maxi;
        if (a > b){
            maxi = a;
        }else {
            maxi = b;
        }
        return maxi;
    }

    // finds the min of two numbers
    // takes two integer parameters
    public int min(int a, int b){
	if (a > b){
	    return b;
	}else {
	    return a;}
    }

    

    //main method
    public static void main(String[] args) {
	Rational defaul = new Rational(2,0);
	Rational r = new Rational(3,3);
	Rational s = new Rational(2,3);

	System.out.println(r.floatValue());

	System.out.println("Original values simplified");
	System.out.println("default:" + defaul);
	System.out.println("r: " + r);
	System.out.println("s: " + s);
	System.out.println();
	/*
	System.out.println("multiply r with s");
	r.multiply(s);
	System.out.println("r: " + r);
	System.out.println();

	System.out.println("divide s with r");
	s.divide(r);
	System.out.println("s: " + s);
	System.out.println();

	System.out.println(r.floatValue());
	System.out.println();
	*/
	r.add(s);
	System.out.println("r: " + r);

	System.out.println(r.compareTo(s));
	System.out.println(s.compareTo(r));
	System.out.println(s.compareTo(s));
	//System.out.println("r: " + r);
	
    }
}
