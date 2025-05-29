package no_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		
		List<Integer> prime = new ArrayList<Integer>();
		int total = 0;
		boolean moreThanOne = false;
		for(int x = min; x <= max; x++) {
			if(isPrime(x)) {
				prime.add(x);
				total += x;
				moreThanOne = true;
			}
		}
		if(moreThanOne) {
			System.out.println(total);
			System.out.println(prime.get(0));
		}else {
			System.out.println(-1);
		}
	}
	
	static boolean isPrime(int num) {
		
		if(num == 1) return false;
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		
		return true;
	}
}
