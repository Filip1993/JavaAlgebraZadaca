/*******************************************************************
(9)	Naparavite klasu Zaposlenik koja ima atribute ime, prezime, placa. 
Izraèunati prosjeènu vrijednost plaæe u posebnoj metodi, 
i doznati koji zaposlenik ima najveæu a koji najmanju plaæu. 
Unos zaposlenika sa tipkovnice. Napuniti listu sa 5 zaposlenika.
*******************************************************************/

package com.filipkesteli;

import java.util.ArrayList;
import java.util.List;

public class Zaposlenik9 implements Comparable<Zaposlenik9> {

	private Osoba9 osoba;
	private double placa;
	
	public Zaposlenik9(Osoba9 osoba, double placa) {
		super();
		this.osoba = osoba;
		this.placa = placa;
	}
	
	public double prosjecnaPlaca(List<Zaposlenik9> zaposlenik9s) {
		double suma = 0;
		for (Zaposlenik9 zaposlenik9 : zaposlenik9s) {
			suma += zaposlenik9.placa;
		}
		return suma / zaposlenik9s.size();
	}

	//za Collections.sort
	@Override
	public int compareTo(Zaposlenik9 other) {
		if (this.placa > other.placa) {
			return 1;
		} else if (this.placa < other.placa) {
			return -1;
		} else{
			return 0;
		}
	}

	//za sysout:
	@Override
	public String toString() {
		return "Zaposlenik9 [osoba=" + osoba + ", placa=" + placa + "]";
	}
	
	public static void najvecaPlaca(List<Zaposlenik9> list) {
		list = new ArrayList<>();
		Zaposlenik9 bogati = list.get(0);
		for (Zaposlenik9 zaposlenik9 : list) {
			if (bogati.placa < zaposlenik9.placa) {
				bogati = zaposlenik9;
			}
		}
	}
	
	public static void najmanjaPlaca(List<Zaposlenik9> list) {
		list = new ArrayList<>();
		Zaposlenik9 siromasni = list.get(0);
		for (Zaposlenik9 zaposlenik9 : list) {
			if (siromasni.placa > zaposlenik9.placa) {
				siromasni = zaposlenik9;
			}
		}
	}
	
}
