/***************************************************
(6)	Napraviti klasu koja vodi raèuna o èitanju i pisanju podataka u datoteku. 
Kao ulazni podatak za metodu „proèitaj datoteku” se šalje samo lokacija datoteke. 
Kao ulazni podatak za metodu „napravi datoteku” se šalje lokacija 
i ime datoteke te podatak koji se upisuje.
***************************************************/

package com.filipkesteli;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitanjeIPisanjeUDatoteke6 {
	
	private String lokacijaDatoteke;
	private String tekst;
	
	public CitanjeIPisanjeUDatoteke6(String lokacijaDatoteke, String tekst) {
		super();
		this.lokacijaDatoteke = lokacijaDatoteke;
		this.tekst = tekst;
	}

	public void procitajDatoteku() {
		InputStream inputStream = null;
		try {
			inputStream = new BufferedInputStream(new FileInputStream(lokacijaDatoteke));
			
			byte bajt = (byte) inputStream.read(); //idemo od prvog byte-a i citamo byte po byte
			List<Byte> bytes = new ArrayList<>(); //we need a list because of mutability
			bytes.add(bajt);
			
			while (bajt != -1) {
				//System.out.println("Bajt: " + bajt);
				bytes.add(bajt);
				bajt = (byte) inputStream.read();
			}
			
			//converting byte-type array list into byte array
			final int n = bytes.size();
			byte[] by = new byte[n];
			for (int i = 0; i < by.length; i++) {
				by[i] = bytes.get(i);
			}
			
			String string = new String(by);
			char[] ch = string.toCharArray();
			
			System.out.println(ch); //printing an array of characters
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void napraviDatoteku(){
		OutputStream outputStream = null;
		try {
			outputStream = new BufferedOutputStream(new FileOutputStream(lokacijaDatoteke));
			outputStream.write(tekst.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static String citateljStringovaIzConsole(){
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		s.close();
		return string;
	}
}