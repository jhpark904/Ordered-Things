package edu.nyu.cs.jhp489;

import java.util.ArrayList;

/**
 * word made out of characters and makes up a sentence
 * @author jhpar
 *
 */
public class Word extends OrderedThing implements SequentiallyOrdered {
	
	private int position;		//index position
	private ArrayList<Character> charArrayList = new ArrayList<Character>();		//ArrayList to contain characters that make up the word
	
	/**
	 * constructor for word
	 * @param position - index position in a sentence that the word will make up
	 * @param characters - characters that build the word
	 */
	public Word(int position, String characters) {
		this.position = position;
		for (int i=0; i < characters.length(); i++) {
			Character charToAdd = new Character(characters.charAt(i), i);
			this.charArrayList.add(charToAdd);
		}
	}
	
	/**
	 * method to get the first character of a word
	 * @return first character
	 */
	public Character getFirst() {
		return this.charArrayList.get(0);
	}
	
	/**
	 * method to get the last character of a word
	 * @return last character
	 */
	public Character getLast() {
		return this.charArrayList.get(charArrayList.size() - 1);
	}
	
	/**
	 * method to return the entire array of characters that make up the word
	 * @return ArrayList<Word>
	 */
	public ArrayList<OrderedThing> getSequence() {
		ArrayList<OrderedThing> newArrayList = new ArrayList<OrderedThing>();
		for (Character c: this.charArrayList) {
			OrderedThing charac = (OrderedThing) c;
			newArrayList.add(charac);
		}
		return newArrayList;
	}
	
	/**
	 * method to get index position of the word in the sentence
	 * @return int position
	 */
	public int getPosition() {
		return this.position;
	}
	
	/**
	 * method to convert the character array to one string
	 * @return String representation of a word
	 */
	public String toString() {
		String string = ""; 
		for (Character c: this.charArrayList) {
			string += c;
		}
		return string;
	}
	
}
