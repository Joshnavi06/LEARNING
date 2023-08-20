package examples;

public class Looping {

	public static void main(String[] args) {
		int m=1;
		ram : do {
			int n=1;	
		      do {
			    System.out.print("* ");
			    n++;
			    break ;
		       }while(n<=5);
            System.out.println("* ");
            m++;
            break;
	       }while(m<=5);

	}

}
