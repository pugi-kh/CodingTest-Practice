package no_14681;
// 사분면 고르기

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// y가 -인가? => 0, 1
		// x가 -인가? => 0, 1
		
		int[][] quadrant = {
							{2, 1},
							{3, 4}
							};
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		System.out.println(quadrant[y > 0 ? 0 : 1][x > 0 ? 1 : 0]);
	}
}

// 	python 답안 중..
//	X = int(input()) < 0
//	Y = int(input()) < 0
//	print("1243"[X + (Y << 1)])
