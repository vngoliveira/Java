package biblioteca;

public class Usuário extends Pessoa{
	
	private String telefone;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void finalizar(){
		System.out.println("\nEtapa Usuário finalizada!\n");
	}

}
