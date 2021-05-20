package ro.ase.csie.cts.g1088.dp.observer;

public class ModulNotificari implements InterfataStatusConexiuneServer{

	@Override
	public void conexiuneIntrerupta() {
        System.out.println("PopUp: conexiune pierduta");		
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("PopUp: conexiune activa");		

	}

}
