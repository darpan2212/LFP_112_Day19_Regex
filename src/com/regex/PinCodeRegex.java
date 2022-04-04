package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PinCodeRegex {

	public static void main(String[] args) {

		String pinCode = "^[0-9]{3}(\s)?[0-9]{3}$";

		
		Pattern pinCodePattern = Pattern.compile(pinCode);

		System.out.println("Enter the pincode : ");

		Scanner sc = new Scanner(System.in);

		String pinInput = sc.nextLine();

		if (pinCodePattern.matcher(pinInput).matches()) {
			System.out.println("Valid pin code");
		} else {
			System.out.println(
					"Invalid input, Enter the valid pin code");
		}
		sc.close();
	}

}