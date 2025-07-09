package no_11651;

import java.util.PriorityQueue;

public class Main_2 {
	public static void main(String[] args) {
		
		int n = read();
		
		PriorityQueue<Point> points = new PriorityQueue<>();
		while (n-- > 0) {
			points.add( new Point(read(), read()) );
		}
		
		StringBuilder stb = new StringBuilder();
		while(!points.isEmpty()) {
			Point pt = points.poll();
			stb.append(pt.x).append(" ").append(pt.y).append("\n");
		}
		System.out.println(stb);
		
	}
	
	public static class Point implements Comparable<Point> {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Point o) {
			return this.y != o.y ? this.y - o.y : this.x - o.x;
		}
		
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
		} catch (Exception e){}
		return plus ? n : -n;
	}
}
