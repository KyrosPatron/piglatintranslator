package piglatintranslator;

import java.util.HashSet;
import java.util.Set;

public class Translator {
	private String phrase;
	private final static Set<Character> vowels;
	
	static {
		vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
	}

	public Translator(String phrase) {
		this.phrase=phrase;
	}

	public String getPhrase() {
		return this.phrase;
	}

	public String translate() throws PigLatinException {
		return "nil";
	}
	
	
	public boolean isFirstVowel(String word) {
		char firstC = word.charAt(0);
		return vowels.contains(firstC);
	}
	

}
