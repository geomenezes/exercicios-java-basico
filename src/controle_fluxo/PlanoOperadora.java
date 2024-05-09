package controle_fluxo;

public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "T";
		
		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
		
		// break não dá continuidade as opçoes
		// default
		
		/*
		 * Basic: 100min
		 * Midia: 100min + Whats 
		 * Turbo: 100min + Whats + 5gb
		 */
		
	}

}
