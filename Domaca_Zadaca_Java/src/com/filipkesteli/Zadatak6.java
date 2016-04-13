/***************************************************
(6)	Napraviti klasu koja vodi raèuna o èitanju i pisanju podataka u datoteku. 
Kao ulazni podatak za metodu „proèitaj datoteku” se šalje samo lokacija datoteke. 
Kao ulazni podatak za metodu „napravi datoteku” se šalje lokacija 
i ime datoteke te podatak koji se upisuje.
***************************************************/

package com.filipkesteli;

public class Zadatak6 {
	
	public static void main(String[] args) {
		
		CitanjeIPisanjeUDatoteke6 citanjeIPisanjeUDatoteke = new CitanjeIPisanjeUDatoteke6("D:/tet.txt", "Dostojevski je odlican ruski romanopisac...");
		citanjeIPisanjeUDatoteke.napraviDatoteku();
		citanjeIPisanjeUDatoteke.procitajDatoteku();
	}
}
