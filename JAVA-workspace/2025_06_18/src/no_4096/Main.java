package no_4096;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder res = new StringBuilder();
		String sInput;
		
		while(!(sInput = br.readLine()).equals("0")) {
			char[] cInput = sInput.toCharArray();
			int plus = 0;
			
			while(true) {
				boolean isPal = true;
				
				for(int i = 0, j = cInput.length-1; i <= j; i++, j--) {
					if(cInput[i] != cInput[j]) {
						isPal = false;
						break;
					}
				}
				if(isPal) {
					res.append(plus).append("\n");
					break;
				}else {
					plusOne(cInput);
					plus++;
				}
			}
		}
		
		System.out.println(res);
	}
	
	static void plusOne(char[] c) {
		c[c.length-1]++;
		
		for(int idx = c.length-1; idx > 0; idx--) {
			if(c[idx] > '9') {
				c[idx] = '0';
				c[idx-1]++;
			}else {break;}
		}
	}
}

