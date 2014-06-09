import java.util.Scanner;


public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		double px= inScanner.nextDouble();
		double py= inScanner.nextDouble();
		boolean triangle=false;
		boolean square=false;
		boolean rectangle=false;
		double triangleArea=Math.abs((17.5*(8.5-8.5)+12.5*(8.5-3.5)+22.5*(3.5-8.5))/2);
		double pbcArea=Math.abs((px*(8.5-8.5)+12.5*(8.5-py)+22.5*(py-8.5))/2);
		double pabArea=Math.abs((17.5*(8.5-py)+12.5*(py-3.5)+px*(3.5-8.5))/2);
		double pacArea=Math.abs((17.5*(py-8.5)+px*(8.5-3.5)+22.5*(3.5-py))/2);
		if (pbcArea+pabArea+pacArea==triangleArea) {
			triangle=true;
		}
		if (py>=8.5&&py<=13.5&&px>=12.5&&px<=17.5) {
			square=true;
		}
		if (py>=8.5&&py<=13.5&&px>=20&&px<=22.5) {
			rectangle=true;
		}
		
		if (triangle||square||rectangle) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}

}
