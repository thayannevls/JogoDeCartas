/*
 * Autor: Thayanne Luiza
 * Data: 05/08/2015
 * 
 * classe BlackJack
 * Contendo metodos especias do jogo blackJack
 */
package Jogo;

import Jogo.Carta.ValorCarta;
import Jogo.Deck.TipoDeck;

public class BlackJack {
	private Deck deck;
	private Hand cartasJogador;
	private Hand cartasDealer;
	private double aposta;
	private int numCartasJogador;
	private int	numCartasDealer;
	
	/*
	 * Construtor da classe BlackJack
	 * Inicia todo o jogo
	 */
	public BlackJack(){
		this.numCartasDealer = 2;                  //comeca com duas cartas
		this.numCartasJogador = 2;
		deck = new Deck(Deck.TipoDeck.SIMPLES);
		deck.shuffle();
		cartasJogador = new Hand(numCartasJogador  ,deck);
		cartasDealer = new Hand(numCartasDealer, deck);
		setAposta(0);
	}
	
	public int getNumCartasJogador(){
		return this.numCartasJogador;
	}
	
	public int getNumCartasDealer(){
		return this.numCartasDealer;
	}
	
	
	
	public double getAposta() {
		return aposta;
	}





	public void setAposta(double aposta) {
		this.aposta = aposta;
	}





	/*
	 * Metodo do jogo para pegar uma carta do baralho
	 */
	public void hitMe(){
		cartasJogador.pegarCarta(deck);
		this.numCartasJogador ++;
	}
	
	/*
	 * Metodo do jogo para dobrar a aposta antes de puxar a terceira carta
	 */
	public void doubleBet(){
		aposta *= 2;
		hitMe();
	
	}
	
	/*
	 * Metodo do jogo para encerrar a jogada
	 */
	public void stand(){
		
	}
	
	/*
	 * Metodo do jogo para quando possuir duas cartas iguais permitir separar sua cartas em mao para dois novos
	 * jogos de cartas
	 */
	public void split(){
		
	}
	
	/*
	 * Exibe as cartas do jogoador
	 */
	public Carta getCartasJ(int index){
		return cartasJogador.getHand(index);
		
	}
	
	/*
	 * Exibe as cartas do Dealer
	 */
	public Carta getCartasD(int index){
		return cartasDealer.getHand(index);
	}
	
	/*
	 * Metodo que calcula a pontuacao do jogador
	 */
	public int jogadorScore(){
		int score = 0;
		boolean temAs = false;
		for(int p = 0; p < numCartasJogador; p++ ){
			if(Carta.valorCartaInt(cartasJogador.getHand(p)) >= 10)
				score += 10;
			
			else 
				score += Carta.valorCartaInt(cartasJogador.getHand(p));
			if(Carta.valorCartaInt(cartasJogador.getHand(p)) == 1)
				temAs = true;
		}
		
		if((temAs == true) && (score + 10 <= 21))
			score += 10;
		
		return score;
			
	}
	
	/*
	 * Metodo que calcula a pontuacao do Dealer
	 */
	public int dealerScore(){
		int score = 0;
		boolean temAs = false;
		for(int p = 0; p < numCartasDealer; p++ ){
			if(Carta.valorCartaInt(cartasDealer.getHand(p)) >= 10)
				score += 10;
			
			else 
				score += Carta.valorCartaInt(cartasDealer.getHand(p));
			if(Carta.valorCartaInt(cartasDealer.getHand(p)) == 1)
				temAs = true;
		}
		
		if((temAs == true) && (score + 10 <= 21))
			score += 10;
		
		return score;
			
	}
	
	/*
	 * Jogadas do Dealer, ira parar qnd sua pontuacao for maior que a do jogador
	 */
	public void hitDealer(){
		while(true){
			cartasDealer.pegarCarta(deck);
			numCartasDealer ++;
			if(dealerScore() > jogadorScore() ){
				break;
			}
		}
	}
	
	
}
