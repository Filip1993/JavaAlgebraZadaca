package com.filipkesteli;

public class TestiranjePravokutnik8 {

	public static void main(String[] args) {
		try {
			Pravokutnik8 pravokutnik8 = new Pravokutnik8(1, 2);
			System.out.println("Opseg pravokutnika je: " + pravokutnik8.opsegPravokutnika());
			System.out.println("Povrsina pravokutnika je: " + pravokutnik8.povrsinaPravokutnika());
			System.out.println("Dijagonala pravokutnika je: " + pravokutnik8.dijagonalaPravokutnika());
			System.out.println("Radijus opisane kruznice pravokutnika je: " + pravokutnik8.radijusOpisaneKruznice());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
