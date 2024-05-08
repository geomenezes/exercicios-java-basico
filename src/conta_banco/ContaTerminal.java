package conta_banco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Número: ");
		int numero = scanner.nextInt();
		
		System.out.println("Digite a Agência: ");
		String agencia = scanner.next();
		
		System.out.println("Digite seu Nome: ");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite o Saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
	}

}
