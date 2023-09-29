/*@author Ferdinand K. Yeke
 * 
 */
public class Generic_Node<T> {
	
	//int data is the numeric data of the node
	T data;
	
	/*Node is set to a generic, so 
	 * it can be any data
	 * type, while still being an actual Node.
	 */
	/*
	 * nextNode is the next upcoming node
	 */
	//Generic_Node uses the Class name
	Generic_Node nextNode;
	
	/*
	 * node here (lower-cased) is just a
	 * simple node variable.
	 */
	private Generic_Node node;
	
	//Default Constructor for the node
	public Generic_Node()
	{
		nextNode=null;
		data=null;
	}//Default Constructor ends here
	
	//Setters and getters start here
	
	//setData starts here
	
	/*@param data sets the data as any
	 * simple data type
	 */
	public void setData(T data) 
	{
		this.data=data;
	}//setData ends here
	
	//getNode method starts here
	
	//@return returns the Generic Node
	public Generic_Node<T> getNode() 
	{
		return this;
	}//getNode method ends here
	
	
	//setNode method starts here
	/*@param node sets the node to any data
	 * type, since Node is set as a Generic
	 */
	/*
	public void setNode(Node node)
	{
		this.node = node;
	}//setNode method ends here
	*/
	
	//setNextNode methods starts here
	//@param nextNode sets the next upcoming node
	public void setNextNode(Generic_Node nextNode)
	{
		this.nextNode=(Generic_Node) nextNode;
	}//setNextNode method ends here
	
}//Class ends here
