package pattern;

public class SumOfEvennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int sum=0;
		for(int i=1;i<=5;i++) {
		if(i % 2 != 0) {
			 continue;
		}
		sum = sum +i;
		

	}
		System.out.println("Sum of even number"+sum);

}
}
