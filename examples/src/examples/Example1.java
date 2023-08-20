package examples;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the Name ");
			String name = scan.nextLine();
			greet(name);
		}
        
        
	}
	public static void greet(String name) {
		System.out.println("Hello "+name+"..."+" How Are you ..");
		
	}
	

}
