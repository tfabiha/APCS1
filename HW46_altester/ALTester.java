// Tabassum Fabiha
// APCS1 pd2
// HW46 -- Al<B> Sorted!
// 2017-12-05 t

import java.util.ArrayList;

public class ALTester {

    public static boolean isSorted(ArrayList list) {
	/*if (list.size() < 3) {
	    return true;
	    }*/

        int multiplier;
	boolean retBoo = true;
	if ((int) list.get(0) - (int) list.get(1) < 0) {
	    multiplier = -1;
	} else {
	    multiplier = 1;
	}

	for (int x = 0; x < list.size() - 1; x++) {
	    int diff = (int) list.get(x) - (int) list.get(x+1);
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
