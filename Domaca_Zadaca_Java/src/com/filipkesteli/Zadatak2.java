/***************************************************
(2)	Napišite program koji zbraja unošene brojeve 
tako dugo dok korisnik ne upiše nulu. 
Napomena: koristi while ili do-while petlju sa uvjetom (broj != 0)
***************************************************/

package com.filipkesteli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner s = null;
		List<Integer> list = new ArrayList<>();
		try {
			System.out.println("Upisite brojeve:");
			s = new Scanner(System.in);
			do {
				list.add(s.nextInt());
			} while (list.get(list.size()-1) != 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			s.close();
		}
		//ispis:
		System.out.println("Zbroj svih unesenih brojeva: ");
		int zbroj = 0;
		for (Integer i : list) {
			zbroj += i;
		}
		System.out.println(zbroj);
	}
}

