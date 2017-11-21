//Team BunnyEars - Brandon Chong & Tabassum Fabiha
//APCS1 pd2
//HW19 -- gcd 3 ways
//2019-10-18

public class Stats{
    // Takes two integer data types and returns their mean(average) as data type int
    public static int mean(int a, int b){
        int avgi;
        avgi = (a + b) / 2;
        return avgi;
    }
    //Takes two double data types and returns their mean as data type double
    public static double mean(double a, double b){
        double avgd;
        avgd = (a + b) /2;
        return avgd;
    }
    //Takes two integer data types and returns the value of the greater integer
    public static int max(int a, int b){
        int maxi;
        if (a > b){
            maxi = a;
        }else {
            maxi = b;
        }
        return maxi;
    }
    public static int min(int a, int b){
	if (a > b){
	    return b;
	}else {
	    return a;}
    }
    //Takes two double data types and returns the value of the greater double
    public static double max(double a, double b){
        double maxd;
        if (a > b){
            maxd = a;
        }else {
            maxd = b;
        }
        return maxd;
    }
    //Takes two integer data types and returns their geometric mean as an integer
    public static int geoMean(int a, int b){
        int gavgi;
        gavgi = (int) Math.sqrt(a * b);
        return gavgi;
    }
    //Takes two double data types and returns their geometric mean as a double
    public static double geoMean(double a, double b){
        double gavgd;
        gavgd = Math.sqrt(a * b);
        return gavgd;
    }
    public static int max(int a, int b, int c){
	return max( max(a, b), c);
    }
    public static double max(double a, double b, double c){
	return max( max(a, b), c);
    }
    public static int geoMean(int a, int b, int c){
	return (int) Math.cbrt(a * b * c);
    }
    public static double geoMean(double a, double b, double c){
	return Math.cbrt(a * b * c);
    }

    //gcd - systematically goes through every number up to the smallest number
    //      given and returns the highest number by which both a and b are
    //      divisible
    public static int gcd(int a, int b){
	int rtrn = 1;
	int counter = 1;
	int smol = min(a,b);
	while (counter <= smol){
	    if (a % counter == 0 && b % counter == 0){
		rtrn = counter;
	    }
	    counter += 1;
	}
	return rtrn;
    }

    //gcdER - if b is divisible by a, returns a, or else finds the gcd of
    //        the smaller number, and the biggest number - the smaller
    //        number
    public static int gcdER(int a, int b){
	if (b % a == 0){
	    return a;
	}else {
	    int big = max(a, b);
	    int smol = min(a, b);
	    return gcdER(big - smol, smol);
	}
    }

    //gcdEW - if b is divisible by a, returns a, or else keeps subtracting the
    //        bigger number by the smaller number until one of them reach 0,
    //        and the subtrahend is the gcd
    public static int gcdEW(int a, int b){
	int big = max(a, b);
	int smol = min(a, b);
	if (b % a == 0){
	    return a;
	}else {
	    while(big != 0 && smol != 0){
		int q = min(big, smol);
		big = max(big, smol);
		smol = q;
		big -= smol;
	    }
	    return smol;
	}
    }
    //Overloaded methods are used when their paramaters differ and they both have their own fucntion within the overloaded method
    public static void main(String[] args) {
	/*        System.out.println(mean(2, 4));//3
        System.out.println(mean(2, 5));//3
        System.out.println(mean(2.0, 4.0));//3.0
        System.out.println(mean(2.0, 5.0));//3.5
        System.out.println(max(3, 2));//3
        System.out.println(max(3, 3));//3
        System.out.println(max(3, -4));//4
        System.out.println(max(3.0, 2.0));//3.0
        System.out.println(max(3.4, 3.2));//3.4
        System.out.println(max(3, 4.0));//4.0
        System.out.println(max(3.0, 4));//4.0
        System.out.println(geoMean(4, 9));//6
        System.out.println(geoMean(5, 9));//6
        System.out.println(geoMean(5.0, 9));//6.708203932499369
        System.out.println(geoMean(-4, -9.));//6.0
        System.out.println(geoMean(-4, 9.));//NaN */
        System.out.println(gcdER(15, 20));
        System.out.println(gcdER(2, 4));
        System.out.println(gcdER(10, 29));
        System.out.println(gcdER(30, 81));
	System.out.println(gcdEW(15, 20));
        System.out.println(gcdEW(2, 4));
        System.out.println(gcdEW(10, 29));
        System.out.println(gcdEW(30, 81));
	System.out.println(gcd(15, 20));
        System.out.println(gcd(2, 4));
        System.out.println(gcd(10, 29));
        System.out.println(gcd(30, 81)); 
    }
}
