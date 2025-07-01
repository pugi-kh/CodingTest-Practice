package no_1271;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger totalMoney = new BigInteger(st.nextToken());
		BigInteger creatures = new BigInteger(st.nextToken());
		
		System.out.println(totalMoney.divide(creatures));
		System.out.println(totalMoney.remainder(creatures));
	}
}
