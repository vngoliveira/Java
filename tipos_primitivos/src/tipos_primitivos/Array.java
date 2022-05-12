package tipos_primitivos;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro de capacidade da coleção:");
		int n = ler.nextInt();
		
		int[] nums = new int [n];
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Informe um valor para a coleção:");
			nums[i] = ler.nextInt();

	}
		
		System.out.println("Informe um valor qualquer 1:");
		
		int k = ler.nextInt();
		
		System.out.println("Informe um valor qualquer 2:");
		
		int l = ler.nextInt();
		
		if(k>l) {
			
			int x = k;
			k = l;
			l = x;
			
			
		}
		int soma =0;
		int cont = 0;
		
		for(int i=0;i<n;i++) {
			
			if((nums[i]>k) && (nums[i]<l)) {
				
              
			  soma += (nums[i]);
			  cont++;
			}
	
		}
		
		int media = soma/cont;
		System.out.println(media);

}
	}
