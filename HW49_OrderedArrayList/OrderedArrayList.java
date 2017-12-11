// Tabassum Fabiha
// APCS1 pd2
// HW#49 -- Halving the Halves
// 2017-12-08 f

/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList {
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() {
	_data = new ArrayList<Comparable>();    
    }


    public String toString() {
	return _data.toString(); 
    }


    public Comparable remove( int index ) {	
	return _data.remove(index); 
    }


    public int size() { 
	return _data.size();
    }

    
    public Comparable get( int index ) { 
	return _data.get(index); 
    }


    /***
     * add takes as input any comparable object 
     * (i.e., any object of a class implementing interface Comparable)
     * inserts newVal at the appropriate index
     * maintains ascending order of elements
     * uses a linear search to find appropriate index
     ***/
    public void add( Comparable newVal ) { 
	for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
		//newVal < oal[p]
		_data.add( p, newVal );
		return; //Q:why not break?
	    }
	}
	_data.add( newVal ); //newVal > every item in oal, so add to end 
    }

    // wraps around recursive function, which does the actual placement
    public void addBin(Comparable newVal) {
	addBinHelper(newVal, 0, _data.size());
    }

    public void addBinHelper(Comparable newVal, int _lo, int _hi) {
	// if _lo and _hi are equal, then the correct index must have been found
	if (_lo == _hi) {
	    _data.add(_lo, newVal);
	    return;
	}

	int index = (_lo + _hi) / 2; // average of _lo and _hi

	if (_data.get(index).compareTo(newVal) > 0) {
	    // if the item at the index is > newVal
	    // then that index could be there
	    _hi = index;
	} else {
	    // if the item at the index is <= to newVal
	    // then the newVal has to be at the very least
	    // the index right after
	    _lo = index + 1;
	}

	addBinHelper(newVal, _lo, _hi);
    }


    // main method solely for testing purposes
    public static void main( String[] args ) {
	OrderedArrayList Franz = new OrderedArrayList();

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		
	Franz.addBin(0);
	Franz.addBin(23);
	Franz.addBin(2);
	Franz.addBin(78);
	Franz.addBin(-1);
	Franz.addBin(-2);
	Franz.addBin(-2);

	System.out.println(Franz);
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/	

	// testing linear search
	for( int i = 0; i < 15; i++ )
	    Franz.addBin( (int)( 50 * Math.random() ) );
	System.out.println( Franz );

	//check for sorted-ness
	//if msg does not appear, list was sorted
	for( int i=0; i<Franz.size()-1; i++ ) {
	    System.out.println("at i: " + Franz.get(i) );
	    if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
		System.out.println( " *** NOT sorted *** " );
		break;
	    }
	}
	

    }//end main()

}//end class OrderedArrayList
