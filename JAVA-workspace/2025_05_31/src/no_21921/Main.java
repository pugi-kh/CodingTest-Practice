package no_21921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int period = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		List<Integer> visitors = new ArrayList<Integer>();
		List<Integer> sumOfPeriod = new ArrayList<Integer>();
		int max = 0, sum = 0, j = 0;
		for(int i = 0; i < len; i++) {
			int temp = Integer.parseInt(st.nextToken());
			visitors.add(temp);
			sum += temp;
			if(visitors.size() == period) {
				max = sum;
				sumOfPeriod.add(sum);
			}else if((visitors.size() > period)) {
				sum -= visitors.get(j++);
				sumOfPeriod.add(sum);
				if(sum > max) max = sum;
			}
		}
		int count = 0;
		for(int x : sumOfPeriod) {
			if(x == max) count++;
		}
		
		if(max == 0) System.out.println("SAD");
		else {
			System.out.println(max);
			System.out.println(count);
		}
	}
}
