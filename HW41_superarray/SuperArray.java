/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray {

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray() {
      _data = new int[10];
      _size = _data.length;
  }


  //output SuperArray in [a,b,c] format
  public String toString() {
      String retStr = "[";

      // adds to retStr all the elements of _data
      for (int x = 0; x < _size - 1; x++) {
	  retStr += _data[x] + ",";
      }
      retStr += _data[_size - 1]+ "]";

      return retStr;
  }


  //double capacity of SuperArray
  private void expand() {
      // initializes a new array with double the size of _data
      int[] n = new int[_size * 2];

      // inputs all the elements of _data into n
      for (int x = 0; x < _size; x++) {
	  n[x] = _data[x];
      }

      _data = n; // sets the location of _data to that of n
      _size = _data.length; // sets the new size of _data
  }


  //accessor -- return value at specified index
  public int get( int index ) {
      return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal ) {
      int oldVal = _data[index];
      _data[index] = newVal;

      return oldVal;
  }


  //main method for testing
  public static void main( String[] args ) {
    
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
