package Jogo;
import java.util.Scanner;

public class BlackJackGame {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			boolean sair = false;
			String op;
			while(!sair){
				BlackJack game = new BlackJack();
				System.out.println("1 - Hit Me   2 - Stand    3 - Double  4 - Sair");
			}
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		
	

	}
}