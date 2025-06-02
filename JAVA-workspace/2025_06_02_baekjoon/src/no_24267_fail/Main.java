package no_24267_fail;
/*
	MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
 */
public class Main {
	public static void main(String[] args) {
		long n = readInt();
		long res; // 어떻게 구함??
		
		// 1 ~ n 까지 수 중에서 3개의 수를 순서와 상관없이 뽑는 경우의 수 만큼 실행됨
		
		res = (n*(n-1)*(n-2))/(3*2);
		
		System.out.println(res);
		System.out.println(3);
	}
	static int readInt() {
		int c, n = 0;
		try {
			while((c = System.in.read()) <= 32);
			n = c & 15;
			while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		} catch (Exception e){}
		return n;
	}
}
