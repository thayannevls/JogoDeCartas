package Jogo;

import java.util.Scanner;

public class MaiorMenor {
	
	public static void main(String args[]) {
		Deck deck = new Deck(Carta.Naipe.COPAS);
		Carta cartaSecreta = deck.cartaAleatoria();
		
		Scanner sc = new Scanner(System.in);
		String chute = sc.nextLine();
		while(chute != "sair") {
			
			Carta cartaChute = new Carta(Carta.toValor(chute));
			if(cartaSecreta.equalsValor(cartaChute)){
				System.out.println("Acertou. A carta secreta era " + cartaSecreta);
				chute = "sair";
			}
			else{
				System.out.println( cartaChute.maiorMenor(cartaSecreta) );
				chute = sc.nextLine();
			}
			
		}
		
		sc.close();
		
	}
	
}
