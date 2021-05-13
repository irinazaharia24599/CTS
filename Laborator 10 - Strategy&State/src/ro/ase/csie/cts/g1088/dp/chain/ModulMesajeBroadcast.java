package ro.ase.csie.cts.g1088.dp.chain;

public class ModulMesajeBroadcast extends ModulProcesareMesaj {

	@Override
	public void procesareMesaj(MesajChat mesaj) {

		if(mesaj.destinatie.toLowerCase().equals("@everyone")) {
			System.out.println("mesaj grup: " + mesaj.text);
		} 
		
		if(this.next != null) {
			this.next.procesareMesaj(mesaj);
		}
	}

}
