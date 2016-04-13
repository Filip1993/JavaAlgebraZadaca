package com.filipkesteli;

public class WordCounter {

	public static void main(String[] args) {
		System.out.println(wordCounter());
		wordCounter2();
		brojacRijeciIzDatoteke("saofas nfiasno nfiaonf nfiasn nifsa");
	}

	private static int wordCounter(){
		String s = "dad je tu";
		String trim = s.trim();
	    if (trim.isEmpty())
	        return 0;
	    return trim.split("\\s+").length; // separate string around spaces
	}
	
	private static void wordCounter2(){
		String s = "dad je tu";
		int brojac = 1;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				brojac++;
			}
		}
		System.out.println(brojac);
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
