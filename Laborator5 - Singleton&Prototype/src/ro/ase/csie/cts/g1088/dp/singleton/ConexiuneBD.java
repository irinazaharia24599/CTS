package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {
	
	String ip;
	String denumire;
	
	private ConexiuneBD() {
		
	}
	
	// versiunea eager
	// private static ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1", "cts"); 
	
	private static ConexiuneBD conexiune = null; 

	private ConexiuneBD(String ip, String denumire) {
		System.out.println("Apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	public static ConexiuneBD getConexiune() {
		if(conexiune == null) {
			//datele se pot prelua din fisiere de configurare sau din alte resurse
			conexiune = new ConexiuneBD("10.0.0.1", "cts");
		}
		return conexiune;
	}
}
