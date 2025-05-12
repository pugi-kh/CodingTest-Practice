package no_11382;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String line = br.readLine();
			br.close();
			StringTokenizer st = new StringTokenizer(line, " ");
			
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			
			System.out.println(a+b+c);
			
		} catch (IOException e) {e.getMessage();
		} catch (NumberFormatException e) {e.getMessage();
		} catch (NullPointerException e) {e.getMessage();
		} catch (Exception e) {e.getMessage();
		}
		
	}
}
