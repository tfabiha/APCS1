// Tabassum Fabiha
// APCS1 PD2
// HW36 -- Be Rational
// 2017-11-18

public class Rational {
    //////////////////////
    //INSTANCE VARIABLES//
    //////////////////////
    private int numerator;
    private int denominator;

    ////////////////
    //CONSTRUCTORS//
    ////////////////
    public Rational() {
	numerator = 0;
	denominator = 1;
    }

    public Rational(int newNum, int newDen) {
	numerator = newNum;
	denominator = newDen;

	if (newDen == 0) {
	    System.out.println("Invalid denominator attempted.");

	    numerator = 0;
	    denominator = 1;
	}
	simplify();
    }

    ///////////
    //METHODS//
    ///////////
    public String toString() {
        return  numerator + "/" + denominator;
    }

    public float floatValue() {
	return (float) numerator / denominator;
    }

    public void multiply(Rational thing) {
	numerator *= thing.numerator;
	denominator *= thing.denominator;
	simplify();
    }

    public void divide(Rational thing) {
	numerator *= thing.denominator;
	denominator *= thing.numerator;
	simplify();
    }

    /////////////////
    //extra methods//
    /////////////////
    public void simplify() {
	if (numerator != 0 && denominator != 0) {
	    int GCD = gcdER(numerator, denominator);
	    numerator /= GCD;
	    denominator /= GCD;
	}
    }
    
    public int gcdER(int a, int b){
	if (b % a == 0){
	    return a;
	}else {
	    int big = max(a, b);
	    int smol = min(a, b);
	    return gcdER(big - smol, smol);
	}
    }

    public int min(int a, int b){
	if (a > b){
	    return b;
	}
	return a;
    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        }
	return b;
    }

    

    //main method
    public static void main(String[] args) {
	Rational defaul = new Rational(2,0);
	Rational r = new Rational(2,5);
	Rational s = new Rational(3,2);

	System.out.println("Original values simplified");
	System.out.println("default:" + defaul);
	System.out.println("r:" + r);
	System.out.println("s:" + s);
	System.out.println();

	System.out.println("multiply r with s");
	r.multiply(s);
	System.out.println("r:" + r);
	System.out.println();

	System.out.println("divide s with r");
	s.divide(r);
	System.out.println("s:" + s);
	System.out.println();
    }
}
