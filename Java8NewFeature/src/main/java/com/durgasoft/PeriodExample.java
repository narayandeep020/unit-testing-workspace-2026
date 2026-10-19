package com.durgasoft;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {

		LocalDate birth = LocalDate.of(2001, 8, 4);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birth, today);
		System.out.printf("Age is %d Years %d Months %d Days", p.getYears(), p.getMonths(), p.getDays());

		LocalDate death = LocalDate.of(2001 + 60, 8, 4);
		Period p1 = Period.between(today, death);
		int d = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
		System.out.printf("\nYou will be earth on only %d Days, So do you favorite things", d);
	}

}
