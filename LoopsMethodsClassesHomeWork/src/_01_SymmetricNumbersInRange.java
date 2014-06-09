import java.util.Scanner;


public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int beg=in.nextInt();
		int end=in.nextInt();
		for (beg=beg; beg <=end; beg++) {
			if(beg<10){
				System.out.println(beg);
			}
			if (beg>10&&beg<100) {
				if (beg%10==(beg/10)%10) {
					System.out.println(beg);
				}
			}
			if (beg>=100) {
				if (beg%10==(beg/100)%10) {
					System.out.println(beg);
				}
			}
			
		}
	}

}
