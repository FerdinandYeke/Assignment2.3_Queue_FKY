
/*@author Ferdinand K. Yeke
 * 
 */
public class Generic_LinkedList<T> {
	
	/*Some of these variables have a 
	 * Node head and Node tail, which is
	 * the top and down body of the node.
	 * 
	 */
	
	//Generic_Node uses the Class name, while replace the 
	//object name Node
	Generic_Node head;
	int length;
	Generic_Node tail;
	Generic_Node nextgNode;
	
	//Default Constructor starts here
	public Generic_LinkedList()
	{
		head=null;
		length = 0;
		tail = head;
		nextgNode = head;
		
	}//Default Constructor ends here
	
	//isEmpty method starts here
	/*isEmpty returns a boolean value
	 * of where the node is empty or not
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//isEmpty method ends here
	
	//getList starts here
	//@return head returns the head of the node
	public Generic_Node getList()
	{
		return head;
	}//getList ends here
	
	//addNode methods starts here
	
	/*@param aNode is a generic node variable,
	 * while this also adds a node.
	 */
	public void addNode(Generic_Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}

}
