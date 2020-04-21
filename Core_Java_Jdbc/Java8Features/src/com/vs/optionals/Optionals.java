package com.vs.optionals;

import java.util.Optional;

public class Optionals {
	
	public static void main(String[] args) {
		String[] str =new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String lowercase = str[5].toLowerCase();
			System.out.println(lowercase);
		} else {
			System.out.println("In this string their is no data prsent");
		}
		
	}

}
