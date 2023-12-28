/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String argument = args[0];
		int n = argument.length();
		for (int i = (n - 1); i > -1; i--) {
			System.out.print(argument.charAt(i));
		}
		System.out.println();
		System.out.println("The middle character is " + argument.charAt((n-1) / 2));
	}
}
