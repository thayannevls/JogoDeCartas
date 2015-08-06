package Jogo;

public class Carta {
	
	public enum ValorCarta {A, DOIS, TRES, QUATRO, CINCO, SEIS, SETE,
							OITO, NOVE, DEZ, J, Q, K};
							
	public enum Naipe {COPAS, OUROS, ESPADAS, PAUS};
	
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
		return getValor() + " DE " + getNaipe();
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
	
	
	


}