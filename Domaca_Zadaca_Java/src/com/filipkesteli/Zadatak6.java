/***************************************************
(6)	Napraviti klasu koja vodi ra�una o �itanju i pisanju podataka u datoteku. 
Kao ulazni podatak za metodu �pro�itaj datoteku� se �alje samo lokacija datoteke. 
Kao ulazni podatak za metodu �napravi datoteku� se �alje lokacija 
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
