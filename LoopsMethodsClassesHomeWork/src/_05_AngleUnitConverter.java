import java.awt.List;
import java.security.PublicKey;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class _05_AngleUnitConverter {
	public static ArrayList<String> result=new ArrayList<String>();
	public static DecimalFormat df=new DecimalFormat("#.######");
	private static void DegreesToRadians(double degrees){
		double radians;
		radians=degrees*(Math.PI/180);
		result.add(df.format(radians)+" rad");
	}
	
	private static void RadiansToDegrees(double radians){
		double degrees;
		degrees=radians*(180/Math.PI);
		result.add(df.format(degrees)+" deg");
	}

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		for (int i = 0; i < n; i++) {
			double value=in.nextDouble();
			String unit=in.nextLine();
			if (unit.equals(" rad")) {
				RadiansToDegrees(value);
			}
			else {
				DegreesToRadians(value);
			}	
		}
		System.out.println(result);
	}
}
