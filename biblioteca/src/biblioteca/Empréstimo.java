package biblioteca;

public class Empr�stimo {
	
	private int protocolo;
	private String saida;
	private String devolu��o;
	
	public int getProtocolo() {
		return protocolo;
	}
	
	public void setProtocolo(int protocolo) {
		this.protocolo = protocolo;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public String getDevolu��o() {
		return devolu��o;
	}

	public void setDevolu��o(String devolu��o) {
		this.devolu��o = devolu��o;
	}
	
	public void finalizar(){
		System.out.println("\nEtapa Empr�stimo finalizada!\n");
	}

}
