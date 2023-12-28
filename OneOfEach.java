
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int count = 0;
		String output = "";
		boolean boy = false;
		boolean girl = false;
		while (boy == false || girl == false) {
			count ++;
			double flip = Math.random();
			if (flip < 0.5) {
				output = output + "g ";
				girl = true;
			} else {
				output = output + "b ";
				boy = true;
			}
		}
		System.out.println(output);
		System.out.println("You made it... and you now have " + count + " children.");
	}
}
