/* Tabassum Fabiha
 * APCS1 pd2
 * HW13 -- May ah Hahv S'maur, Please?
 * 2017-10-08
 */

public class Stats {

    
    ///////////
    //METHODS//
    ///////////
    
    /* mean: returns the mean of two given integers
     * precondition: params are passed in specified order
     * postcondition: an integer is returned
     */
    
    public static int mean(int a, int b) {
        int i;
	i = (a + b) / 2;
	return i;
    }


    
    /* mean: returns the mean of two given doubles
     * precondition: params are passed in specified order
     * postcondition: a double is returned
     */
    
    public static double mean(double a, double b) {
	double d;
	d = (a + b) / 2;
	return d;
    }
    

    
    /* max: returns the max of two given doubles
     * precondition: params are passed in specified order
     * postcondition: a double is returned
     */
    public static double max(double a, double b) {
	if (a > b) {
	    return a;
	} else {
	    return b;
	}
    }


    
    /* max: returns the max of two given integers
     * precondition: params are passed in specified order
     * postcondition: an integer is returned
     */
    
    public static int max(int a, int b) {
	if (a > b) {
	    return a;
	} else {
	    return b;
	}
    }
    
    

    /* max: returns the max of three given doubles
     * precondition: params are passed in specified order
     * postcondition: a double is returned
     */
    public static double max(double a, double b, double c) {
	double bigNumber = max(a, b);
	bigNumber = max(bigNumber, c);
	return bigNumber;
    }



    /* max: returns the max of tree  given integers
     * precondition: params are passed in specified order
     * postcondition: a integer is returned
     */
    public static int max(int a, int b, int c) {
	int bigNumber = max(a, b);
	bigNumber = max(bigNumber, c);
	return bigNumber;
    }



    
    /* geoMean: returns the geometric mean of two given integers
     * precondition: params are passed in specified order
     * postcondition: an integer is returned
     */
    
    public static int geoMean(int a, int b) {
	int number = a * b;
	number = (int) Math.sqrt(number);
	return number;
    }


    
    /* geoMean: returns the geometric mean of two given doubles
     * precondition: params are passed in specified order
     * postcondition: a double is returned
     */

    public static double geoMean(double a, double b) {
	double number = a * b;
	number = Math.sqrt(number);
	return number;
    }



    /* geoMean: returns the geometric mean of three  given integers
     * precondition: params are passed in specified order
     * postcondition: an integer is returned
     */
    
    public static int geoMean(int a, int b, int c) {
	int number = a * b * c;
	number = (int) Math.pow(number, 1./3);
	return number;
    }


    
    /* geoMean: returns the geometric mean of three given doubles
     * precondition: params are passed in specified order
     * postcondition: a double is returned
     */

    public static double geoMean(double a, double b, double c) {
	double number = a * b * c;
	number = Math.pow(number, 1./3);
	return number;
    }
}
