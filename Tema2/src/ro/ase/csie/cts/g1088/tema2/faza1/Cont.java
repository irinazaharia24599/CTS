package ro.ase.csie.cts.g1088.tema2.faza1;

import java.util.ArrayList;

import ro.ase.csie.cts.g1088.tema2.faza1.exceptii.ExceptieValoareInvalida;
import ro.ase.csie.cts.g1088.tema2.faza1.interfete.InterfataValidare;


public class Cont {
	
	InterfataValidare serviciuValidare = null;
	
	public static final double BROKERS_FEE = .0125; // 1.25% broker's fee
	
	private double valoareImprumut;
	private double rata;
	private int zileContActiv;
	private TipCont tipCont;
	
	public static void validareValoareImprumut(double valoareImprumut) throws ExceptieValoareInvalida {
		if(valoareImprumut < 0) {
			throw new ExceptieValoareInvalida();
		}
	}

	public double getValoareImprumut() {
		System.out.println("Valoarea imprumutului este " + this.valoareImprumut);
		return this.valoareImprumut;
	}

	public double getRata() {
		System.out.println("Rata este " + this.rata);
		return this.rata;
	}
	
	// metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
	public double getRataLunara() {
		return this.valoareImprumut * this.rata;
	}

	public void setValoareImprumut (double valoare) throws ExceptieValoareInvalida {
		
		validareValoareImprumut(valoare);
		this.valoareImprumut = valoare;
		
	}

	public String toString() {
		return "Loan: " + this.valoareImprumut + "; rate: " + this.rata + "; days active:" 
	           + this.zileContActiv + "; type: " + this.tipCont + ";";
	}
	
	public double getDobandaPrincipala() {
		return this.valoareImprumut * (Math.pow(this.rata, (this.zileContActiv / 365)) - 1);
	}
	
	public double getComision() {
		double comision;
		if (this.tipCont == TipCont.PREMIUM || this.tipCont == TipCont.SUPER_PREMIUM)
			comision = BROKERS_FEE * this.getDobandaPrincipala();
		else {
			comision = 0.0;
		}
		return comision;
	}

	public static double getComisionTotal(ArrayList<Cont> listaConturi) {
		double comisionTotal = 0.0;
		for (Cont cont: listaConturi) {
			comisionTotal += cont.getComision();
		}
		return comisionTotal;
	}

	public Cont(double valoare, double rata, TipCont tipCont) throws ExceptieValoareInvalida {
		serviciuValidare.validareValoareImprumut(valoare);

		this.valoareImprumut = valoare;
		this.rata = rata;
		this.tipCont = tipCont;
	}

}
