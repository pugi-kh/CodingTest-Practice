package no_2562;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0, location = 1;
		String token; // null인지 확인하기 위해 String으로 설정
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		
		try {
			if((token = br.readLine()) != null) {
				inputs.add(Integer.parseInt(token));
				max = Integer.parseInt(token);
			}
			
			while((token = br.readLine()) != null) {
				inputs.add(Integer.parseInt(token));
				if(Integer.parseInt(token) > max) {
					max = Integer.parseInt(token);
					location = inputs.size();
				}
			}
		}catch (Exception ignore) {}
		
		System.out.println(max);
		System.out.println(location);
	}
}