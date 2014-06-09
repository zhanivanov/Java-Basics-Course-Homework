import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandOf5Cards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int hands = scan.nextInt();
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" ,"A"};
		char[] suits = {'♣', '♦', '♥', '♠'};


		for (int i = 0; i < hands; i++) {
			for (int j = 0; j < 5; j++) {
				int numberCard = random.nextInt(cards.length-1) + 1;
				int numberSuit = random.nextInt(suits.length-1) + 1;
				System.out.printf("%s%c ",cards[numberCard], suits[numberSuit]);
			}
			System.out.println();
		}

	}

}