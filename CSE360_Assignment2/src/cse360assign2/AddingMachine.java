/* Author: Tyler Neerings, 1209589391
 * Class ID: CSE 360, 70641
 * Assignment: 2
 * AddingMachine class: This class will add and subtract values from a private int total, 
 *                      and will log the changes in the private String history.
 */ 

package cse360assign2;

public class AddingMachine {

	private int total; //current total value
	private String history;	//history of transactions
	
	//Default constructor, sets total to 0 and string to "0"
	public AddingMachine () {
		total = 0;  // initializes total
		history = "0"; // initializes history.
	}
	
	//Returns the value of total
	public int getTotal () {
		return total; //return total
	}
	
	//Takes an int value and adds it to the total.
	public void add (int value) {
		history += " + " + value; //log in history
		total += value; //add to total
	}
	
	//Takes an int value and subtracts it from the total.
	public void subtract (int value) {
		history += " - " + value; //log in history
		total -= value; //subtract from total
	}
		
	//Returns the history of operations, from original.
	public String toString () { 
		return history;
	}

	//Sets the total to 0 and removes the history.
	public void clear() {
		total = 0; //sets to default
		history = "0"; //sets to default
	}
}
