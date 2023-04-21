package piglatintranslator;

public class Translator {
	private String phrase;

	public Translator(String phrase) {
		this.phrase=phrase;
	}

	public String getPhrase() {
		return this.phrase;
	}

	public String translate() throws PigLatinException {
		return "nil";
	}

}
