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
		if (phrase.equals("")) {
			return "nil";
		} else if (this.isFirstVowel(phrase)) {
			if (this.isLastY()) {
				return phrase + "nay";
			}else if(this.isLastVowel(phrase)) {
				return phrase + "yay";
			}else {
				return phrase + "ay";
			}
			
		} else {
			return phrase.substring(1) + phrase.subSequence(0, 1) + "ay";
		
		}
	}
	
	
	public boolean isFirstVowel(String word) {
		char firstC = word.charAt(0);
		return vowels.contains(firstC);
	}
	
	public boolean isLastVowel(String word) {
		char lastC = word.charAt(word.length()-1);
		return vowels.contains(lastC);
	}
	
	public boolean isLastY() {
		return this.phrase.endsWith("y");
	}
	

	

}
