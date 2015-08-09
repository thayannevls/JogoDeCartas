/*
 * Autor: Thayanne Luiza
 * Data: 05/08/2015
 * 
 * Classe Hand. Simula a mao de um jogador com suas cartas e metodos para manipula-las
 */
package Jogo;



public class Hand {
	/* 
	 * As cartas na mao do jogador como do tipo DECK
	 */
	private Deck hand; 
	
	/*
	 * quantidade de cartas na mao
	*/
	private int tamanho;
	
	/*
	 * Construtor da classe  default
	 * atribui 5 cartas a mao automaticamente retiradas do baralho
	 */
		
	public Hand(Deck baralho){
		setTamanho(5);
		hand = new Deck(tamanho, baralho);
		
	}
	
	/*
	 * Construtor que recebe a quantidade de cartas que o jogador tera inicialmente
	 */
	public Hand(int tam, Deck baralho){
		setTamanho(tam);
		hand = new Deck(tamanho, baralho);
		
	}
	
	public Carta getHand(int index){
		return hand.getDeck(index);
	}
	
	public void setTamanho(int tam){
		this.tamanho = tam;
	}
	
	
	public int getTamanho(){
		return tamanho;
	}

	/*
	 * Metodo que permite adicionar uma carta a mao do baralho
	 */
	
	public void pegarCarta(Deck baralho){
		Carta carta = baralho.retiraCarta();
		hand.setDeck(carta);
	}
	
	/*
	 * 
	 */
	
	public static int valorCartaInt(Carta carta){
		return Carta.valorCartaInt(carta);
	}
	
	
}