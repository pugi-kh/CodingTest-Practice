package no_2563;
/* 
 * 나는 처음에 sum 메서드가 있을줄 알고 int배열로 해서 했는데
 * 다른사람들은 거의 boolean으로 한듯
 * 그중에서 if(!해당자리){ 해당자리 = true; total++; }
 * 이렇게 작성해서 내가 for문 두번 돌릴거를 한번에 정리한 사람이 그나마 제일 깔끔해보였음
 * 가독성도 해치지 않는 선에서 좋았던 듯 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[][] whitePaper = new boolean[100][100];
		int paperCount = Integer.parseInt(br.readLine());
		int[] paperSize = {10, 10}; 
		int totalBlack = 0;
		
		for(int n = 0; n < paperCount; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int i = x; i < x + paperSize[0]; i++) {
				for(int j = y; j < y + paperSize[1]; j++) {
					if(!whitePaper[i][j]) {
						whitePaper[i][j] = true;
						totalBlack++;
					}
				}
			}
		}
		
		System.out.println(totalBlack);
	}
}
