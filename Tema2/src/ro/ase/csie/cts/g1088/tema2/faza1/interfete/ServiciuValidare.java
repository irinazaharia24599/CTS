package ro.ase.csie.cts.g1088.tema2.faza1.interfete;

import ro.ase.csie.cts.g1088.tema2.faza1.exceptii.ExceptieValoareInvalida;

public class ServiciuValidare implements InterfataValidare{

	@Override
	public void validareValoareImprumut(double valoareImprumut) throws ExceptieValoareInvalida {
		if(valoareImprumut < 0) {
			throw new ExceptieValoareInvalida();
		}
		
	}

}
