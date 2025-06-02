package no_1436;

public class Main {
	public static void main(String[] args) {
		int n = readInt();
		int res = 0;
		int front = 0;
		int back = 0;
		int backLen = 1;
		while(n > 0) {
			// 666 ~ 5666
			// 6660 ~ 6669
			// 16660 ~ 16669
			// 56660 ~ 56669
			// 66600 ~ 66699
			res = (front * (backLen * 1000)) + (666 * backLen) + back;
			
			if(front < 5) {
				if(back + 1 < backLen) {
					back++;
				}else {
					front++;
				}
			}else {
				front = 0;
				backLen *= 10;
				back = 0;
			}
			n--;
		}
		//다시
		System.out.println(res);
	}
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
