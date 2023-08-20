package examples;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the Name ");
			String name = scan.nextLine();
			System.out.println("Enter the Year of Birth ");
			int dob = scan.nextInt();
			greet(name);
			int res = calculating(dob);
			System.out.println("You are "+res+" years old");
		}
        
        
	}
	public static void greet(String name) {
		System.out.println("Hello "+name+"...");
	}
	
	public static int calculating(int dob) {
		return 2023-dob;
	}

}
