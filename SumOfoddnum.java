package pattern;

import java.util.Scanner;



public class SumOfoddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter range");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			sum = sum + i;
		
		}
		System.out.println(sum);
		
				

	}

}
