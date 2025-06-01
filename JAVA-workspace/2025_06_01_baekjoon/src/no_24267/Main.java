package no_24267;

public class Main {
	public static void main(String[] args) {
		long n = readInt();
		long res; // ?????
		
		System.out.println(res);
		System.out.println(3);
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
