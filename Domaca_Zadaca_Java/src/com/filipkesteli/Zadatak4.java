/***************************************************
(4)	Sa konzole se traži da se upiše rijeè. 
Ta rijeè se upiše u datoteku, 
pa se ta rijeè proèita iz datoteke 
i treba se provjeriti da li je palindrom.
***************************************************/
package com.filipkesteli;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner s = null;
		
		s = new Scanner(System.in);
		String text = s.nextLine(); //korisnik upise u konzolu String
		//Writer writer = new PrintWriter(text);
		
		//ispis u datoteku:
		OutputStream outputStream = null;
		try {
			outputStream = new BufferedOutputStream(new FileOutputStream("d:/dat.txt"));
			//outputStream.write(writer);
			outputStream.write(text.getBytes());
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
		
		
		//citanje iz datoteke:
		String niz = null;
		InputStream inputStream = null;
		List<Byte> listaByteova = new ArrayList<>();
		try {
			inputStream= new BufferedInputStream(new FileInputStream("d:/dat.txt"));
			//byte bajt = (byte) inputStream.read(); //idemo od prvog byte-a i citamo byte po byte
			
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
		
		s.close();
		System.out.println("Da li je " + text + " palindrom? " + isPalindrom(text));
		System.out.println("Tekst iz datoteke: " + niz);
//		for (Byte byte1 : listaByteova) {
//			System.out.println(byte1);
//		}
	}
	
	private static boolean isPalindrom(String znakovi){
		boolean da = false;
		if (znakovi.length() != 0) {
			for (int i = 0; i < znakovi.length(); i++) {
				if (znakovi.toLowerCase().charAt(i) == znakovi.charAt(znakovi.length() - 1 - i)) {
					da = true;
				}
			} 
		}
		return da;
	}
}