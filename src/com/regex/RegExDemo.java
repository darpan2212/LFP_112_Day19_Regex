package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		String p1 = "[a-zA-Z]{3,}";
		String p2 = "^[0-9]*";
		String p3 = "[0-9a-zA-Z]*$";
		String resultPattern = p2 + p1 + p3;

		Pattern pattern = Pattern.compile(resultPattern);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = sc.nextLine();

		sc.close();

		if (pattern.matcher(input).matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

}