package com.filipkesteli;

public class Pravokutnik8 {
	
	private double a,b;

	public Pravokutnik8(double a, double b) throws Exception{
		super();
		if (a<0 || b<0) {
			throw new Exception("Stranice pravokutnika ne mogu biti negativne!");
		}else {
			this.a = a;
			this.b = b;
		}
	}
	
	public double povrsinaPravokutnika() {
		return this.a * this.b;
	}
	
	public double opsegPravokutnika() {
		return 2 * (this.a + this.b);
	}

	public double dijagonalaPravokutnika() {
		return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
	}
	
	public double radijusOpisaneKruznice() {
		return this.dijagonalaPravokutnika() / 2;
	}
}
