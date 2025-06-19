package no_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stb = new StringBuilder();

		boolean[] sangGeun_has = new boolean[20_000_001];
		int n = Integer.parseInt(br.readLine());
		String[] sangGeun_cards = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			int index = Integer.parseInt(sangGeun_cards[i]) + 10_000_000;
			sangGeun_has[index] = true;
		}
		
		int m = Integer.parseInt(br.readLine());
		String[] main_cards = br.readLine().split(" ");
		for(int i = 0; i < m; i++) {
			int index = Integer.parseInt(main_cards[i]) + 10_000_000;
			if(sangGeun_has[index]) stb.append("1 ");
			else stb.append("0 ");
		}
		
		System.out.println(stb);
	}
}
