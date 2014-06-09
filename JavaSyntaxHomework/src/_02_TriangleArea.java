import java.util.Scanner;


public class _02_TriangleArea {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		String[] pointAString=inputScanner.nextLine().split(" ");
		String[] pointBString=inputScanner.nextLine().split(" ");
		String[] pointCString=inputScanner.nextLine().split(" ");
		int result=(Integer.parseInt(pointAString[0])*
				(Integer.parseInt(pointBString[1])-Integer.parseInt(pointCString[1]))+
				Integer.parseInt(pointBString[0])*
				(Integer.parseInt(pointCString[1])-Integer.parseInt(pointAString[1]))+
				Integer.parseInt(pointCString[0])*
				(Integer.parseInt(pointAString[1])-Integer.parseInt(pointBString[1])));
		System.out.println("Area: "+Math.abs(result/2));
	}

}
