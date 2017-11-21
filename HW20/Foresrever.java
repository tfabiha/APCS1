public class Foresrever {

    // uses the for loop to return the number of posts specified
    // by the parameter
    public static String fenceF(int posts) {
	// initializes fence, will be used to store the value to
	// be returned
	String fence = "";

	// remPosts counts how many posts are remaining to be added
	// when it hits zero, all the posts have been added
	for (int remPosts = posts; remPosts > 0; remPosts--) {
	    if (remPosts == 1) {
		fence += "|";
	    } else {
		fence += "|--";
	    }
	}

	return fence;
    }// end FenceF

    // uses the for loop to return the reverse of the given string
    public static String reverseF(String s) {
	// initializes newS, will be used to store the value to
	// be returned
        String newS = "";

	// len is initialized with the length of s in order to move
	// backwards, from right to left. when len hits 0, there are no
	// letters remaining
	for (int len = s.length(); len > 0; len--) {
	    // one letter is taken at a time, from right to left
	    newS += s.substring(len - 1, len);
	}
	
	return newS;
    }// end reverseF


    public static String reverseR(String s) {
	if (s.length() == 1) {
	    return s;
	}

	// reverseR(s.substring(1)) - uses recursion to find the
	//                            reverse of the word without the
	//                            first letter
	// returns ^ + the first letter at the end
	return reverseR(s.substring(1)) + s.substring(0,1);
    }// end reverseR
    
    public static void sop(String thing) {
	System.out.println(thing);
    }
    public static void main(String[] args) {
	sop("For loop fence.");
	sop("0 posts");
	sop(Foresrever.fenceF(0));// 
	sop("1 post");
	sop(Foresrever.fenceF(1));// |
	sop("2 posts");
	sop(Foresrever.fenceF(2));// |--|
	sop("8 posts");
	sop(Foresrever.fenceF(8));// |--|--|--|--|--|--|--|

	sop("======================");

	sop("For loop reverse.");
	sop("hello -> "+Foresrever.reverseF("hello"));// olleh
	sop("stressed -> "+Foresrever.reverseF("stressed"));// desserts

	sop("======================");

	sop("For loop recursive.");
	sop("hello -> "+Foresrever.reverseR("hello"));// olleh
	sop("stressed -> "+Foresrever.reverseF("stressed"));// desserts
    }
    
}//end class
