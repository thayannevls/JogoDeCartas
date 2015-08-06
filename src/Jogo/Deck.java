/**
 * Autor: Thayanne Luiza
 * Classe do Deck
 */
package Jogo;
import java.util.*;
public class Deck {
	
	
	/*
	 * Enumeracao dos tipos de baralho
	 */
	public enum TipoDeck{SIMPLES, DUPLO, HAND};
	
	

	private Vector <Carta> deck = new Vector<Carta>(); 
	
	/*
	 * Construtor da classe para os baralhos de tipo simples e duplo.
	 */
	
	public Deck(TipoDeck t){
		int cont = 0;
		
		if(t == TipoDeck.SIMPLES){
			for(Carta.Naipe n: Carta.Naipe.values()){
				for(Carta.ValorCarta v: Carta.ValorCarta.values())
					deck.add(new Carta(v, n));
			}
			
		}
		
		else if(t == TipoDeck.DUPLO ){
			while(cont != 2){
				for(Carta.Naipe n: Carta.Naipe.values()){
					for(Carta.ValorCarta v: Carta.ValorCarta.values())
						deck.add(new Carta(v, n));
				cont++ ;
				}
				
			}
			
		}	
		
	}
	
	/*
	 * Construtor da classe para baralho de 13 cartas, recebendo o naipe do usuario.
	 */
	public Deck(Carta.Naipe n){
		for (Carta.ValorCarta v: Carta.ValorCarta.values()){
			deck.add(new Carta(v, n));
		}
		

	}
	
	/*
	 * Construtor da classe para o tipo de deck HAND
	 * recebe a quantidade de cartas que o jogador pode ter na mao e o baralho que ele ira retira-la
	 */
	
	public Deck(int tam, Deck baralho){
		int p;
		for(p = 0; p < tam; p++){
			Carta nova = baralho.retiraCarta();
			deck.add(nova);
		}
	}
	
	
	/*
	 * Metodo que escolhe uma carta aleatoria do baralho
	 */
	public Carta cartaAleatoria(){
		Random random = new Random();
		int indexCarta = random.nextInt(deck.size());
		return deck.get(indexCarta);

	}
	
	/*
	 * Metodo que retira uma carta do baralho
	 */
	public Carta retiraCarta(){
		 
		Random random = new Random();
		int indexCarta = random.nextInt(deck.size());
		Carta escolhida = deck.get(indexCarta);
		deck.remove(indexCarta);
		return escolhida;
	}
	
	public void colocaCarta(Carta carta){
		deck.add(carta);
	}
	
	public void shuffle(){
	    Collections.shuffle(deck);
	}

}
