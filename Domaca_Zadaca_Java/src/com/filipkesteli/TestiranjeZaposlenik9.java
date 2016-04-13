package com.filipkesteli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestiranjeZaposlenik9 {

	public static void main(String[] args) {
		List<Zaposlenik9> zap = new ArrayList<>();
		
		Scanner s = null;
		try {
			s = new Scanner(System.in);
			
			System.out.println("Unesite broj osoba: ");
			int n = s.nextInt();
			
			for (int i = 0; i < n; i++) {
				System.out.println("Unesite ime " + (i+1) + ". osobe: ");
				String im = s.next();
				System.out.println("Unesite prezime " + (i+1) + ". osobe: ");
				String prez = s.next();
				System.out.println("Unesite placu " + (i+1) + ". osobe: ");
				double pla = s.nextDouble();
				
				Osoba9 os = new Osoba9(im, prez);
				Zaposlenik9 zaposlenik9 = new Zaposlenik9(os, pla);
				zap.add(zaposlenik9);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (s != null) {
				s.close();
			}
		}
		
		//sortiramo kolekciju zaposlenika zap po placi:
		Collections.sort(zap);
		
		//ispisujemo zaposlenike sortirane prema placi:
		for (Zaposlenik9 zaposlenik9 : zap) {
			System.out.println(zaposlenik9);
		}
		
		Zaposlenik9.najvecaPlaca(zap);
		Zaposlenik9.najmanjaPlaca(zap);
	}
}
