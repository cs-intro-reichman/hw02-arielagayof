/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int sum = 1;
		String output1 = N + " is a perfect number since " + N + " = 1";
		String output2 = N + " is not a perfect number";
		for (int i=2; i<N; i++) {
			if ((N % i) == 0) {
				output1 = output1 + " + " + i;
				sum = sum + i;
		}
	}
		if (sum == N) {
			System.out.println(output1);
		} else {
			System.out.println(output2);
		}
	}
}
