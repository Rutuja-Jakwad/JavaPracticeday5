package javapracticeday5;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of A and B:");
			a = sc.nextInt();
			b = sc.nextInt();
		
		System.out.println("Before swapping Numbers: " + a +" " + b);
        
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping : " + a +" " + b);
        System.out.println( );
	}

}
