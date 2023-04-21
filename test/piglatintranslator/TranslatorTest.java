package piglatintranslator;

import static org.junit.Assert.*;

import org.junit.Ignore;
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
	
	@Test
	public void testTranslationWordStartsWithConsonantH() throws Exception {
		Translator translator = new Translator ("hello");
		assertEquals("ellohay",translator.translate());
	}

	@Test
	public void testTranslationWordStartsWithConsonantZ() throws Exception {
		Translator translator = new Translator ("zap");
		assertEquals("apzay",translator.translate());
	}
	

	@Test
	public void testTranslationWordStartsWithMoreConsonant() throws Exception {
		Translator translator = new Translator ("known");
		assertEquals("ownknay",translator.translate());
	}
	
	@Test
	public void testCountsStartingWith2Consonants() throws Exception {
		Translator translator = new Translator ("");
		assertEquals(2,translator.countStartingConsonants("known"));
	}
	
	@Test
	public void testCountsStartingWith0Consonants() throws Exception {
		Translator translator = new Translator ("");
		assertEquals(0,translator.countStartingConsonants("apple"));
	}
	
	@Test
	public void testCountsStartingWithOnlyConsonants() throws Exception {
		Translator translator = new Translator ("");
		assertEquals(2,translator.countStartingConsonants("kb"));
	}
	
	@Test
	public void testStartingWithOnlyConsonants() throws Exception {
		Translator translator = new Translator ("kb");
		assertEquals("kbay",translator.translate());
	}
	
	@Test
	public void testTranslationPhrase() throws Exception {
		Translator translator = new Translator ("hello world");
		assertEquals("ellohay orldway",translator.translate());
	}
	
	
	

}
