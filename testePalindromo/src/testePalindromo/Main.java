package testePalindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean palindromo = false;
		
		Palavra palavra1 = new Palavra();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua palvra: ");

		String tecladoPalavra = scanner.next();		

		palavra1.setStr(tecladoPalavra);
		
		palindromo = palavra1.verificarPalindromo();
		
		System.out.println(palindromo ? "É palíndromo" : "Não é palíndromo");
		
	}
	


}
