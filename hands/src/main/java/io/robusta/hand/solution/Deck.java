package io.robusta.hand.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

import io.robusta.hand.Card;
import io.robusta.hand.interfaces.IDeck;

public class Deck extends LinkedList<Card> implements IDeck {

	private static final long serialVersionUID = -4686285366508321800L;

	public Deck() {

	}

	@Override
	public Card pick() {

		Collections.shuffle(this);
		return this.pollFirst();

	}

	@Override
	public TreeSet<Card> pick(int number) {
		// reuse pick()

		int i = 0;
		TreeSet<Card> cards = new TreeSet<>();

		while (i < number) {

			cards.add(this.pick());
			i++;
		}
		return cards;

	}




	@Override
	public Hand giveHand() {
		// A hand is a **5** card TreeSet
		TreeSet<Card> cards = pick(5);   //récupère les cartes
		
		Hand hand = new Hand();  		//crée ma main
		hand.addAll(cards);				//ajoute les cartes dans la main
		
		return hand;
	}

}
