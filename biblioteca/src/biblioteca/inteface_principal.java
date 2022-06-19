package biblioteca;
import java.util.Random;
import java.util.Scanner;

public class inteface_principal {
	
	public static void main(String[] args) {
		
		Livros l = new Livros();
		Empréstimo e = new Empréstimo();
		Funcionário f = new Funcionário();
		Usuário u = new Usuário();
		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		int protocolo = r.nextInt();
		e.setProtocolo(protocolo);
		
		System.out.println("Bem-vindo ao sistema de gerenciamento da biblioteca Ler Mais!\n");
		System.out.println("Iniciaremos o processo de cadastro de um novo empréstimo:\n");
		System.out.println("Informe o nome do usuário: \n");
		u.setNome(scan.nextLine());
		System.out.println("\nInforme o Id do usuário: \n");
		u.setId(scan.nextLine());
		System.out.println("\nInforme o email do usuário: \n");
		u.setEmail(scan.nextLine());
		System.out.println("\nInforme o telefone do usuário: \n");
		u.setTelefone(scan.nextLine());
		u.finalizar();
		System.out.println("Informe o nome do funcionário: \n");
		f.setNome(scan.nextLine());
		System.out.println("\nInforme o Id do funcionário: \n");
		f.setId(scan.nextLine());
		System.out.println("\nInforme o email do funcionário: \n");
		f.setEmail(scan.nextLine());
		System.out.println("\nInforme o turno do funcionário: \n");
		f.setTurno(scan.nextLine());
		f.finalizar();
		System.out.println("Selecione o livro para empréstimo: \n");
		l.escolha();
		l.finalizar();
		System.out.println("Informe a data de saída do livro: \n");
		e.setSaida(scan.nextLine());
		System.out.println("\nInforme a data de retorno para o livro: \n");
		e.setDevolução(scan.nextLine());
		e.finalizar();
		System.out.println("Empréstimo cadastrado!\n");
		System.out.println("Informações do empréstimo:\n");
		System.out.println("Sobre o usuário:");
		System.out.println("Nome do usuário: "+u.getNome());
		System.out.println("Id do usuário: "+u.getId());
		System.out.println("Email do usuário: "+u.getEmail());
		System.out.println("Telefone do usuário: "+u.getTelefone());
		System.out.println("\nSobre o funcionário:");
		System.out.println("Nome do funcionário: "+f.getNome());
		System.out.println("Id do funcionário: "+f.getId());
		System.out.println("Email do funcionário: "+f.getEmail());
		System.out.println("Turno do funcionário: "+f.getTurno());
		System.out.println("\nSobre o livro:");
		System.out.println("Livro escolhido: "+l.getLivro());
		System.out.println("\nSobre o empréstimo:");
		System.out.println("Protocolo do empréstimo: "+e.getProtocolo());
		System.out.println("Data de saída do livro: "+e.getSaida());
		System.out.println("Data de retorno do livro: "+e.getDevolução());
		System.out.println("\nFinalizamos o processo de cadastro de um novo empréstimo");
		
	}

}
