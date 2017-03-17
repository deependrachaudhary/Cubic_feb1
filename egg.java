package com.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public void isanna(String s1, String s2) {

		char[] w1 = s1.toLowerCase().toCharArray();
		char[] w2 = s2.toLowerCase().toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		if (Arrays.equals(w1, w2)) {
			System.out.println("Anagrams");
		} else
			System.out.println("not a anagrams");

	}

	public static void main(String[] args) {
		String str;
		String str2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter string 1");
			str = sc.nextLine();
			System.out.println("Enter String 2");
			str2 = sc.nextLine();
			Anagrams an = new Anagrams();

			an.isanna(str, str2);

		} while (true);
	}

}
