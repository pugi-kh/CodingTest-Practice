package no_2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A=0,B=0;
		while (!((A > 99) && (A < 1000)) || !((B > 99) && (B < 1000))) {
			A = scan.nextInt();
			B = scan.nextInt();
		}
		scan.close();
		
		System.out.println(A * (B % 10));
		System.out.println((A * ((B % 100) - (B % 10)))/10);
		System.out.println((A * ((B % 1000) - (B % 100)))/100);
		System.out.println(A * B);
		
	}
}
