package ro.ase.csie.cts.g1088.dp.composite;

import java.util.ArrayList;

public class GrupCaractere extends UnitateAbstractaJoc {
	ArrayList<UnitateAbstractaJoc> unitati = new ArrayList<>();

	@Override
	public void seDeplaseaza(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atacaJucator(int puncte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void seRetrage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void adaugaCaracter(UnitateAbstractaJoc unitate) {
		this.unitati.add(unitate);
	}

	@Override
	public void stergeCaracter(UnitateAbstractaJoc unitate) {
		this.unitati.remove(unitate);
	}

	@Override
	public UnitateAbstractaJoc getCaracter(int index) {
		// TODO Auto-generated method stub
		return this.unitati.get(index);
	}

}