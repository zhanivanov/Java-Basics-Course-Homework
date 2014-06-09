import java.util.Scanner;


public class _01_RectangleArea {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.print("Enter a=");
		int a=Integer.parseInt(inputScanner.nextLine());
		System.out.print("Enter b=");
		int b=Integer.parseInt(inputScanner.nextLine());
		System.out.println(a*b);
	}

}
