package no_2438;

import java.util.Scanner;

public class Main_2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()) { // 입력 확인 후 실행
			int count = sc.nextInt();
			printStars(count); // 실행
			sc.close();
		}else {
			System.out.println("정수를 입력해주세요.");
		}
	}
	
	public static void printStars(int count) { // 결과를 출력하는 메서드
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= count; i++) {
			for(int j = 0; j < i; j++) sb.append('*');
			sb.append(System.lineSeparator());
		}
		System.out.println(sb);
	}
}
