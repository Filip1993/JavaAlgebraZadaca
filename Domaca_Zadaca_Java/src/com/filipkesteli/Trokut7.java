/*************************************************************************
(7)	Napravite klasu trokut u kojoj su metode za izraèun površine trokuta, 
i opseg trokuta, ako u konstruktoru primamo dužine stranica a, b, i c.
**************************************************************************/
package com.filipkesteli;

public class Trokut7 {

	private double a, b, c;

	public Trokut7(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double povrsinaTrokuta() throws Exception {
		// za private non-static metodu mozemo koristiti this keyword, buduci da
		// se referira na objekt
		double pomoc = this.poluOpseg() * (poluOpseg() - this.a) * poluOpseg() * (poluOpseg() - this.b) * poluOpseg()
				* (poluOpseg() - this.c);
		if (pomoc < 0) {
			throw new Exception("Broj ne smije imati negativnu vrijednost");
		} else {
			return Math.sqrt(pomoc);
		}
	}

	public double opsegTrokuta() {
		return a + b + c;
	}

	// u private static metodama ne mozemo imati instance klase (objekte...
	// this, super keyworde...)
	// zato handler (pomocne) private metode moraju biti non-static
	// ako se dohvacaju instance objekta ili sam objekt
	private double poluOpseg() {
		return this.opsegTrokuta() / 2;
	}
}
