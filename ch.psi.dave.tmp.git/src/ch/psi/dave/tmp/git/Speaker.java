package ch.psi.dave.tmp.git;

public class Speaker implements ISpeaker {

	private Salutation salutation;

	Speaker(Salutation salutation) {
		this.salutation = salutation;
	}

	public void casualGreet() {
		System.out.println(salutation.getCasualCall() + "Git!");
	}

	public void sayGoodbye() {
		System.out.println("Goodbye Git!");
	}

	@Override
	public void formalGreet() {
		System.out.println(salutation.getFormalCall() + "Git!");

	}
}
