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
		String translation="";
		String[] words = phrase.split("\\s");
		
		for (String word : words) {
			translation+=this.translateWord(word) + " ";
			
		}
		
		return translation.trim();
	}

	public String translateWord(String word) {
		if (word.equals("")) {
			return "nil";
		} else if (this.isFirstVowel(word)) {
			if (this.isLastY(word)) {
				return word + "nay";
			}else if(this.isLastVowel(word)) {
				return word + "yay";
			}else {
				return word + "ay";
			}
			
		} else {
			int count = this.countStartingConsonants(word);
			return word.substring(count) + word.subSequence(0, count) + "ay";
		
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
	
	public boolean isLastY(String word) {
		return word.endsWith("y");
	}

	public int countStartingConsonants(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (vowels.contains(word.charAt(i))){
				return i;
			}
		}
		return word.length();
	}
	

	

}
