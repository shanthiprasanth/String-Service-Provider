package com.css.corejava.stringservieproviderreverse;

public class StringServiceProviderReverse {

	public static void main(String[] args) {
		String name = "shanthi prasanth";
		int len = 0, i = 0;
		try {
			while (true) {
				if (name.charAt(i) != '\0')
					len++;
				i++;

			}
		} catch (Exception e) {
//			System.out.println(name);
//			System.out.println(len);
		}
		for (int j = len - 1; j >= 0; j--) {
			System.out.print(name.charAt(j));
		}
}
}
