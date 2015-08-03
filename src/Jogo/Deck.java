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
	public enum TipoDeck{SIMPLES, DUPLO};
	
	

	private Vector <Carta> deck = new Vector<Carta>();
	private TipoDeck tipo; 
	
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
	 * Metodo que pega uma carta aleatoria do baralho
	 */
	public Carta cartaAleatoria(){
		Random random = new Random();
		int indexCarta = random.nextInt(deck.size());
		return deck.get(indexCarta);

	}
	
	
	

}
