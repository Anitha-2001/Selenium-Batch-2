package pattern;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int factorial=1;
		 Scanner sc = new Scanner(System.in);
		 int num=sc.nextInt();
		 for(int i=1;i<=num;i++) {
			 factorial = factorial*1;
			 System.out.print(" ");
			 }
		 System.out.println(factorial);
		 }
	}
