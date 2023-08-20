package examples;

public class LoopingConcepts {

	public static void main(String[] args) {
		for(int i = 1;i <= 7; i++) {
			System.out.println("Technologies");
			if(i == 3) {
				System.out.println("Kodnest");
				continue;
			}
		}
	}	
}
