package no_2751;

// 이런 풀이도 있네유
// 문제에서 "수는 중복되지 않는다."라고 한 얘기가 해당 방식에 대한 힌트
// 수의 개수 N(1 ≤ N ≤ 1,000,000) 를 봤을 때  Arrays.sort 방식보다 이 방식이 시간 내에 풀기에는 저 안정적

public class Main_2 {
	public static void main(String[] args) {
		int n = readSigned();
		boolean[] list = new boolean[2_000_001]; // -1,000,000 ~ 0 ~ 1,000,000 까지
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			list[readSigned() + 1_000_000] = true;
		}
		
		for(int i = 0; i < 2_000_001; i++) {
			if(list[i]) {
				sb.append(i - 1_000_000).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	static int readSigned() {
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
