/*************************************************************************
(7)	Napravite klasu trokut u kojoj su metode za izra�un povr�ine trokuta, 
i opseg trokuta, ako u konstruktoru primamo du�ine stranica a, b, i c.
**************************************************************************/

package com.filipkesteli;

public class TestiranjeTrokuta7 {

	public static void main(String[] args) {
		Trokut7 trokut = new Trokut7(3.1, 4.3, 5);
		System.out.println("Opseg trokuta je: " + trokut.opsegTrokuta());
		try {
			System.out.println("Povrsina trokuta je: " + trokut.povrsinaTrokuta());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
