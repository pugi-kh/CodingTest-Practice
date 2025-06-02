package no_2798;

public class Main {
	public static void main(String[] args) {
		int cardCount = readInt();
		int maxNum = readInt();
		
		int[] cards = new int[cardCount + 1];
		
		for(int i = 0; i < cardCount; i++) {
			cards[i] = readInt();
		}
		
		int maxSum = 0;
		
		for(int i = 0; i < cardCount-2; i++) {
			for(int j = i+1; j < cardCount -1; j++) {
				for(int k = j+1; k < cardCount; k++) {
					int sum = cards[i] + cards [j] + cards[k];
					if(sum > maxSum && sum <= maxNum) maxSum = sum;
				}
			}
		}
		
		System.out.println(maxSum);
	}
	
	static int readInt() {
		int c, n = 0;
		try{
			while((c = System.in.read()) <= 32);
			n = c & 15;
			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		}catch (Exception e) {}
		return n;
	}
}
