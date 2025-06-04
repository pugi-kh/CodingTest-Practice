package no_1436_fail;

public class Main {
	public static void main(String[] args) {
		int n = readInt();
		int number = 666;
		
		while(true) {
			if(String.valueOf(number).contains("666")) {
				n--;
				if(n == 0) {
					System.out.println(number);
					break;
				}
			}
			number++;
		}
	}
//		괜히 어렵게 풀려고 하다가 틀린 방식이래 지피티가...
//		완전탐색으로 재시도
//		int res = 0;
//		int front = 0;
//		int back = 0;
//		int backLen = 1;
//		while(n > 0) {
//			res = (front * (backLen * 1000)) + (666 * backLen) + back;
//			
//			if(front < 5) {
//				if(back + 1 < backLen) {
//					back++;
//				}else {
//					front++;
//				}
//			}else {
//				front = 0;
//				backLen *= 10;
//				back = 0;
//			}
//			n--;
//		}
//		System.out.println(res);
	
	static int readInt() {
		int c, n = 0;
		try {
			while((c = System.in.read()) <= 32);
			n = c & 15;
			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (Exception e){}
		return n;
	}
}