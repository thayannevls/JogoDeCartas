package Jogo;

import java.util.Scanner;

public class MaiorMenor {
	
	public static void main(String args[]) {
		Deck deck = new Deck(Carta.Naipe.COPAS);
		Carta cartaSecreta = deck.cartaAleatoria();
		
		MaiorMenorUI.maiorOuMenor(cartaSecreta);
		
		
	}
	
}
