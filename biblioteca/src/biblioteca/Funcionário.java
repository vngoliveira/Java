package biblioteca;

public class Funcionário extends Pessoa{
	
	private String turno;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void finalizar(){
		System.out.println("\nEtapa Funcionário finalizada!\n");
	}
}
