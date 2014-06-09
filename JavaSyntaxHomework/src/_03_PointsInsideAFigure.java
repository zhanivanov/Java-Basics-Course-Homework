import java.util.Scanner;


public class _03_PointsInsideAFigure {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		double x= inScanner.nextDouble();
		double y= inScanner.nextDouble();
		boolean firstFigure=false;
		boolean secondFigure=false;
		boolean thirdFigure=false;
		if( 
				x<=22.5 &&
				x>=12.5 &&
				y>=6 &&
				y<=8.5) {
			firstFigure=true;
		}
		if (
				x<=17.5 &&
				x>=12.5 &&
				y>=8.5 &&
				y<=13.5) {
			secondFigure=true;
		}
		if (
				x<=22.5 &&
				x>=20 &&
				y>=8.5 &&
				y<=13.5) {
			thirdFigure=true;
		}
		
		if (firstFigure||secondFigure||thirdFigure) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}

}
