package controle_fluxo;

public class ForArray {

	public static void main(String[] args) {
		// percorrendo um array com for
		
		String alunos [] = { "Felipe", "Jonas", "Julia", "Marcos" };
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("O aluno no indice " + i + " é " + alunos[i]);
		}
	}
}
