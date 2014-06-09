import java.util.Scanner;


public class _04_TheSmallestOfThreeNums {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a=");
		double a=Double.parseDouble(in.nextLine());
		System.out.print("Enter b=");
		double b=Double.parseDouble(in.nextLine());
		System.out.print("Enter c=");
		double c=Double.parseDouble(in.nextLine());
		
		if (a<b&&a<c) {
			System.out.println(a);
		}
		else if (b<a&&b<c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
