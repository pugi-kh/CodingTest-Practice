package no_1269;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1. 아이디어
		 * 	첫줄에 각 집합의 요소의 갯수 n과 m이 주어짐
		 * 	각 집합을 입력하는데, 두번째 집합을 입력할 때에는 첫번째 집합에 있는 요소인지 확인하고
		 * 	있는 요소라면, 합집합 요소의 갯수 bothCount++
		 * 	n + m - (bothCount * 2) 하면 대칭차집합 요소의 갯수가 출력 
		 * 
		 * 2. 시간복잡도
		 * 	n + m
		 * 
		 * 3. 자료구조
		 * 	Set 1개
		 */
		
		int ANum = read();
		int BNum = read();
		
		Set<Integer> A = new HashSet<Integer>();
		for(int i = 0; i < ANum; i++) {
			A.add(read());
		}
		
		int bothCount = 0;
		for(int i = 0; i < BNum; i++) {
			int input = read();
			if(A.contains(input)) {
				bothCount++;
			}
		}
		
		System.out.println(ANum + BNum - (bothCount * 2));
	}
	
	static int read() {
		int c, n = 0;
		boolean plus = true;
		try {
			while((c = System.in.read()) <= 32);
			if(c == '-') { 
				plus = false;
				c = System.in.read();
			}
			n = c & 15;

			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (Exception e){}
		return plus ? n : -n;
	}
}
