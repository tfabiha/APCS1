public class Skeleton {
    public static void main(String[] args) {
        int[] nums1 = {10,10,10};
        int[] nums2 = {1,2,3,4,5,6};
	printArray(nums2);
	nums2 = nums1;
        printArray(nums2);
    }

    public static int lengthOf(String str) {
	for (int x = 0; x < str.length(); x++) {
	}
	System.out.println(x);
    }

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
}
