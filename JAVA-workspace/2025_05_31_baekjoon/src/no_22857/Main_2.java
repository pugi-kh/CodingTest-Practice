package no_22857;

// class명 변경 후 제출
public class Main_2 {
	public static void main(String[] args) {
		int len = read();
		int delCount = read();
		
		boolean[] isEven = new boolean[len];
		for(int i = 0; i < len; i++) {
			isEven[i] = (read() % 2 == 0);
		}
		
		int maxEvenLen = 0;
		for(int i = 0; i < len; i++) {
			int delLeft = delCount;
			int tempLen = 0;
			for(int j = i; j < len; j++) {
				if(isEven[j]) {
					tempLen++;
				}else if(delLeft > 0) {
					delLeft--;
				}else {
					break;
				}
			}
			if(tempLen > maxEvenLen) maxEvenLen = tempLen;
		}
		
		System.out.println(maxEvenLen);
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
