// T. Fabiha
// APCS1 pd2
// HW25 -- All Hallow's Eve
// 2017-11-01
public class Loopier {
    
    // populate - fills the given array with random integers (0, 1000]
    // precond - nums != null
    public static void populate(int[] nums) {
        for (int x = 0; x < nums.length; x++) {
	    nums[x] = (int) (Math.random() * 1000);
	}
    }

    // printArray - prints all the elements in a list
    // precond - nums != null
    public static void printArray(int[] nums) {
        String ret = "{";
        
        for (int x = 0; x < nums.length; x++) {
            if (x != 0) {
                ret += ", ";
            }
            
            ret += nums[x];
        }

	ret += "}";
	System.out.println(ret);
    }

    // linSearch - iteratively searches through the array and returns the first
    //             index at which the target number is found
    // precond - a != null
    // postcond - foo = {1, 2, 3, 4}
    //            linSearch(foo, 3) => 2
    //            linSearch(foo, 10) => -1
    public static int linSearch(int[] a, int target) {
        for (int x = 0; x < a.length; x++) {
            if (a[x] == target) {
                return x;
            }
        }
        
        return -1;
    }

    // linSearchR - recursively  searches through the array and returns the
    //              first index at which the target number is found
    // precond - a != null
    // postcond - foo = {1, 2, 3, 4}
    //            linSearchR(foo, 3) => 2
    //            linSearchR(foo, 10) => -1
    public static int linSearchR(int[] a, int target) {
        
	if (a.length == 0) {
	    return -1;
	}

	int[] retArray = new int[a.length - 1];
	truncateEnd(a, retArray);

	// looks at the last element
	//       if it is the target, returns the index
	//       else just looks at the next element
	if (a[a.length - 1] == target) {
	    return a.length - 1;
	}
        
	return linSearchR(retArray, target);

    }

    // truncateEnd - sets news to orig, but without the last element
    // precond - orig, new != null
    // postcond - orig = {1, 2, 3} => news = {1, 2}
    public static void truncateEnd(int[] orig, int[] news) {
	for (int x = 0; x < news.length; x++) {
	    news[x] = orig[x];
	}
    } 

    // freq - iteratively searches through the array and counts the
    //        number of times the target number is found
    // precond - a != null
    // postcond - boo = {1, 1, 2, 1, 3, 3, 5, 6, 1, 0}
    //            freq(boo, 1) => 4
    //            freq(boo, 10) => 0
    public static int freq(int[] a, int target) {
        int counter = 0;
        
        for (int x = 0; x < a.length; x++) {
            if (a[x] == target) {
                counter += 1;
            }
        }
        
        return counter;
    }
    
    // freqRec - recursively searches through the array and counts the
    //           number of times the target number is found
    // precond - a != null
    // postcond - boo = {1, 1, 2, 1, 3, 3, 5, 6, 1, 0}
    //            freqRec(boo, 1) => 4
    //            freqRec(boo, 10) => 0
    public static int freqRec(int[] a, int target) {
	if (a.length == 0) {
	    return 0;
	}

	int[] retArray = new int[a.length - 1];
	truncateEnd(a, retArray);

	// looks at the last element
	//       if it is the target, adds 1 to the overall and looks at
	//         the next element
	//       else just looks at the next element
	if (a[a.length - 1] == target) {
	    return 1 + freqRec(retArray, target);
	}

	return freqRec(retArray, target);
    }

    public static void main(String[] args) {
	int[] arr = new int[5];
	
	populate(arr);
	System.out.println("Print randomized array:");
	printArray(arr);

	int[] foo = {1, 2, 3, 4, 5};
	System.out.println("linSearch test:");
	System.out.println(linSearch(foo, 3)); // 2
	System.out.println(linSearch(foo, 6)); // -1
	System.out.println("linSearchR test:");
	System.out.println(linSearchR(foo, 3)); // 2
	System.out.println(linSearchR(foo, 6)); // -1

	int[] boo = {1, 1, 2, 1, 3, 3, 5, 6, 1, 0};
	System.out.println("freq test:");
	System.out.println(freq(boo, 1)); // 2
	System.out.println(freq(boo, 12)); // -1
	System.out.println("frecRec test:");
	System.out.println(freqRec(boo, 1)); // 2
	System.out.println(freqRec(boo, 12)); // -1
	
	
    }
}
