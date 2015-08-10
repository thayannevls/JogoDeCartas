package Jogo;
import java.util.Scanner;

public class BlackJackGame {

	public static void main(String[] args) {
		try{
			int scoreJ, scoreD;
			Scanner sc = new Scanner(System.in);
			boolean cont = true, aposta;
			String op;
			while(cont){
				BlackJack game = new BlackJack();
				System.out.println("Aposta: ");
				game.setAposta(sc.nextInt());
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
					System.out.println("VOCE GANHOU R$" + 2 * game.getAposta());
					
				System.out.println("Deseja continuar? 1 - Sim 2 - Nao");
				op = sc.nextLine();
				if(op == "1")
					cont = true;
				else
					cont = false;
				
			}
			
			System.out.println("Bye!");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		
	

	}
}