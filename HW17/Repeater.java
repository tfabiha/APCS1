// Tabassum Fabiha
// APCS1 pd2
// HW17 -- Do I Repeat Myself??? -> Yeah, like a lot.
//2017-10=16
public class Repeater {

    /* fenceW - While #ofposts is greater than 1, add a post and two lines.
     *          Keep looping until #ofposts is 1, then add just one more post.
     */
    public static String fenceW(int numPosts) {
	String fence = "";
	while (numPosts > 1) {
	    fence += "|--";
	    numPosts -= 1;
	}
	if (numPosts == 1) {
	    fence += "|";
	}
	return fence;
    }

    /* fenceR - If #ofposts is just 1, return just 1 post. If it's more than
     *          that, return a post and two lines, and ask fenceR to find the
     *          fence rest of the fence.
     */
    public static String fenceR(int numPosts) {
	String fence = "";
	if (numPosts == 1) {
	    fence = "|";
	}
	if (numPosts > 1) {
	    fence = "|--" + fenceR(numPosts-1);
	}
	return fence;
    }

    // print shortcut
    public static void sop(String ret) {
	System.out.println(ret);
    }

    // main method
    public static void main(String[] args) {
	sop("1 post w");
	sop(fenceW(1));
	sop("================");
	sop("2 posts w");
	sop(fenceW(2));
	sop("================");
	sop("10 posts w");
	sop(fenceW(10));
	sop("================");
	sop("1 post r");
	sop(fenceR(1));
	sop("================");
	sop("2 posts r");
	sop(fenceR(2));
	sop("================");
	sop("10 posts r");
	sop(fenceR(10));
    }
}
