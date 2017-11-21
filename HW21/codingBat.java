public class codingBat {
    public static boolean catDog(String str) {
	int cats = count("cat", str);
	int dogs = count("dog", str);
	sop(cats);
	sop(dogs);
	return cats == dogs;
    }

    public static int count(String name, String str) {
	int counter = 0;
	int length = str.length() - name.length();
	int len_name = name.length();
  
	for (int x = 0; x <= length; x++) {
	    if (str.substring(x, x+len_name).equals(name)) {
		counter++;
	    }
	}
  
	return counter;
    }

    public static boolean xyzThere(String str) {
	int counter = 0;


	for (int x = 0; x < str.length() - 2; x++) {
	    if (str.substring(x,x+3).equals("xyz")) {
		counter++;
		
	    }
	    sop(counter);
  
	}
	for (int x = 0; x < str.length() - 3; x++) {
	    if (str.substring(x, x+4).equals(".xyz")) {
		counter--;
	    }
	    sop(counter);
	}
  
	return counter > 0;
    }

    public static void sop(String s) {
	System.out.println(s);
    }

    public static void sop(boolean s) {
	System.out.println(s);
    }

    public static void sop(int s) {
	System.out.println(s);
    }
    
    public static void main(String[] args) {
	//sop(catDog("catdog"));
        sop(xyzThere("abx.xxyz"));
	sop(xyzThere("xyz"));
    }
}
