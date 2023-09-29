/**
 * @author Ferdinand K. Yeke
 *
 */

/*
 * This class is a Queue that uses some LinkedList/Generic Linked
 * List data stuctures for its enqueue method (To add a new entry like
 * the addNode method) but also has its own like for dequeue an item
 * that the head holds, retrieving it, and shifting the top part/head of the
 * list to the next node, which becomes the new head. Has the getFront
 * method to get the head of the list with no change to it, clear method 
 * to clear the list.
 * 
 */
public class Queue_ADT<T> //extends Generic_LinkedList
{
	
	//Generic_LinkedList myList = new Generic_LinkedList();
	
	/*
	Generic_Node head;
	int length;
	Generic_Node tail;
	Generic_Node nextgNode;
	*/
	Generic_Node head;
	int length;
	Generic_Node tail;
	Generic_Node nextNode;
	
	
	/*
	 * @param newEntry gets added to the tail, since with
	 * queues here, the entry should be at the tail first.
	 */
	public void enqueue(Generic_Node newEntry) {
		// TODO Auto-generated method stub
		
		/*
		 * If the Queue list is empty, a list is created by
		 * the head holding the new entry, and the tail being
		 * equal to the head.
		 */
		if (isEmpty()) {
			head = newEntry;
			tail=head;
			return;
		}
		/*
		 * tail.nextNode here is when the node next to the
		 * tail has the new entry. Then tail is equal to that.
		 * Then it creates a new empty node after the nextNode by the 
		 * tail, increasing the length each time a new entry is added.
		 */
		tail.nextNode=newEntry;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}//Enqueue method ends here.


	public Generic_Node dequeue() {
		// TODO Auto-generated method stub
	
		/*
		 * Creates a Generic_Node variable called
		 * temp, which will hold the head. 
		 */
		Generic_Node temp;
		
		/*
		 * temp is now holding the head here.
		 */
		temp = head;
		
		/*
		 * Now, head is shifted to the next Node of the 
		 * Linked list, and that next Node 
		 * becomes the new Head of the list
		 *  while the length of the list decreases.
		 */
		head = head.nextNode;
		length--;
		
		/*
		 * Finally, dequeue returns the temp, which returns the 
		 * old head.
		 */
		return temp;
	}//dequeue() method ends here.

	
	/*
	 * @return head retrieves the head of the linked Queue list.
	 */
	public Generic_Node getFront() throws EmptyQueueException {
		// TODO Auto-generated method stub
		
		/*
		 * If the Queue list is empty by which the head is empty, then
		 * it throws an EmptyQueueException. Otherwise, it returns the
		 * head of the list.
		 */
		if(isEmpty()==true)
		{
			throw new EmptyQueueException("Cannot Operate on empty Queue List!");
		}
		
		else
		{
			return head;
		}
		
	}//getFront() method ends here.

	
	/*
	 * @return true If the head of the list is empty, then the list is empty.
	 * @return false Otherwise.
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head==null) { return true;}
		else return false;
	}//isEmpty() method ends here.

	
	/*
	 * The clear method clears the linked list with the
	 * while loop by making the tail and the nodes next to it null, 
	 * while decreasing the length until the list is empty.
	 */
	public void clear() {
		// TODO Auto-generated method stub
		while(!isEmpty())
		{
			tail=tail.nextNode;
			tail.nextNode=null;
			length--;
		}
	}//clear() method ends here.
	
}//Queue_ADT class ends here.
