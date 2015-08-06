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
		aposta = 0;
	}
	
	/*
	 * -isBlackJack-
	 * 
	 * Metodo que verifica se o conjunto de cartas da mao do jogador formou a jogada BLACKJACK,
	 * ou seja, soma 21
	 */
	
	public boolean isBlackJack(int soma){
		if(soma == 21)
			return true;
		return false;
	}
	
	/*
	 * -valorCarta21-
	 * 
	 * Retorna o valor da carta seguindo a numeracao do BlackJack
	 */
	public static int valorCarta21(Carta carta){
		ValorCarta valor = carta.getValor();
		switch(valor){
			case A:
				return -1;
			case DOIS:
				return 2;
			case TRES:
				return 3;
			case QUATRO:
				return 4;
			case CINCO:
				return 5;
			case SEIS:
				return 6;
			case SETE:
				return 7;
			case OITO:
				return 8;
			case NOVE:
				return 9;
			case DEZ:
				return 10;
			case J:
				return 10;
			case Q:
				return 10;
			case K:
				return 10;
			default:
				return 0;
		}
	
	}
	/*
	 * Metodo do jogo para pegar uma carta do baralho
	 */
	public void hitMe(){
		
	}
	
	/*
	 * Metodo do jogo para dobrar a aposta antes de puxar a terceira carta
	 */
	public void doubleBet(){
		
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
}
