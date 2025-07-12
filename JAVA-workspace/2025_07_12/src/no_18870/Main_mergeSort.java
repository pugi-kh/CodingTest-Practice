package no_18870;

public class Main_mergeSort {
	public static void main(String[] args) {
		int n = read();
		
	}
	
	public static void mergeSort(int[] xArr, int[] idxArr, int startPt, int endPt) {
		if(startPt < endPt) {
			int midPt = (startPt + endPt) >>> 1;
			mergeSort(xArr, idxArr, startPt, midPt);
			mergeSort(xArr, idxArr, midPt + 1, endPt);
			merge(xArr, idxArr, startPt, midPt, endPt);
		}
	}
	
	public static void merge(int[] xArr, int[] idxArr, int startPt, int midPt, int endPt) {
		int leftPt = startPt;
		int rightPt = midPt;
		int tmpPt = startPt;
		while(leftPt <= midPt && rightPt <= endPt) {
			// TODO
		}
		// TODO
	}
	
	public static int read() {
		int c, n = 0;
		boolean plus = true;
		try {
			while((c = System.in.read()) <= 32);
			if(c == '-') {
				plus = false;
				c = System.in.read();
			}
			n = c & 15;
			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return plus ? n : -n;
	}
}
