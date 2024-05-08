package sistema_tv;

/**
 * 
 */
public class Usuario {

	public static void main(String[] args) {
		SistemaTv sistemaTv = new SistemaTv();
		
		sistemaTv.diminuirVolume();
		sistemaTv.diminuirVolume();
		sistemaTv.diminuirVolume();
		sistemaTv.diminuirVolume();
		sistemaTv.diminuirVolume();
		
		sistemaTv.mudarCanal(13);
		
		System.out.println("Tv ligada: " + sistemaTv.ligada);
		System.out.println("Canal Atual: " + sistemaTv.canal);
		System.out.println("Volume Atual: " + sistemaTv.volume);
		
		sistemaTv.ligar();
		System.out.println("Tv ligada: " + sistemaTv.ligada);
		
		sistemaTv.desligar();
		System.out.println("Tv ligada: " + sistemaTv.ligada);
		
		// televisão é um obj e usuário está agindo sob o obj
	}
	
}
