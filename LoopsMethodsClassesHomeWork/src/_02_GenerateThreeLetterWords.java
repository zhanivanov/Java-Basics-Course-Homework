import java.util.Scanner;


public class _02_GenerateThreeLetterWords {

	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		char[] letters = inScanner.next().toCharArray();
		
		if (letters.length==3) {
			for (int i = 0; i < letters.length; i++) {
				for (int j = 0; j < letters.length; j++) {
					for (int j2 = 0; j2 < letters.length; j2++) {
						 System.out.println(""+letters[i]+""+letters[j]+""+letters[j2]);
					}
				}
			}
			
		}
		if(letters.length==2){
			for (int i = 0; i < letters.length; i++) {
				for (int j = 0; j < letters.length; j++) {
					for (int j2 = 0; j2 < letters.length; j2++) {
						System.out.println(""+letters[i]+""+letters[j]+""+letters[j2]);
					}
				}
			}
		}
		if(letters.length==1){
			System.out.println(""+letters[0]+""+letters[0]+""+letters[0]);
		}
	}
}