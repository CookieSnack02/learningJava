package learningJava;

import java.util.Scanner;

public class Palindrome {


	    public boolean isPalindrome(int x) {
	        
	        if (x<0){
	            return false; //constraint limit -> negative numbers
	        }

	            int numeroInvertido = 0;
	            int copiaNumero = x;

	        while (x>0){
	            
	            int verificador = x % 10; 

	            numeroInvertido = numeroInvertido * 10 + verificador;

	            x = x / 10;

	        }


	            return copiaNumero == numeroInvertido;
	    }
	
	
	
	public static void main(String[] args) {
		int numero;
		Scanner scan = new Scanner(System.in);
		
	 
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		scan.close();
		
		Palindrome p = new Palindrome();
		
		if(p.isPalindrome(numero)) {
			System.out.println("É palíndromo");
		} else {
			System.out.println("Não é palíndromo!");
		}
		
		

	}

}
