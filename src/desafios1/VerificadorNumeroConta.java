package desafios1;

import java.util.Scanner;

public class VerificadorNumeroConta {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 
		 
		 String conta = scanner.next();
		 
		 try {
			 verificarNumeroConta(conta);
			 
		 } catch (IllegalArgumentException e){
			 System.out.println("Erro: Numero de conta invalido."); 
			 
		 } finally {
			 scanner.close();
	     }
	 }

	    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException { 
	    	if(numeroConta.length() != 8)
	    		System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
	    	else System.out.println("Numero de conta valido."); 
	            
	    }
	    
}
