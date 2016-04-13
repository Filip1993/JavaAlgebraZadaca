/***************************************************
(5)	Napravit program koji broji rijeèi u nekoj tekstualnoj datoteci.
***************************************************/

package com.filipkesteli;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Zadatak5 {

	public static void main(String[] args) {
		//najprije ucitamo String iz console
		//onda upisemo String u datoteku
		upisivacStringovaUDatoteku(citateljStringova());
		//citamo iz datoteke i brojimo koliko ima rijeci
		//brojacRijeciIzDatoteke(vaditeljStringovaIzDatoteke());
		char[] ccc = vaditeljStringovaIzDatoteke();
		
		String s = ccc.toString();
		
		//brojacRijeciIzDatoteke(s);
		System.out.println(ccc);
		System.out.println(s);
		brojacRijeciIzDatoteke(s);
	}
	
	public static String citateljStringova(){
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		s.close();
		return string;
	}
	
	private static void upisivacStringovaUDatoteku(String string){
		OutputStream outputStream = null;
		try {
			outputStream = new BufferedOutputStream(new FileOutputStream("d:/datot.txt"));
			outputStream.write(string.getBytes());
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
	
	private static char[] vaditeljStringovaIzDatoteke(){
		
		//citanje iz datoteke:
		InputStream inputStream = null;
		List<Byte> listaByteova = new ArrayList<>();
		char ch[] = null;
		try {
			inputStream= new BufferedInputStream(new FileInputStream("d:/datot.txt"));
			//byte bajt = (byte) inputStream.read(); //idemo od prvog byte-a i citamo byte po byte
			byte bajt = (byte) inputStream.read(); //idemo od prvog byte-a i citamo byte po byte
			List<Byte> bytes = new ArrayList<>(); //we need a list because of mutability
			bytes.add(bajt);
			
			while (bajt != -1) {
				//System.out.println("Bajt: " + bajt);
				bytes.add(bajt);
				bajt = (byte) inputStream.read();
			}
			
			final int n = listaByteova.size();
			byte[] by = new byte[n];
			for (int i = 0; i < by.length; i++) {
				by[i] = listaByteova.get(i);
			}
			
			String string = new String(by);
			ch = string.toCharArray();
			for (char c : ch) {
				System.out.println(c);
			}
			System.out.println(ch);
			
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
		return ch;
	}
	
	
	
	private static void brojacRijeciIzDatoteke(String string){	
		int brojac = 1;
		for (int i = 0; i < string.length()-1; i++) {
			if (string.charAt(i) == ' ' && string.charAt(i+1) != ' ') {
				brojac++;
			}
		}
		System.out.println("Broj rijeci u datoteci je: " + brojac);
	}
	
	
	
}



