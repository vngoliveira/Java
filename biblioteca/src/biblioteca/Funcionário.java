package biblioteca;

public class Funcion�rio extends Pessoa{
	
	private String turno;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void finalizar(){
		System.out.println("\nEtapa Funcion�rio finalizada!\n");
	}
}
