package controle_fluxo;

public class FormatadorCep {
	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("1234567");
			System.out.println(cepFormatado);
			
		} catch (CepInvalidoExpection e) {
			System.out.println("O CEP é inválido");
		}
	}
	
	static String formatarCep(String cep) throws CepInvalidoExpection {
		if(cep.length() != 8) 
			throw new CepInvalidoExpection();
			
		return "12.345-678";
	}

}
