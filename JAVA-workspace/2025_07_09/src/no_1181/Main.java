package no_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<WordClass> words = new PriorityQueue<>();
		HashSet<String> filter = new HashSet<String>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String newWord = br.readLine();
			if (filter.contains(newWord)) continue;
			filter.add(newWord);
			words.add(new WordClass(newWord));
		}
		
		StringBuilder stb = new StringBuilder();
		while (!words.isEmpty()) {
			stb.append(words.poll()).append("\n");
		}
		System.out.println(stb);
		
	}
	static class WordClass implements Comparable<WordClass> {
		String word;
		int len;
		
		public WordClass(String word) {
			this.word = word;
			this.len = word.length();
		}

		@Override
		public int compareTo(WordClass o) {
//			return this.len - o.len != 0 ? this.len - o.len : this.word.charAt(0) - o.word.charAt(0);
//			String#compareTo 사용해야 함
			return this.len - o.len != 0 ? this.len - o.len : this.word.compareTo(o.word);
		}
		
		@Override
		public String toString() {
			return this.word;
		}
	}
}
