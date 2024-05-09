package controle_fluxo;

public class ForEach {
	public static void main(String[] args) {
		// percorrendo um array com for-each
		
		String alunos [] = { "Felipe", "Jonas", "Julia", "Marcos" };
		
		for (String aluno : alunos) {
			System.out.println("Nome do alunos é " + aluno);
		}
	}

}
