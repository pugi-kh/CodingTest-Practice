package no_2485;

public class Main {
	public static void main(String[] args) {
		
		int treeNum = read();
		int[] trees = new int[treeNum];
		
		for(int i = 0; i < treeNum; i++) {
			trees[i] = read();
		}
		
		int gcd = trees[1] - trees[0];
		for(int i = 1; i < treeNum; i++) {
			gcd = gcd(trees[i] - trees[i - 1], gcd);
		}
		
//		이부분이 시간낭비하는 부분이였음..
//		int addTreeCount = 0;
//		for(int temp = treePosition[0], i = 0; temp < treePosition[treeNum - 1]; temp += gcd) {
//			if(treePosition[i] == temp) i++;
//			else addTreeCount++;
//		}
//		
//		System.out.println(addTreeCount);
		
		System.out.println((trees[treeNum - 1] - trees[0]) / gcd + 1 - treeNum);
	}
	
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	static int read() {
		int c, n = 0;
		try {
			while((c = System.in.read()) <= 32);
			n = c & 15;
			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (Exception e){}
		return n;
	}
}
