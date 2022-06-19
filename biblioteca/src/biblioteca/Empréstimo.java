package biblioteca;

public class Empréstimo {
	
	private int protocolo;
	private String saida;
	private String devolução;
	
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

	public String getDevolução() {
		return devolução;
	}

	public void setDevolução(String devolução) {
		this.devolução = devolução;
	}
	
	public void finalizar(){
		System.out.println("\nEtapa Empréstimo finalizada!\n");
	}

}
