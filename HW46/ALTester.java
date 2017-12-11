// Tabassum Fabiha
// APCS1 pd2
// HW46 -- Al<B> Sorted!
// 2017-12-05 t

import java.util.ArrayList;

public class ALTester {

    public static boolean isSorted(ArrayList<Comparable> list) {
	// if the size is less that 3, it is automatically considered sorted 
	if (list.size() < 3) {
	    return true;
	}

        int multiplier;
	boolean retBoo = true;
	// if the element at index 0 is less that element at index 1
	// then multiplier is -1
	// else, if either 0 or positive, multiplier should be 1
	// multiplier is later going to be multiplied by the difference between
	//      all adjacent elements to see if they are going in the same
	//      order
	if (list.get(0).compareTo( list.get(1)) < 0) {
	    multiplier = -1;
	} else {
	    multiplier = 1;
	}

	for (int x = 0; x < list.size() - 1; x++) {
	    // diff is going to be positive, zero, or negative
	    // if it is positive or zero, then for the list to be sorted, it is
	    //     in descending order
	    // if it is negative, then for the list to be sorted, it is in
	    //     ascending order
	    int diff = list.get(x).compareTo(list.get(x+1));

	    // multiplying by the multiplier should make the diff positive
	    retBoo = retBoo && abs(diff) == diff * multiplier;
	}

	return retBoo;
    }

    
    public static int abs(int a) {
	if (a < 0) {
	    a *= -1;
	}
	return a;
    }
    
    public static void printAL(ArrayList list) {
	String ret = "[";
	for (int x = 0; x < list.size(); x++) {
	    if (x != 0) {
		ret += ",";
	    }

	    ret += list.get(x);
	}
	ret += "]";
	
	System.out.println(ret);
    }
    
    public static void main(String[] args) {
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
	System.out.println("Printing newly initialized foo:");
	printAL(foo);
	
	for (int x = 0; x < 23; x++) {
	    foo.add((int) (Math.random() * 100));
	}

	System.out.println("Printing array foo:");
        printAL(foo);

	System.out.println("Is foo sorted?");
	System.out.println(isSorted(foo));

	System.out.println("----------------------");

	ArrayList<Comparable> boo = new ArrayList<Comparable>();
	System.out.println("Printing newly initialized boo:");
	printAL(boo);
	
	for (int x = 0; x < 23; x++) {
	    boo.add(x);
	}

	System.out.println("Printing array boo:");
        printAL(boo);

	System.out.println("Is boo sorted?");
	System.out.println(isSorted(boo));

	System.out.println("----------------------");

	ArrayList<Comparable> doo = new ArrayList<Comparable>();
	System.out.println("Printing newly initialized doo:");
	printAL(doo);
	
	for (int x = 0; x < 23; x++) {
	    doo.add(3);
	}

	System.out.println("Printing array doo:");
        printAL(doo);

	System.out.println("Is doo sorted?");
	System.out.println(isSorted(doo));
    }
}
