package AulaIV;

import java.util.Scanner;

public class Exc_39 {
	
	static long fib(int n) {
		if(n<2) {
			return n;
		}else {
			return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		for(int i=1; i<=30; i++) {
			System.out.printf("fib(%d) = %d.\n", i, Exc_39.fib(i));
		}
	}
}
