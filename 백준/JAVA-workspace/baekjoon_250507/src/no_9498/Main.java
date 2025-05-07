package no_9498;
//시험 성적

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		byte score = Byte.parseByte(st.nextToken());
		
		char grade = '?';
		if (score >= 90 && score <= 100) {
			grade = 'A';
		}else if (score >= 80 && score < 90) {
			grade = 'B';
		}else if (score >= 70 && score < 80) {
			grade = 'C';
		}else if (score >= 60 && score < 70) {
			grade = 'D';
		}else if (score > 100){
			// input out of range
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}
}
