/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
        int totalCount = 0;
        int numWith2 = 0;
        int numWith3 = 0;
        int numWith4 = 0;
	    for (int i = 0; i<T; i++){
	    	int count = 0;
	    	boolean boy = false;
			boolean girl = false;
		while (boy == false || girl == false) {
			count ++;
			totalCount++;
			double flip = Math.random();
			if (flip < 0.5) {
				girl = true;
			} else {
				boy = true;
			}
		}
			if (count == 2) {
				numWith2 ++;
			} else if (count == 3) {
				numWith3++;
			} else {
				numWith4++;
			}
	}
		double average = (double)totalCount / T;
		int common = 0;
		if ((numWith2 >= numWith3) && (numWith2 >= numWith4)) {
			common = 2;
		} else if ((numWith3 >= numWith2) && (numWith3 >= numWith4)) {
			common = 3;
		} else {
			common = 4;
		}
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + numWith2);
		System.out.println("Number of families with 3 children: " + numWith3);
		System.out.println("Number of families with 4 or more children: " + numWith4);
		System.out.print("The most common number of children is " + common);
		if (common == 4) {
			System.out.print(" or more");
		}
		System.out.println(".");
	}
}
