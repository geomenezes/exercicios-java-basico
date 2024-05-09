package controle_candidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
		
		selecaoCandidatos();
		
		imprimirSelecionados();
		
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativas = 1;
		boolean continuarTentando = true;
		boolean atendeu=true;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativas++;
			else
				System.out.println("Contato Realizado com Sucesso");
			
			
		} while(continuarTentando && tentativas<3);
		
		if(atendeu)
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativas + " tentativa");
		else
			System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativas + " realizada");
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de n°" + (i+1) + " é o " + candidatos[i]);
		}
		
		System.out.println("\nForma abreviada de interação for each");
		
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou e salário de " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1880, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido)
			System.out.println("Ligar para o candidato");
		else if(salarioBase == salarioPretendido)
			System.out.println("Ligar para o candidato com contra proposta");
		else System.out.println("Aguardar o resultado dos demais candidatos");
		
	}

}
