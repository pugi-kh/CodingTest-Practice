package no_1271;

public class Main {
	public static void main(String[] args) {
		int totalMoney = read();
		int creatures = read();
		
		System.out.println(totalMoney / creatures);
		System.out.println(totalMoney % creatures);
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
