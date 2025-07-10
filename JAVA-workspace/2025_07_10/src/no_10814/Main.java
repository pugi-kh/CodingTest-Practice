package no_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Member> members = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			members.add(new Member(br.readLine()));
		}
		StringBuilder stb = new StringBuilder();
		while(!members.isEmpty()) {
			stb.append(members.poll()).append("\n");
		}
		System.out.println(stb);
		
	}
	static class Member implements Comparable<Member> {
		int age;
		String name;
		static int memCount = 0;
		int memNum;
		
		public Member(String line) {
			String[] input = line.split(" ");
			this.age = Integer.parseInt(input[0]);
			this.name = input[1];
			this.memNum = memCount++;
		}
		
		@Override
		public int compareTo(Member o) {
			return this.age - o.age != 0 ? this.age - o.age : this.memNum - o.memNum;
		}
		
		@Override
		public String toString() {
			return age + " " + name;
		}
	}
}
