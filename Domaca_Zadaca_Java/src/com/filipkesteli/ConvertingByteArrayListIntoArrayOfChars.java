package com.filipkesteli;

import java.util.ArrayList;
import java.util.List;

public class ConvertingByteArrayListIntoArrayOfChars {

	public static void main(String[] args) {
		List<Byte> bytes = new ArrayList<>();
		bytes.add((byte) 75);
		bytes.add((byte) 97);
		bytes.add((byte) 88);
		bytes.add((byte) 111);
		
		final int n = bytes.size();
		byte[] by = new byte[n];
		for (int i = 0; i < by.length; i++) {
			by[i] = bytes.get(i);
		}
		
		String string = new String(by);
		char[] ch = string.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println(ch);
	}
}