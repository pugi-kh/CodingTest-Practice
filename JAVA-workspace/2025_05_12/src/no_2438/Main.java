package no_2438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) sb.append('*');
//			sb.append('\n');
			sb.append(System.lineSeparator());
		}
		System.out.println(sb);
	}
}
