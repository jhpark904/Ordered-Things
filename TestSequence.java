package edu.nyu.cs.jhp489;

/**
 * Program to test the sequenced things with the main method
 * @author jhpar
 *
 */
public class TestSequence {
	
	/**
	 * main method for the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create a Sentence Object
		Sentence mySentence;
		mySentence = new Sentence("This is my beautiful sentence");
		
		// calling methods in the Sentence class
		System.out.println("The first word of the sentence: " + mySentence.getFirst().toString());
		System.out.println("The last word of the sentence: " + mySentence.getLast().toString());
		System.out.println("The sequence of the sentence: " + mySentence.getSequence());
		
		// calling methods in the Word class to the 2nd last Word in the ArrayList<Word>
		Word secondLastWord = (Word) mySentence.getSequence().get(mySentence.getSequence().size() - 2);
		System.out.println("The first Character of the 2nd last Word: " + secondLastWord.getFirst().toString());
		System.out.println("The last Character of the 2nd last Word: " + secondLastWord.getLast().toString());
		System.out.println("The sequence of the 2nd last Word: " + secondLastWord.getSequence().toString());
		System.out.println("The position of the 2nd last Word in the Sentence: " + secondLastWord.getPosition());

	}

}
