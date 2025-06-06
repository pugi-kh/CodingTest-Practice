package methodLibrary;

public class GCD_LCM {
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
