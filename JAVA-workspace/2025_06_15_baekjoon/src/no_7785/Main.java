package no_7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> working = new HashSet<String>();
		while(n-->0) {
			String[] input = br.readLine().split(" ");
			if(input[1].equals("enter")) {
				working.add(input[0]);
			}else {
				working.remove(input[0]);
			}
		}
		List<String> workingList = new ArrayList<String>(working);
		workingList.sort(Comparator.reverseOrder());
		
		StringBuilder stb = new StringBuilder();
		workingList.forEach(name -> stb.append(name).append("\n"));
		System.out.println(stb);
	}
}
