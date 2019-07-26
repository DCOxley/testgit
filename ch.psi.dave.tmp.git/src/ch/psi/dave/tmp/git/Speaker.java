package ch.psi.dave.tmp.git;

public class Speaker implements ISpeaker {
	public void greet(Salutation salutation) {
		System.out.println(salutation.getSalutationCall() + "Git!");
	}
	public void sayGoodbye() {
		System.out.println("Goodbye Git!");
	}
}
