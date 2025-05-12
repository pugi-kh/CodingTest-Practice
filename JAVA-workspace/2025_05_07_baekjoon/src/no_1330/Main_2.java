package no_1330;
//두 수 비교하기

import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short a=0, b=0;
		
		try {
		
			a = sc.nextShort();
			b = sc.nextShort();
		
		} catch (Exception e) {
			e.getMessage();
		} finally {
			sc.close();
		}
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
	}
}
