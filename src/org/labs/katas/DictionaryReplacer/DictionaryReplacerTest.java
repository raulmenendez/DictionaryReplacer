package org.labs.katas.DictionaryReplacer;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This kata is about making a simple string replacer. 
 * 
 * It is inspired by Corey Haines Lightning talk about practicing. (aac2009.confreaks.com/06-feb-2009-20-30-lightning-talk-under-your-fingers-corey-haines.html)
 * Create a method that takes a string and a dictionary, and replaces every key in the dictionary pre and suffixed with a dollar sign, with the corresponding value from the Dictionary.
 *
 * @author raul
 *
 */
public class DictionaryReplacerTest {

	@Test
	public void an_empty_string_to_replace() {
	
		DictionaryReplacer dictionaryReplacer = new DictionaryReplacer();
		
		String replacedString = dictionaryReplacer.replace("","");
		
		assertEquals("",replacedString);
		
	}
	
	@Test
	public void a_string_with_an_empty_dictionary_to_replace() {
	
		DictionaryReplacer dictionaryReplacer = new DictionaryReplacer();
		
		String replacedString = dictionaryReplacer.replace("hola","");
		
		assertEquals("",replacedString);
		
	}
	
	@Test
	public void a_string_with_an_correct_dictionary_to_replace() {
	
		DictionaryReplacer dictionaryReplacer = new DictionaryReplacer();
		
		Dictionary dictionary = new Dictionary();
		dictionary.add("hola","adios");
		
		String replacedString = dictionaryReplacer.replace("hola",dictionary);
		
		assertEquals("",replacedString);
		
	}
	
	

}
