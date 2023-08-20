package examples;

public class Loop {

	public static void main(String[] args) {
		System.out.println("Starts...");
		int n=1;
		ram : while(n<=10) {
		 int  m = 1;
		 ramm : while(m<=10) {
			 System.out.print("* ");
			 m++;
			 break ram;
		 }
		 System.out.println();
         n++;
	}
	}
}
