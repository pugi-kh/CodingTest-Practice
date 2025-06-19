package no_2292;
// 1, 6, 12, 18, ... 6의 배수개씩 묶임
// 입력한 값에서 1, 6, 12, 18, ...을 순차적으로 뺐을 때 x <= 0 이면 해당 줄에 위치함
// 순차적으로 뺄때마다 minPath++

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int goal = Integer.parseInt(br.readLine());
		int minPath = 0;
		
		int n = 1;
		while(goal > 0) {
			goal -= n;
			minPath++;
			n = minPath * 6;
		}
		
		System.out.println(minPath);
	}
}
