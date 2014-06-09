import java.util.Scanner;


public class _05_DecToHex {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter int=");
		int dec=Integer.parseInt(in.nextLine());
		String hex=Integer.toHexString(dec);
		System.out.println(hex.toUpperCase());
	}

}
