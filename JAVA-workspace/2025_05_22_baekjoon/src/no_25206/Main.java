package no_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static double total = 0;
	static double totalHakJeom = 0;
	static final String[] GRADE = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	static final double[] SCORE = {4.5,  4.0,  3.5,  3.0,  2.5,  2.0,  1.5,  1.0,  0.0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while( (line = br.readLine()) != null && !line.isEmpty() ) {
			addNewScore(line.split(" "));
		}
		
		
		System.out.println(total / totalHakJeom);
	}
	
	static void addNewScore(String[] input) {
		String subject = input[0];
		String grade = input[2];
		if(grade.equals("P")) return;
		
		int i = Arrays.asList(GRADE).indexOf(grade);
		double score = SCORE[i];
		double hakjeom = Double.parseDouble(input[1]);
		
		total += score * hakjeom;
		totalHakJeom += hakjeom;
	}
}
