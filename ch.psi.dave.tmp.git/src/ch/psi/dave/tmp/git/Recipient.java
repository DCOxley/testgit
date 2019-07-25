package ch.psi.dave.tmp.git;

public class Recipient {
	private final String fullname;
	private final String nickname;

	public Recipient() {
		fullname = "git";
		nickname = fullname;
	}

	public Recipient(String fullname) {
		this.fullname = fullname;
		this.nickname = this.fullname;
	}

	public Recipient(String fullname, String nickname) {
		this.fullname = fullname;
		this.nickname = nickname;
	}

}
