package no_22857;

// class명 변경 후 제출
public class Main_3 {
	public static void main(String[] args) {
		int len 			= readInt();
		int delCount 	= readInt();
		
		boolean[] isEven = new boolean[len];
		for(int i = 0; i < len; i++) {
			isEven[i] = (readInt() % 2 == 0);
		}
		
		int start 			= 0;
		int end 				= 0;
		int odd 				= 0;
		int maxEvenLen 	= 0;
		
		while(end < len) {
			if(isEven[end++]) { // 마지막 자리가 짝수이면 한칸 이동
				if(end == len) { // 마지막이 끝까지 가고 짝수일 경우
					
				}
			}else if(odd < delCount) { // 마지막이 홀수인데 홀수의 개수가 삭제가능한 수보다 적을 경우
				odd++;
			}else { // 마지막이 홀수이고, 삭제가능한 홀수가 없을 경우
				end--; // 우선 end를 짝수범위로 가져오고
			} 
		}
		
		System.out.println(maxEvenLen);
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
