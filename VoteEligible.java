package pattern;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num>18) {
			System.out.println("Vote Eligible");
		}
		else
			System.out.println("Vote not Eligible");
		}
	}   
