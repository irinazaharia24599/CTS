package ro.ase.csie.cts.g1088.dp.factory;

public class FactoryCaracter {

	public static CaracterAbstract getCaracter(TipCaracter tip, String nume) {
		CaracterAbstract caracter = null;
		
		switch(tip) {
		case DISNEY:
			caracter = new CaracterDisney("alb", nume, true);
			
	    case MARVEL:
		   caracter = new CaracterMarvel(50, nume);
		   
		default:
			throw new UnsupportedOperationException();
		}
	}
}
