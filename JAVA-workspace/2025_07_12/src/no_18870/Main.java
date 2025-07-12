package no_18870;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = read();
		ArrayList<Integer> points = new ArrayList<>();
		ArrayList<Integer> sortedPoints = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int point = read();
			points.add(point);
			sortedPoints.add(point);
		}
		sortedPoints.sort(Comparator.naturalOrder());
		HashMap<Integer, Integer> pointMap = new HashMap<Integer, Integer>();
		for(int i = 0, index = 0; i < n; i++) {
			if(pointMap.containsKey(sortedPoints.get(i))) {
				continue;
			}
			pointMap.put(sortedPoints.get(i), index++);
		}
		StringBuilder stb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			stb.append(pointMap.get(points.get(i))).append(" ");
		}
		System.out.println(stb);
	}
	
	static int read() {
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
