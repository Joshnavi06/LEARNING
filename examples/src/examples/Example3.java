package examples;
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the inputs ");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		System.out.println(galacticAddition(num1,num2));
		// we can write like this also because to reduce time and lines of code
		// to minimize space and memory
		/* long res = (galacticAddition(num1,num2);
		   System.out.println(res);
		*/
	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}
