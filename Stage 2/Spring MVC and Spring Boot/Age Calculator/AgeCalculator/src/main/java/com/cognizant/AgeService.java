package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {

	public String calculateAge(String date) {

		// add the code as per the requirement

		LocalDate today = LocalDate.now();

		LocalDate dob = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		Period age = Period.between(dob, today);

		return "you are " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days old.";
	}
}
