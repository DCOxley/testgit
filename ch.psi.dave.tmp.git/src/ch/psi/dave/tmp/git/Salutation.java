package ch.psi.dave.tmp.git;

public class Salutation {

	private final static String DEFAULT_CALL = "Hello";
	private String formalCall;
	private String casualCall;	

	public String getFormalCall() {
		return formalCall;
	}

	public String getCasualCall() {
		return casualCall;
	}

	public Salutation() {
		new Salutation(DEFAULT_CALL, DEFAULT_CALL);
	}
	
	public Salutation(String formalCall) {
		new Salutation(formalCall, formalCall);
	}
	
	public Salutation(String formalCall, String casualCall) {
		this.formalCall = formalCall;
		this.casualCall = casualCall;
	}
}
