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
			System.out.println(game.getCartasJ(p));
	
	}
	
	/*
	 * Exibe todas as cartas do Dealer
	 */
	public static void exibirCartasD(BlackJack game){
		int num;
		num = game.getNumCartasDealer();
		for(int p = 0; p < num; p++)
			System.out.println(game.getCartasD(p));	
	}
	
	public static boolean choice(BlackJack game){
		boolean sair = false;
		Scanner sc = new Scanner(System.in);
		String op;
		op = sc.nextLine();
		
		switch(op){
			case "1":
				game.hitMe();
				break;
			case "2":
				game.hitDealer();
				break;
			case "3":
				game.doubleBet();
				break;
			case "0":
				sair = true;
				break;
		}
		
		return sair;
	}
}
