package no_10989;

public class Main_2 {
	public static void main(String[] args) {
		int n = read();
		int[] countSort = new int[10_001];
		
		for(int i = 0; i < n; i++) {
			int num = read();
			countSort[num]++;
		}
		
		StringBuilder stb = new StringBuilder();
		for(int i = 0; i < 10001; i++) {
			while(countSort[i]-->0) {
				stb.append(i).append("\n");
			}
		}
		System.out.println(stb);
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
