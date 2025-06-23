package no_22864;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int tirednessPerH 	= read();
		int workPerH 				= read();
		int recoveryPerH 		= read();
		int burnOut 				= read();
		
		int totalWork 			= 0;
		int totalTiredness 	= 0;
		
		for(int h = 0; h < 24; h++) {
			if(totalTiredness + tirednessPerH > burnOut) {
				totalTiredness -= recoveryPerH;
				if(totalTiredness < 0) { totalTiredness = 0; }
			}else {
				totalTiredness += tirednessPerH;
				totalWork += workPerH;
			}
		}
		
		System.out.println(totalWork);
	}
	
	static int read() {
		int c, n = 0;
		boolean plus = true;
		try {
			while((c = System.in.read()) <= 32);
			if(c == 45) { 
				plus = false;
				c = System.in.read();
			}
			n = c & 15;

			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (Exception e){}
		return plus ? n : -n;
	}
}
