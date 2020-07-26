package edu.nyu.cs.jhp489;

/**
 * abstract class for all ordered things such as character and word
 * @author jhpar
 *
 */
public abstract class OrderedThing {
	
	int position;	// index position of an ordered thing
	
	/**
	 * method to return an ordered thing in string
	 * @return string representation of an ordered thing
	 */
	public abstract String toString();
	
	/**
	 * method to return index position of an ordered thing
	 * @return int - index position
	 */
	public abstract int getPosition();
	
}
