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
	public void testTranslationWordStartsWithVowelEndsWithY() throws Exception {
		Translator translator = new Translator ("any");
		assertEquals("anynay",translator.translate());
	}
	
	@Test
	public void testTranslationWordStartsWithVowelAEndsWithVowelE() throws Exception {
		Translator translator = new Translator ("apple");
		assertEquals("appleyay",translator.translate());
	}
	
	@Test
	public void testTranslationWordStartsWithVowelIEndsWithVowelA() throws Exception {
		Translator translator = new Translator ("idea");
		assertEquals("ideayay",translator.translate());
	}
	
	@Test
	public void testTranslationWordStartsWithVowelUEndsWithVowelO() throws Exception {
		Translator translator = new Translator ("undo");
		assertEquals("undoyay",translator.translate());
	}
	
	@Test
	public void testTranslationWordStartsWithVowelAEndsWithConsonantK() throws Exception {
		Translator translator = new Translator ("ask");
		assertEquals("askay",translator.translate());
	}
	
	@Test
	public void testTranslationWordStartsWithVowelIEndsWithConsonantD() throws Exception {
		Translator translator = new Translator ("indeed");
		assertEquals("indeeday",translator.translate());
	}
	

}
