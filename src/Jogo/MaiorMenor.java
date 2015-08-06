/*
 * Autor : Thayanne Luiza
 * 
 * "Jogo maiorMenor, onde o jogador tenta acertar a carta escolhida aletoriamente pelo 
 * computador apenas pelo seu valor. 
 * O programa retorna ao usuario se sua carta chute eh maior ou menor que a carta secreta 
 * ate ele ganhar."
 * 
 * 
 */
package Jogo;

public class MaiorMenor {
	
	public static void main(String args[]) {
		Deck deck = new Deck(Carta.Naipe.COPAS);
		Carta cartaSecreta = deck.cartaAleatoria();
		
		MaiorMenorUI.maiorOuMenor(cartaSecreta);
		
		
	}
	
}
