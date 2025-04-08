package Week06;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		String GREEN = "\u001B[32m";
		String RED = "\u001B[31m";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player1 name: ");
		String p1 = sc.next();
		System.out.println("Enter player2 name: ");
		String p2 = sc.next();
		Player player1 = new Player(p1);
		Player player2 = new Player(p2);
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		System.out.println(p1 + " has " + player1.getHand().size() + " cards.");
		System.out.println(p2 + " has " + player2.getHand().size() + " cards.");
		System.out.println("Press the enter key to review " + player1.getName() + "'s hand.");
		sc.nextLine();
		sc.nextLine();
		player1.describe();
		System.out.println("Press the enter key to review " + player2.getName() + "'s hand.");
		sc.nextLine();
		player2.describe();		
		int val1;
		int val2;
		for (int i = 0; i < 26; i++) {
			System.out.println("Press the enter key to play round " + (i +1) + ".");
			sc.nextLine();
			val1 = player1.flip().getValue();
			val2 = player2.flip().getValue();
			if (val1 > val2) {
				player1.incrementScore();
				System.out.println("----------------------");
				System.out.println(player1.getName() + " gets a point!");
				System.out.println(player1.getName() + ": " + player1.getScore() + " | " + player2.getName() + ": " + player2.getScore());
				System.out.println("----------------------");
			} else if (val2 > val1) {
				player2.incrementScore();
				System.out.println("----------------------");
				System.out.println(player2.getName() + " gets a point!");
				System.out.println(player1.getName() + ": " + player1.getScore() + " | " + player2.getName() + ": " + player2.getScore());
				System.out.println("----------------------");
			} else {
				System.out.println("----------------------");
				System.out.println("Draw. No points awarded.");
				System.out.println(player1.getName() + ": " + player1.getScore() + " | " + player2.getName() + ": " + player2.getScore());
				System.out.println("----------------------");
			}
			
		}
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("----------------------");
			System.out.println("FINAL SCORE");
			System.out.println(player1.getName() + ": " + player1.getScore() + " | " + player2.getName() + ": " + player2.getScore());
			System.out.println(GREEN + player1.getName() + " has won this game.");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("----------------------");
			System.out.println("FINAL SCORE");
			System.out.println(player1.getName() + ": " + player1.getScore() + " | " + player2.getName() + ": " + player2.getScore());
			System.out.println(GREEN + player2.getName() + " has won this game.");
		} else {
			System.out.println("----------------------");
			System.out.println("FINAL SCORE");
			System.out.println(player1.getName() + ": " + player1.getScore() + " | " + player2.getName() + ": " + player2.getScore());
			System.out.println(RED + "The game is a draw!");
			
			
		}sc.close();
	}
	

}
