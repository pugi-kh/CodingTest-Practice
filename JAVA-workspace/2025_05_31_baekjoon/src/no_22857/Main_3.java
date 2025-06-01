package no_22857;

// class명 변경 후 제출
public class Main_3 {
	public static void main(String[] args) {
		int N = readInt();
		int K = readInt();
		
		boolean[] isEven = new boolean[N];
		for(int i = 0; i < N; i++) {
			isEven[i] = (readInt() % 2 == 0);
		}
		
		int start = 0, end = 0;
		int oddCount = 0;
		int maxLen = 0;
		
		while(end < N) {
			
			if(isEven[end]) {
				end++;
			}else if(oddCount < K) {
				oddCount++;
				end++;
			}else {
				if(!isEven[start]) {
					oddCount--;
				}
				start++;
			}
			
			maxLen = Math.max(maxLen, end-start-oddCount);
			
		}
		
		System.out.println(maxLen);
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
