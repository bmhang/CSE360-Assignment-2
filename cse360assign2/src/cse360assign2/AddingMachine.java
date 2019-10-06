/*
 * Brandon Hang
 * CSE360, Monday
 * Assignment 2
 * Description: This file contains the AddingMachine class, which is used to add and subtract numbers
 */

package cse360assign2;

/**
 * The <code>AddingMachine</code> class enables the addition and subtraction of integers.
 * The total is stored after every operation.
 */
public class AddingMachine {

	private int total;
	
	/**
	 * Instantiates a new <code>AddingMachine</code> object
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gets the total value of all summed and/or subtracted numbers.
	 *
	 * @return	an <code>int</code> containing the total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds an integer to the total currently stored in this object.
	 * 
	 * @param value	the <code>int</code> to be added
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts an integer from the total currently stored in this object.
	 * 
	 * @param value the <code>int</code> to be subtracted
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Holds the history of all operations (addition and subtraction) performed on this object, starting with 0.<p>
	 * For example, this method will return "0 + 4 - 2 + 5" after these operations are performed using
	 * the <code>add</code> and <code>subtract</code> methods.
	 * 
	 * @return	a string containing all values and operations performed
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * Removes all previous operations and resets the total of this object to 0.
	 */
	public void clear() {
	
	}
}
