import java.util.Scanner;


public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter n=");
		int n=Integer.parseInt(in.nextLine());
		if (n==0) {
			System.out.println(0);
		}
		else {
			int mask=1;
			int tempResult;
			int result=0;
			int counterOnes=0;
			int counterZeros=0;
			int counter=0;
			int p=15;
			while (result!=1) {
				tempResult=n&mask<<p;
				result=tempResult>>p;
				p--;
			}
			for (int i = 0; i <= p+1; i++) {
				tempResult=n&mask<<i;
				result=tempResult>>i;
				if (result==1) {
					counterZeros=0;
					counterOnes++;
					if (counterOnes>=2) {
						counter++;
					}
				}
				else {
					counterOnes=0;
					counterZeros++;
					if (counterZeros>=2) {
						counter++;
					}
				}
			}
			System.out.println(counter);
		}
	}

}
