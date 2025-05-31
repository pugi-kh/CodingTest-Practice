package no_22857;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int delCount = Integer.parseInt(st.nextToken());
		
		boolean[] isEven = new boolean[len];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < len; i++) {
			int temp = Integer.parseInt(st.nextToken());
			isEven[i] = (temp % 2 == 0);
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
}
