package Jogo;

public class Carta {
	
	public enum ValorCarta {A, DOIS, TRES, QUATRO, CINCO, SEIS, SETE,
							OITO, NOVE, DEZ, J, Q, K};
							
	public enum Naipe {
		COPAS('\u2665'), OUROS('\u2666'), ESPADAS('\u2660'), PAUS('\u2663');
		 private char value;
		 
		   private Naipe(char value)
		   {
		      this.value = value;
		   }

		   public String toString()
		   {
		      return this.value + " "; //will return , or ' instead of COMMA or APOSTROPHE
		   }
	}
	

	
	private ValorCarta valor;
	private Naipe naipe;
	
	/*
	 * Construtor da classe Carta que atribui valores default para o valor da carta e o naipe
	 */
	public Carta() {
		setValor(ValorCarta.A);
		setNaipe(Naipe.COPAS);
	}
	
	/*
	 * Construtor da classe Carta que atribui valor default ao naipe
	 */
	public Carta(ValorCarta valor){
		this.valor = valor;
		setNaipe(Naipe.COPAS);
	}
	
	/*
	 * Construtor da classe Carta que recebe as duas variaveis como parametros
	 */
	public Carta(ValorCarta valor, Naipe naipe){
		this.valor = valor;
		this.naipe = naipe;
	}
	

	
	public ValorCarta getValor() {
		return valor;
	}
	
	public void setValor(ValorCarta valor) {
		this.valor = valor;
	}
	
	public Naipe getNaipe() {
		return naipe;
	}
	
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	
	/*
	 * Compara se duas cartasprivate TipoDeck tipo; sao iguais pelo valor da carta e o naipe
	 */
	public boolean equals(Carta c1){
		if((this.valor == c1.valor) && (this.naipe == c1.naipe))
			return true;
		return false;
	}
	
	/*
	 * Compara se duas cartas sao iguais apenas pelo valor
	 */
	public boolean equalsValor(Carta c1){
		if(this.valor == c1.valor)
			return true;
		return false;
			
	}
	public String maiorMenor(Carta c1){
		if(this.valor.compareTo(c1.valor) < 0)
			return "Maior";
		return "Menor";
	}
	
	
	public String toString(){
		return getValor() + " " + getNaipe();
	}
	
	public static ValorCarta toValor(String valor){
		switch(valor){
			case "A": case "a":
				return ValorCarta.A;
			case "2": case "dois":
				return ValorCarta.DOIS;
			case "3": case "tres":
				return ValorCarta.TRES;
			case "4": case "quatro":
				return ValorCarta.QUATRO;
			case "5": case "cinco":
				return ValorCarta.CINCO;
			case "6": case "seis":
				return ValorCarta.SEIS;
			case "7": case "sete":
				return ValorCarta.SETE;
			case "8": case "oito":
				return ValorCarta.OITO;
			case "9": case "nove":
				return ValorCarta.NOVE;
			case "10": case "dez":
				return ValorCarta.DEZ;
			case "J": case "j":
				return ValorCarta.J;
			case "Q": case "q":
				return ValorCarta.Q;
			case "K": case "k":
				return ValorCarta.K;
			default:
				return null; 

		}
	}
	
	/*
	 * Metodo que retorna um valor inteiro
	 */
	public static int valorCartaInt(Carta carta){
		ValorCarta valor = carta.getValor();
		switch(valor){
			case A:
				return 1;
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
				return 11;
			case Q:
				return 12;
			case K:
				return 13;
			default:
				return 0;
		}
	
	}
	
	


}