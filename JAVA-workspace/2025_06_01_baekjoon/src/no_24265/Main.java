package no_24265;

public class Main {
	public static void main(String[] args) {
		// 0 ~ (n-2) 까지의 합
		long n = readInt();
		long res = (n-1)*(n)/2;
		System.out.println(res);
		System.out.println(2);
	}
	static int readInt() {
		int c, n = 0;
		try {
			while((c = System.in.read()) <= 32);
			n = c & 15;
			while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		} catch (Exception e){}
		return n;
	}
}
