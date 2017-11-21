public class Testing {
    public static void main(String[] args) {
	//STATS numbers = new Stats();
	
	// System.out.println
	System.out.println("======================");
	System.out.println("TESTING INT MEAN");
	System.out.println("\n#####################");
	System.out.println("mean of 2 and 4:");
	System.out.println(Stats.mean(2,4)); // 3
	System.out.println("\n#####################");
	System.out.println("mean of 4 and 4:");
	System.out.println(Stats.mean(4,4)); // 4
	System.out.println("\n#####################");
	System.out.println("mean of 8 and 4:");
	System.out.println(Stats.mean(8,4)); // 6
	System.out.println("\n#####################");
	System.out.println("mean of 1 and 4:");
	System.out.println(Stats.mean(1,4)); // 2
	System.out.println("\n#####################");
	System.out.println("mean of -7 and 4:");
	System.out.println(Stats.mean(-7,4)); // 3
	System.out.println("#####################\n");
	System.out.println("======================");

	System.out.println("======================");
	System.out.println("TESTING DOUBLE MEAN");
	System.out.println("\n#####################");
	System.out.println("mean of 2.0 and 4.0:");
	System.out.println(Stats.mean(2.0,4.0)); // 3.0
	System.out.println("#####################\n");
	System.out.println("======================");

	System.out.println("======================");
	System.out.println("TESTING INT MAX");
	System.out.println("\n#####################");
	System.out.println("max of 2 and 4:");
	System.out.println(Stats.max(2,4)); // 4
	System.out.println("\n#####################");
	System.out.println("max of 4 and 4:");
	System.out.println(Stats.max(4,4)); // 4
	System.out.println("\n#####################");
	System.out.println("max of 6 and 4:");
	System.out.println(Stats.max(6,4)); // 6
	System.out.println("\n#####################");
	System.out.println("max of -2 and -4:");
	System.out.println(Stats.max(-2,-4)); // -2
	System.out.println("#####################\n");
	System.out.println("======================");

	System.out.println("======================");
	System.out.println("TESTING DOUBLE MAX");
	System.out.println("\n#####################");
	System.out.println("mean of 2.0 and 4.0:");
	System.out.println(Stats.max(2.0,4.0)); // 3.0
	System.out.println("#####################\n");
	System.out.println("======================");

	System.out.println("======================");
	System.out.println("TESTING INT GEOMEAN");
	System.out.println("\n#####################");
	System.out.println("mean of 2 and 4:");
	System.out.println(Stats.mean(2,4)); // 2
	System.out.println("\n#####################");
	System.out.println("mean of 2 and 1:");
	System.out.println(Stats.mean(2,1)); // 1
	System.out.println("#####################\n");
	System.out.println("======================");

	System.out.println("======================");
	System.out.println("TESTING DOUBLE GEOMEAN");
	System.out.println("\n#####################");
	System.out.println("mean of 2.0 and 4.0:");
	System.out.println(Stats.mean(2.0,4.0)); // 3.0
	System.out.println("\n#####################");
	System.out.println("mean of 2.0 and 1.0:");
	System.out.println(Stats.mean(2.0,1.0)); // 1.5
	System.out.println("\n#####################");
	System.out.println("mean of 2.0 and 2.0:");
	System.out.println(Stats.mean(2.0,2.0)); // 2.0
	System.out.println("\n#####################");
	System.out.println("mean of 3.0 and 6.0:");
	System.out.println(Stats.mean(3.0,6.0)); // 4.5
	System.out.println("#####################\n");
	System.out.println("======================");

	System.out.println("======================");
	System.out.println("TESTING DOUBLE MAX OF 3");
	System.out.println("\n#####################");
	System.out.println("mean of 2.0 3.0, and 4.0:");
	System.out.println(Stats.max(2.0,3.0,4.0)); // 3.0
	System.out.println("#####################\n");
	System.out.println("======================");

	System.out.println("======================");
	System.out.println("TESTING INT MAX");
	System.out.println("\n#####################");
	System.out.println("mean of 2, and 4:");
	System.out.println(Stats.max(2,4)); // 3
	System.out.println("#####################\n");
	System.out.println("======================");
	
	System.out.println("======================");
	System.out.println("TESTING INT MAX OF 3");
	System.out.println("\n#####################");
	System.out.println("mean of 2, 3 and 4:");
	System.out.println(Stats.max(2,3,4)); // 3
	System.out.println("#####################\n");
	System.out.println("======================");

	System.out.println("======================");
	System.out.println("TESTING INT GEOMEAN OF 3");
	System.out.println("\n#####################");
	System.out.println("mean of 2, 3 and 4:");
	System.out.println(Stats.geoMean(2.0,3.0,4.0)); // 2
	System.out.println("\n#####################");
	System.out.println("mean of 2,5 and 1:");
	System.out.println(Stats.geoMean(2,5,1)); // 1
	System.out.println("#####################\n");
	System.out.println("======================");
    }
}
