package no_24313;

// f(n), g(n) -> 1차 함수
// 최고차항의 계수가 f(n)는 음수, 양수 가능 / g(n)는 양수만 1 ~ 100 사이
// a1*n + a2 <= c * g(n)
// a1 + a2 <= c * n0
// a1 <= c

public class Main {
	public static void main(String[] args) {
		int a1 	= read();
		int a2 	= read();
		int c 	= read();
		int n0 	= read();
		
		if(a1 * n0 + a2 <= c * n0) {
			if(a1 <= c) System.out.println(1);
			else System.out.println(0);
		}else {
			System.out.println(0);
		}
	}
	
	static int read() {
		int c, n = 0;
		boolean plus = true;
		try {
			while((c = System.in.read()) <= 32);
			if(c == 45) { 
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
