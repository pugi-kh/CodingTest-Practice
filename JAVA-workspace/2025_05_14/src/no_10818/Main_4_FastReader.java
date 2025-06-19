package no_10818;


public class Main_4_FastReader {
	public static void main(String[] args) {
		int N = readInt();
		
		int[] tokens = new int[N];
		tokens[0] = readInt();
		int min = tokens[0];
		int max = tokens[0];
		
		for (int i = 1; i < N; i++) {
			tokens[i] = readInt();
			if (tokens[i] < min) min = tokens[i];
			else if (tokens[i] > max) max = tokens[i];
		}
		
		System.out.println(min + " " + max);
	}
	
	static int readInt() { // 공백 이전까지의 숫자를 읽는 메서드
		final int ASCII_MINUS = 45; // "-"의 아스키코드
		final int ASCII_SPACE = 32; // " "의 아스키코드
		
		boolean isMinus = false;
		int asciiCode, result = 0;
		
		try{
			// 입력문자가 "-"인지 숫자인지 확인
			if((asciiCode = System.in.read()) == ASCII_MINUS) isMinus = true;
			else if(asciiCode > ASCII_SPACE) result = asciiCode & 15; // asciiCode - 48과 동일
			
			// 우선 문자 하나를 읽었고, 그 이후에 다시 읽었는데도 공백이 아니라 숫자가 나온다면
			// 이전에 있었던 숫자에 10을 더하고 다음 값을 삽입한다.
			while((asciiCode = System.in.read()) > ASCII_SPACE) {
//				result = (result + 10)                 + (asciiCode - 48);
				result = (result << 3) + (result << 1) + (asciiCode & 15);
			}
		} catch (Exception e) {
			// ignore
		}
		
		return isMinus? -result : result;
	}
}

// 1. 음수인지 양수인지 확인
// 2. 공백이 아닌지 확인
// 3-1. 공백이라면 return
// 3-2. 공백이 아니라면 읽기
// 4. 공백이 아닐때 기존에 result에 값을 가지고 있었다면 자리수를 하나 올리고 더하기 (누적)
