package edu.nyu.cs.jhp489;

import java.util.ArrayList;

/**
 * given interface representing the methods in the things that are made up of ordered things
 * @author jhpar
 *
 */
public interface SequentiallyOrdered {
	
	/**
	 * return the first ordered thing
	 * @return the first ordered thing
	 */
	public abstract OrderedThing getFirst();
	
	/**
	 * return the last ordered thing
	 * @return the last ordered thing
	 */
	public abstract OrderedThing getLast();
	
	/**
	 * return the ArrayList of ordered things
	 * @return the ArrayList of ordered things
	 */
	public abstract ArrayList<OrderedThing> getSequence();

}