package no_10816;

/*
 * 1. 아이디어
 * 		-10,000,000 ~ 10,000,000 을 범위로 하는 int 배열 선언
 * 		new int[20,000,001]
 * 		상근이가 가지고 있는 숫자 카드가 있으면 해당 인덱스의 값을 ++
 * 		마지막에 숫자가 주어지면 해당 숫자에 +10,000,000 한 값을 인덱스로 가지는 숫자 출력
 * 		출력한 값들을 StringBuilder에 저장 후 BufferedWriter로 출력
 * 
 * 2. 시간복잡도
 * 		값을 입력하는 시간: 카드 갯수 N (1 ~ 500,000) * 1
 * 		값을 출력하는 시간: 숫자 갯수 M (1 ~ 500,000) * 1
 * 		최대 1,000,000번 연산?
 * 
 * 3. 자료구조
 * 		int[20,000,001]
 * 
 */

//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//
//// 배열 방식
//public class Main {
//	public static void main(String[] args) throws IOException {
//		int[] list = new int[20_000_001];
//		
//		int n = read();
//		for(int i = 0; i < n; i++) {
//			int num = read() + 10_000_000;
//			list[num] = list[num] + 1;
//		}
//		
//		int m = read();
//		StringBuilder stb = new StringBuilder();
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		for(int i = 0; i < m; i++) {
//			int num = read() + 10_000_000;
//			int res = list[num];
//			stb.append(res).append(' ');
//		}
//		bw.write(stb.toString());
//		bw.flush();
//	}
//	static int read() {
//		int c, n = 0;
//		boolean isPlus = true;
//		try {
//			while((c = System.in.read()) <= ' ');
//			if(c == '-') {
//				isPlus = false;
//				c = System.in.read();
//			}
//			n = c & 15;
//			while((c = System.in.read()) > ' ') {
//				n = (n << 3) + (n << 1) + (c & 15);
//			}
//		} catch (IOException e) {}
//		return isPlus ? n : -n;
//	}
//}


/*
 * 1. 아이디어
 * 		숫자를 키와 값으로 가지는 HashMap 선언
 * 		키가 되는 숫자는 숫자카드의 번호
 * 		값이 되는 숫자는 숫자카드의 갯수
 * 		해당 키값이 나올때마다 값을 ++해서 업데이트
 * 
 * 2. 시간복잡도
 * 		값을 입력하는 시간: 카드 갯수 N (1 ~ 500,000) * 1
 * 		값을 출력하는 시간: 숫자 갯수 M (1 ~ 500,000) * 1
 * 		최대 1,000,000번 연산?
 * 
 * 3. 자료구조
 * 		HashMap<Integer, Integer>
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;

//Map 방식
public class Main {
	public static void main(String[] args) throws IOException {
		HashMap<Integer, Integer> numCount = new HashMap<Integer, Integer>();
		int n = read();
		for(int i = 0; i < n; i++) {
			int num = read();
			if(!numCount.containsKey(num)) {
				numCount.put(num, 1);				
			} else {
				numCount.put(num, numCount.get(num) + 1);
			}
		}
		
		StringBuilder stb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = read();
		for(int i = 0; i < m; i++) {
			int num = read();
			int count = 0;
			if(numCount.containsKey(num)) {
				count = numCount.get(num);
			}
			stb.append(count).append(' ');
		}
		bw.write(stb.toString());
		bw.flush();
	}
	static int read() {
		int c, n = 0;
		boolean isPlus = true;
		try {
			while ((c = System.in.read()) <= ' ');
			if (c == '-') {
				isPlus = false;
				c = System.in.read();
			}
			n = c & 15;
			while ((c = System.in.read()) > ' ') {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (IOException e) {}
		return isPlus ? n : -n;
	}
}
