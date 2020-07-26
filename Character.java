package edu.nyu.cs.jhp489;

/**
 * Character that makes up a word
 * @author jhpar
 *
 */
public class Character extends OrderedThing{
	private char self; 		//the character itself
	private int position;		//index position of a character in a word
	
	/**
	 * constructor for Character
	 * @param self - the character itself
	 * @param position - index position
	 */
	public Character(char self, int position) {
		this.self = self;
		this.position = position;
	}
	
	/**
	 * method to convert the character to string
	 * @return String of the character
	 */
	public String toString() {
		return java.lang.Character.toString(this.self);
	}
	
	/**
	 * method to get index position of a character in a word
	 * @return index position of a character in a word
	 */
	public int getPosition() {
		return this.position;
	}
	
	
	
	
}
