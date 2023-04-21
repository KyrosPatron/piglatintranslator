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
	

}
