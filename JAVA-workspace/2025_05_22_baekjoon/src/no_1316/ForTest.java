package no_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class ForTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		sb.append(str);
		HashSet<Character> charSet = new HashSet<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			charSet.add(str.charAt(i));
		}
		
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				sb.replace(i, i+1, "*");
			}
		}
		str = sb.toString().replace("*", "");
		
		System.out.println(sb);
		System.out.println(str);
		Iterator<Character> charIter = charSet.iterator();
		for(int i = 0; i < charSet.size(); i++) {
			System.out.print(charIter.next());
		}
		
	}
}
