package Jogo;
import java.util.Scanner;
public class BlackJackUI {
	
	/*
	 * Exibe todas as cartas do jogador
	 */
	public static void exibirCartasJ(BlackJack game){
		int num;
		num = game.getNumCartasJogador();
		for(int p = 0; p < num; p++)
			System.out.print(game.getCartasJ(p) + "  ");
		System.out.println(" ");
	
	}
	
	/*
	 * Exibe todas as cartas do Dealer
	 */
	public static void exibirCartasD(BlackJack game){
		int num;
		num = game.getNumCartasDealer();
		for(int p = 0; p < num; p++)
			System.out.print(game.getCartasD(p) + "  ");	
		System.out.println(" ");
	}
	
	public static String choice(BlackJack game){
		
		Scanner sc = new Scanner(System.in);
		String op;
		op = sc.nextLine();
		
		switch(op){
			case "1":
				game.hitMe();
				return "1";
			case "2":
				game.hitDealer();
				return "2";
			case "3":
				game.doubleBet();
				return "3";
			default:
				return "";
			
		}
	
	}
	
	/*
	 * metodo que realiza os procedimentos de receber as vontades de jogo e quando parar
	 */
	public static void jogo(BlackJack game){
		String op;
		int score ;
		System.out.println(" 1 - Hit Me 2 - Stand  3 - Double");
		do{
			
			score = game.jogadorScore();
			if(score >= 21)
				break;
			op = choice(game);
			exibirCartasJ(game);
			
			
		}while(op == "1");
	}
	
	/*
	 * funcao que calcula o resultado do jogo e retorna um boolean de ganhou ou nao ganhou
	 */
	public static boolean resultado(BlackJack game){
			int scoreJ = game.jogadorScore();
			int scoreD = game.dealerScore();
		
			if(scoreJ == scoreD){
				System.out.println("  EMPATE ");
				return false;
			}
			else if(scoreJ == 21){
				System.out.println("  VOCE GANHOU COM UM BLACKJACK ");
				return true;
			}
			else if(scoreD == 21){
				System.out.println(" DEALER GANHOU COM UM BLACKJACK ");
				return false;
			}
			else if((scoreJ > 21) && (scoreD < 21)){
				System.out.println(" VOCE EXTRAPOLOU, DEALER GANHOU ");
				return false;
			}
			
			else if((scoreJ < 21) && (scoreD > 21)){
				System.out.println(" DEALER EXTRAPOLOU, VOCE GANHOU ");
				return true;
			}
			
			else if((scoreJ > scoreD) ){
				System.out.println(" VOCE GANHOU  ");
				return true;
			}
			
			else if(scoreJ < scoreD && (scoreD < 21)){
				System.out.println(" DEALER GANHOU  ");
				return false;
			}
			return false;
	}
}
