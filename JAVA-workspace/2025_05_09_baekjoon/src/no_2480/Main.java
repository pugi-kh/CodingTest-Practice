package no_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<String> diceList = new ArrayList<String>();
		Set<String> diceSet = new HashSet<String>();
		Iterator<String> iter = diceSet.iterator();
		
		for(int i = 0; i < 3; i++) {
			String nt = st.nextToken();
			diceList.add(nt);
			diceSet.add(nt);
		}
		
		int rept = diceList.size() - diceSet.size();
		if (rept > 0) {
			for(String num : diceSet) {
				diceList.remove(num);
			}
		}

		int result = 0;
		switch (rept) {
		case 2:
			result = 10_000 + Integer.parseInt(diceList.get(0))*1_000;
			break;
		case 1:
			result = 1_000 + Integer.parseInt(diceList.get(0))*100;
			break;
		case 0:
			result = Integer.parseInt(Collections.max(diceList))*100;
			break;
		}
		
		System.out.println(result);
		
	}
}
