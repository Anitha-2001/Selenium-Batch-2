package pattern;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year % 4==0) {
			
			System.out.println("This is leap year");
		
			
		}
		else 
			System.out.println("This is not leap year");

	}

}

