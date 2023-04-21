package piglatintranslator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TranslatorTest {

	@Test
	public void testInputPhrase() {
		Translator translator = new Translator ("Hello World");
		assertEquals("Hello World", translator.getPhrase());
	}
	
	@Test
	public void testTranslationEmptyPhrase() throws Exception {
		Translator translator = new Translator ("");
		assertEquals("nil", translator.translate());
	}
	
	@Test
	public void testFirstLetterIsVowelA() throws Exception {
		Translator translator = new Translator ("");
		assertTrue(translator.isFirstVowel("any"));
	}
	
	@Test
	public void testFirstLetterIsVowelU() throws Exception {
		Translator translator = new Translator ("");
		assertTrue(translator.isFirstVowel("unity"));
	}
	
	@Test
	public void testFirstLetterIsNotVowel() throws Exception {
		Translator translator = new Translator ("");
		assertFalse(translator.isFirstVowel("base"));
	}
	
	@Test
	public void testTranslationWordStartsWithVowelEndWithY() throws Exception {
		Translator translator = new Translator ("any");
		assertEquals("anynay",translator.translate());
	}
	
	@Test
	public void testTranslationWordStartsWithVowelEndsWithVowel() throws Exception {
		Translator translator = new Translator ("apple");
		assertEquals("appleyay",translator.translate());
	}
	
	

}
