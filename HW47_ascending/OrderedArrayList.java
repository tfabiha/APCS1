// Tabassum Fabiha
// APCS1 pd2
// HW47 -- ascending
// 2017-12-05 w

import java.util.ArrayList;

public class OrderedArrayList {
    private ArrayList<Comparable> myList;

    public OrderedArrayList() {
	myList = new ArrayList<Comparable>();
    }

    public boolean add(Object o) {
	// typecast the oject so that you can do compareTo without getting errors
	Comparable myObject = (Comparable) o;
	if (myList.size() < 1) {
	    myList.add(myObject);
	} else if (myList.size() < 2) {
	    // if the list has at only one time, then it adds the newobject
	    // in ascending order
	    if (myObject.compareTo(myList.get(0)) >= 0) {
		myList.add(myObject);
	    } else {
		myList.add(0, myObject);
	    }
	    return true;
	} else {
	    // starts up the recusive method for adding myObject into the list
	    addTo(myObject, 0);
	}
	    return true;
    }

    private void addTo(Comparable o, int after) {
	// if there is no element to the right, then just add it to the end
	if (after >= myList.size()) {
	    myList.add(o);
	} else
	    // if the object is <= the object in index after
	    // add it right before that element
	    if (o.compareTo(myList.get(after)) <= 0) {
	    myList.add(after, o);
	} else
		// since the next element is less than this object
		// look to see if the element after is >= this object
		{
	    addTo(o, after + 1);
	}
    }
    /*
    private boolean addTo(Comparable o, int before, int after) {
	if (after == 0) {
	    myList.add(0, o);
	    return true;
	}
	if (after == myList.size()) {
	    myList.add(o);
	    return true;
	}
	if (o.compareTo(myList.get(before)) > 0 &&
	    o.compareTo(myList.get(after)) <= 0) {
	    myList.add(after, o);
	    return true;
	}
	if (o.compareTo(myList.get(before)) < 0) {
	    addTo(o, before - 1, before);
	    return true;
	}
	
	addTo(o, after, after + 1);
	return true;
	
	
    }
*/
    public void printAL() {
	String ret = "[";
	for (int x = 0; x < myList.size(); x++) {
	    if (x != 0) {
		ret += ",";
	    }

	    ret += myList.get(x);
	}
	ret += "]";
	
	System.out.println(ret);
    }

    public static void main(String[] args) {
	OrderedArrayList mary = new OrderedArrayList();

	mary.add(1);
	mary.add(0);
        mary.add(0);
	mary.add(0);
	mary.add(3);
	mary.add(1);
	
	System.out.println("Printing ordered list mary.");
	mary.printAL();

	OrderedArrayList jeremy = new OrderedArrayList();

	for (int x = 0; x < 15; x++) {
	    jeremy.add((int) (Math.random() * 100));
	}

	System.out.println("Printing ordered list jeremy.");
	jeremy.printAL();
	
    }

}
