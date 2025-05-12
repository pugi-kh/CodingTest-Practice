package no_2884;
//알람 시계

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		min -= 45;
		
		if(min < 0) {
			min += 60;
			hour -= 1;
		}
		if(hour < 0) hour += 24;
		
		System.out.println(hour + " " + min);
		
	}
}
