package ch.psi.dave.tmp.git;

public class Salutation {

	private final String salutationCall;

	public Salutation() {
		salutationCall = "Hello";
	}
	
	public Salutation(String call) {
		this.salutationCall = call;
	}

	public String getSalutationCall() {
		return salutationCall;
	}
}
