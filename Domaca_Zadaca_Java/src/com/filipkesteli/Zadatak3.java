/***************************************************
(3)	Napišite program koji uèitava prirodne brojeve, 
a na kraju ispiše najveæi od uèitanih brojeva i 
najmanji od uèitanih brojeva 
(program se prekida kad je upisana 0)
***************************************************/
package com.filipkesteli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner s = null; //inicijalizacija
		List<Integer> list = new ArrayList<>();
		try {
			s = new Scanner(System.in);
			//ucitavanje prirodnih brojeva:
			int pomoc = 0;
			do {
				pomoc = s.nextInt();
				if (pomoc != 0) {
					list.add(pomoc);
				}
			} while (pomoc != 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			s.close(); //zatvaranje pipe	
		}
		
		najmanjiBrojUListi(list);
		najveciBrojUListi(list);
	}
	
	private static void najmanjiBrojUListi(List<Integer> lala) {
		int min = lala.get(0);
		for (Integer i : lala) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("Najmanji uneseni broj: " + min);
	}
	
	private static void najveciBrojUListi(List<Integer> lala) {
		int max = lala.get(0);
		for (Integer i : lala) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println("Najveci uneseni broj: " + max);
	}
}