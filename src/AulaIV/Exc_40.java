package AulaIV;

import java.util.Scanner;

public class Exc_40 {
	
	static long b(int n) {
		if(n<=3) {
			return 1;
		}else {
			return b(n-3) + b(n-2) + b(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		for(int i=1; i<=20; i++) {
			System.out.printf("b(%d) = %d.\n", i, Exc_40.b(i));
		}
	}

}
