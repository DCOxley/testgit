package ch.psi.dave.tmp.git;

public class HelloGit {

	private static final String NICE_DAY = "I hope you have a nice ";

	public static void main(String[] args) {
		Speaker speaker = new Speaker();
		Salutation salutation = new Salutation("Howdie ");

		speaker.greet(salutation);

		Day day = new Day();
		System.out.println(NICE_DAY + day.getDayName());

    Language language = new Language("French");

		speaker.sayGoodbye();
	}

}
