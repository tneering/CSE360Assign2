/* Author: Tyler Neerings, 1209589391
 * Class ID: CSE 360, 70641
 * Assignment: 2
 * AddingMachine class: This class will add and subtract values from a private int total, and will log the changes 
 *                      in the private String history. 
 *                      Contains methods: getTotal() to return the int total; add(int) to add that int to the total, 
 *                      and log it in string history; subtract(int) to subtract that int from the total, and log it 
 *                      in string history; toString() to return the string of the history of additions and subtractions; 
 *                      clear() to set total and history to default values 0.
 */ 

package cse360assign2;

public class AddingMachine {

	private int total; //current total value
	private String history;	//history of transactions
	
	//Default constructor, sets total to 0 and string to "0". Takes no arguments.
	public AddingMachine () {
		total = 0;  // initializes total
		history = "0"; // initializes history.
	}
	
	//Returns the value of total. Takes no arguments
	public int getTotal () {
		return total; //return total
	}
	
	//Takes an integer value and adds it to the total. Includes it in the history string.
	public void add (int value) {
		history += " + " + value; //log in history
		total += value; //add to total
	}
	
	//Takes an integer value and subtracts it from the total. Includes it in the history string.
	public void subtract (int value) {
		history += " - " + value; //log in history
		total -= value; //subtract from total
	}
		
	//Returns the history of operations, from original. Takes no arguments.
	public String toString () { 
		return history; //returns the string history, containing all addition and subtractions from input.
	}

	//Sets the total to 0 and removes the history. Takes no arguments.
	public void clear() {
		total = 0; //sets to default
		history = "0"; //sets to default
	}
}
