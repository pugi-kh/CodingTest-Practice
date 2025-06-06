package no_10815;

public class Main_2 {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();

		boolean[] sangGeun_has = new boolean[20_000_001];
		int n = read();
		for(int i = 0; i < n; i++) {
			int index = read() + 10_000_000;
			sangGeun_has[index] = true;
		}
		
		int m = read();
		for(int i = 0; i < m; i++) {
			int index = read() + 10_000_000;
			if(sangGeun_has[index]) stb.append("1 ");
			else stb.append("0 ");
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
