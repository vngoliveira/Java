package biblioteca;
import java.util.Scanner;

public class Livros {
	
	Scanner scan = new Scanner(System.in);
	
	private String livro;
	
	String[] livros = {"Mulherzinhas - Louisa May Alcott",
			"Alice no Pa�s das Maravilhas - Lewis Carroll",
			"Admir�vel mundo novo - Aldous Huxley",
			"O c�digo Da Vinci - Dan Brown",
			"O pr�ncipe - Maquiavel",
			"O leviat� - Thomas Hobbs"};
	
	public void escolha(){ 
		
		int esc;
		
		do{
			
			for(int l=0;l<livros.length;l++){
				System.out.println(l+1+"� : "+livros[l]);
			}
			System.out.println("");
			
			esc = scan.nextInt();
			
			switch(esc){
				case 1:
					livro=livros[0];
					setLivro(livro);
					break;
				case 2:
					livro=livros[1];
					setLivro(livro);
					break;
				case 3:
					livro=livros[2];
					setLivro(livro);
					break;
				case 4:
					livro=livros[3];
					setLivro(livro);
					break;
				case 5:
					livro=livros[4];
					setLivro(livro);
					break;
				case 6:
					livro=livros[5];
					setLivro(livro);
					break;
				default: System.out.println("\nEscolha uma op��o v�lida!\n");
				break;
			}
		}while(esc!=1 && esc!=2 && esc!=3 && esc!=4 && esc!=5 && esc!=6);// enquanto for verdadeira;
	}
	
	public void finalizar(){
		System.out.println("\nEtapa Livro finalizada!\n");
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}
	
}