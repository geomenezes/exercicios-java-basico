package desafios1;

import java.util.Scanner;

public class SimulacaoBancaria {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0.0; 
        String resposta = "";

        while (true) {

            int opcao = scanner.nextInt(); 
            
            if(opcao == 0)
              break;

            switch (opcao) {
              case 1: {
                saldo = scanner.nextDouble();
                resposta = resposta.concat("Saldo atual: " + saldo + "\n");
                break;
              }
              case 2: {
                double saque = scanner.nextDouble();
                if(saque <= saldo) {
                  saldo-= saque;
                  resposta = resposta.concat("Saldo atual: " + saldo + "\n");
                } else 
                	resposta = resposta.concat("Saldo insuficiente.\n");
                break;
              }
              case 3: {
            	  resposta = resposta.concat("Saldo atual: " + saldo + "\n");
            	  break;
              }
              default:
            	  resposta = resposta.concat("Opção inválida. Tente novamente.\n"); 
            }
        }
        scanner.close();
        resposta = resposta.concat("Programa encerrado.");
        System.out.println(resposta);
    }
}
