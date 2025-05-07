package no_14681;
// 사분면 고르기

import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) {
		
		String quadrant = "1243";
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt() > 0 ? 0 : 1;
		int y = sc.nextInt() > 0 ? 0 : 2;
		sc.close();
		
		System.out.println(quadrant.charAt(x + y));
	}
}