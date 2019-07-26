package ch.psi.dave.tmp.git;

import java.time.LocalDate;

public class Day {
	private String dayName;
	
	public Day() {
		this.dayName = LocalDate.now().getDayOfWeek().name();
	}

	public String getDayName() {
		return dayName;
	}
	
	
}
