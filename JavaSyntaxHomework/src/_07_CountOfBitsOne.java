import java.util.Scanner;


public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter n=");
		int n=Integer.parseInt(in.nextLine());
		int mask=1;
		int tempResult;
		int result;
		int sum=0;
		for (int i = 0; i < 16; i++) {
			tempResult=n&mask<<i;
			result=tempResult>>i;
			if (result==1) {
				sum=sum+result;
			}
			else {
				continue;
			}
		}
		System.out.println("The sum is:"+sum);
	}

}
