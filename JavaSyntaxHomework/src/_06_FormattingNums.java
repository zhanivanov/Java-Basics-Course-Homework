import java.util.Scanner;


public class _06_FormattingNums {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=Integer.parseInt(in.nextLine());
		if (a<=0||a>=500) {
			System.out.println("Out of range");
			System.exit(0);
		}
		double b=Double.parseDouble(in.nextLine());
		double c=Double.parseDouble(in.nextLine());
		String hexA=Integer.toHexString(a);
		String binA=String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",hexA.toUpperCase(),binA,b,c);
	}

}
