package no_1463_fail;

public class Main {
	public static void main(String[] args) {
		int n = read();
		int count = 0;
		
		while(n > 1) {
			if(n > 5 || n == 3) {
				count += n % 3 + 1;
				n /= 3;
			}else {
				count += n % 2 + 1;
				n /= 2;
			}
		}
		System.out.println(count);
	}
	static int read() {
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
