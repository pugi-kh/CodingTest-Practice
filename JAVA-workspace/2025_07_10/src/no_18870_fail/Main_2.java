package no_18870_fail;

public class Main_2 {
	public static void main(String[] args) {
		
		int n = read();
		int[] inputs = new int[n];
		
		for(int i = 0; i < n; i++) {
			int num = read();
			inputs[i] = num;
		}
		
	}
	
	static int read() {
		int c, n = 0;
		boolean plus = true;
		try {
			while ((c = System.in.read()) <= 32);
			if(c == '-') {
				plus = false;
				c = System.in.read();
			}
			n = c & 15;
			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return plus ? n : -n;
	}
}
