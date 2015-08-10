package Jogo;
import java.util.Scanner;

public class BlackJackGame {

	public static void main(String[] args) {
		try{
			int scoreJ, scoreD;
			Scanner sc = new Scanner(System.in);
			Scanner scS = new Scanner(System.in);
			boolean cont = true, aposta;
			String op;
			while(true){
				BlackJack game = new BlackJack();
				System.out.println("Aposta: ");
				
				game.setAposta(sc.nextInt());
				sc.nextLine();
				BlackJackUI.exibirCartasJ(game);
				BlackJackUI.jogo(game);
				System.out.println("--------------------------------------------");
				System.out.print("Suas cartas: " );
				BlackJackUI.exibirCartasJ(game);
				System.out.print("Dealer cartas: " );
				BlackJackUI.exibirCartasD(game);
				System.out.println("--------------------------------------------");
				aposta = BlackJackUI.resultado(game);
				if(aposta == true)
					System.out.println("VOCE RECEBEU R$" + 2 * game.getAposta());
				
				System.out.println("--------------------------------------------");	
				
				System.out.println("Deseja continuar? 1 - Sim 2 - Nao");
				op = scS.nextLine();
				
				if(!(op.equals("1")))
					break;
				/*
				 * int option = input.nextInt();
input.nextLine();  // Consume newline left-over
String str1 = input.nextLine();
				 */
				
			}
			
			System.out.println("Bye!");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		
	

	}
}