package no_2439;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int num = 0;
		num = sc.nextInt();
		char[] result = new char[num];
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) result[j] = ' ';
			for(int j = 0; j <= i; j++) {
				result[num-1-j] = '*';
			}
			pw.println(result);
		}
		pw.flush();
		sc.close();		
	}
}
