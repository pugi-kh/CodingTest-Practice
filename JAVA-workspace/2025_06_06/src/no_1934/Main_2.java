package no_1934;
// 두 수의 곱 / 최대공약수 => 최소공배수가 되는 원리를 이용
public class Main_2 {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();
		int n = read();
		for(int i = 0; i < n; i++) {
			int a = read();
			int b = read();
			int gcd = gcd(a, b);
			int lcm = a * b / gcd;
			stb.append(lcm).append("\n");
		}
		System.out.println(stb);
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
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
