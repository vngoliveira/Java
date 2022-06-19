package biblioteca;
import java.util.Random;
import java.util.Scanner;

public class inteface_principal {
	
	public static void main(String[] args) {
		
		Livros l = new Livros();
		Empr�stimo e = new Empr�stimo();
		Funcion�rio f = new Funcion�rio();
		Usu�rio u = new Usu�rio();
		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		int protocolo = r.nextInt();
		e.setProtocolo(protocolo);
		
		System.out.println("Bem-vindo ao sistema de gerenciamento da biblioteca Ler Mais!\n");
		System.out.println("Iniciaremos o processo de cadastro de um novo empr�stimo:\n");
		System.out.println("Informe o nome do usu�rio: \n");
		u.setNome(scan.nextLine());
		System.out.println("\nInforme o Id do usu�rio: \n");
		u.setId(scan.nextLine());
		System.out.println("\nInforme o email do usu�rio: \n");
		u.setEmail(scan.nextLine());
		System.out.println("\nInforme o telefone do usu�rio: \n");
		u.setTelefone(scan.nextLine());
		u.finalizar();
		System.out.println("Informe o nome do funcion�rio: \n");
		f.setNome(scan.nextLine());
		System.out.println("\nInforme o Id do funcion�rio: \n");
		f.setId(scan.nextLine());
		System.out.println("\nInforme o email do funcion�rio: \n");
		f.setEmail(scan.nextLine());
		System.out.println("\nInforme o turno do funcion�rio: \n");
		f.setTurno(scan.nextLine());
		f.finalizar();
		System.out.println("Selecione o livro para empr�stimo: \n");
		l.escolha();
		l.finalizar();
		System.out.println("Informe a data de sa�da do livro: \n");
		e.setSaida(scan.nextLine());
		System.out.println("\nInforme a data de retorno para o livro: \n");
		e.setDevolu��o(scan.nextLine());
		e.finalizar();
		System.out.println("Empr�stimo cadastrado!\n");
		System.out.println("Informa��es do empr�stimo:\n");
		System.out.println("Sobre o usu�rio:");
		System.out.println("Nome do usu�rio: "+u.getNome());
		System.out.println("Id do usu�rio: "+u.getId());
		System.out.println("Email do usu�rio: "+u.getEmail());
		System.out.println("Telefone do usu�rio: "+u.getTelefone());
		System.out.println("\nSobre o funcion�rio:");
		System.out.println("Nome do funcion�rio: "+f.getNome());
		System.out.println("Id do funcion�rio: "+f.getId());
		System.out.println("Email do funcion�rio: "+f.getEmail());
		System.out.println("Turno do funcion�rio: "+f.getTurno());
		System.out.println("\nSobre o livro:");
		System.out.println("Livro escolhido: "+l.getLivro());
		System.out.println("\nSobre o empr�stimo:");
		System.out.println("Protocolo do empr�stimo: "+e.getProtocolo());
		System.out.println("Data de sa�da do livro: "+e.getSaida());
		System.out.println("Data de retorno do livro: "+e.getDevolu��o());
		System.out.println("\nFinalizamos o processo de cadastro de um novo empr�stimo");
		
	}

}
