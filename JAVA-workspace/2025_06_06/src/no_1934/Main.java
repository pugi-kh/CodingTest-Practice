package no_1934;

public class Main {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();
		int n = read();
		for(int i = 0; i < n; i++) {
			int a = read();
			int b = read();
			if(a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			int lcm = b;
			while((lcm % a) != 0) {
				lcm += b;
			}
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
}
