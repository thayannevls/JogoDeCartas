package Jogo;

import java.util.Scanner;

public class MaiorMenorUI {
	
	/*
	 * Metodo para receber a carta
	 */
	/*public static Carta recebeCarta(S){
		Scanner sc = new Scanner(System.in);
		String chute = sc.nextLine();
	} */
	
	public static void maiorOuMenor(Carta cartaSecreta){
		Scanner sc = new Scanner(System.in);
		String chute = sc.nextLine();
		
		while(chute != "sair") {
		
			Carta cartaChute = new Carta(Carta.toValor(chute));
			if(cartaSecreta.equalsValor(cartaChute)){
				System.out.println("Acertou. A carta secreta era " + cartaSecreta.toString());
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
