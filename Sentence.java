package edu.nyu.cs.jhp489;

import java.util.ArrayList;

/**
 * Sentence made up of words
 * @author jhpar
 *
 */
public class Sentence implements SequentiallyOrdered {
	
	//ArrayList to keep words
	private ArrayList<Word> wordArrayList = new ArrayList<Word>();
	
	/**
	 * method to return the first word in a sentence
	 * @return first word of a sentence
	 */
	public Word getFirst() {
		return this.wordArrayList.get(0);
	}
	
	/**
	 * method to return the last word in a sentence
	 * @return last word of a sentence
	 */
	public Word getLast() {
		return this.wordArrayList.get(this.wordArrayList.size() - 1);
	}
	
	/**
	 * method to return the ArrayList that keeps all the words in a sentence
	 * @return ArrayList<words>
	 */
	public ArrayList<OrderedThing> getSequence() {
		ArrayList<OrderedThing> newArrayList = new ArrayList<OrderedThing>();
		for (Word s: this.wordArrayList) {
			OrderedThing word = (OrderedThing) s;		//casting to avoid type mismatch
			newArrayList.add(word);
		}
		return newArrayList;
	}
	
	/**
	 * constructor for the sentence
	 * @param s - the entire sentence in string
	 */
	public Sentence(String s) {
		String[] words = s.split(" ");
		for (int i=0; i < words.length; i++) {
			Word wordToAdd = new Word(i, words[i]);
			this.wordArrayList.add(wordToAdd);
		}
	}
	
	

}
