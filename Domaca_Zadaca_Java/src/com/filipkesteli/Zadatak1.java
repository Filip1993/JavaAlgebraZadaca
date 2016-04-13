/***************************************************
(1)	Napišite program koji upisuje u listu 
sve troznamenkaste brojeve djeljive sa n, 
gdje je n broj od 1 do 10 koji unosi korisnik. 
A kasnije te brojeve ispisuje na ekran. 
(Probajte ispis sa petljom foreach)
***************************************************/

package com.filipkesteli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Scanner s = null;
		int n = 0;
		try {
			System.out.println("Unesite broj: ");
			s = new Scanner(System.in);
			n = s.nextInt();
			//upis:
			for (int i = 100; i < 999; i++) {
				if (i % n == 0) {
					list.add(i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (s != null) {
				try {
					s.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		//ispis
		System.out.println("Svi troznamenkasti brojevi djeljivi s " + n + ":");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
