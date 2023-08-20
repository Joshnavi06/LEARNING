package examples;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = scan.nextInt();
		int count = countSetBits(num);
        System.out.println("Number of set bits: " + count);

	}
	public static int countSetBits(int num) {
		int count = 0;
        while (num != 0) {
            // Bitwise AND with 1 checks if the least significant bit is set (1)
            if ((num & 1) == 1) {
                count++;
            }
            // Right shift to check the next bit
            num >>= 1;
        }
        return count;
	}
	
		


}