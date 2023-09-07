package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("The first integer:");
		int n1 = in.nextInt();
		System.out.print("The second integer:");
		int n2 = in.nextInt();
		double average = (n1 + n2)/2.0;
		System.out.print("average of " + n1 + " and " + n2 + " is " + average);
	}

}
