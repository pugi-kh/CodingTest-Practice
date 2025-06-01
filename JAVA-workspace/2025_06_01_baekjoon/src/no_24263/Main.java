package no_24263;

public class Main {
	public static void main(String[] args) {
		int input = readInt();
		System.out.println(input);
		System.out.println(1);
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
