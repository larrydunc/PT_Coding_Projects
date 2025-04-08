package Week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player (String name) {
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe( ) {
		System.out.println("----------------------");
		System.out.println(this.name);
		System.out.println("----------------------");
		System.out.println("Starting score: " + this.score);
		System.out.println("----------------------");
		System.out.println("Cards in Hand");
		System.out.println("----------------------");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score += 1;
	}

}
