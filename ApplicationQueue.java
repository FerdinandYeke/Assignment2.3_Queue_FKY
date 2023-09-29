/**
 * @author Ferdinand K. Yeke
 *
 */
public class ApplicationQueue {

	/**
	 * @param args
	 * @throws EmptyQueueException 
	 */
	public static void main(String[] args) throws EmptyQueueException {
		// TODO Auto-generated method stub
		
		Queue_ADT myQueue = new Queue_ADT();
		Generic_Node aNode = new Generic_Node();
		
		aNode.setData("Bill");
		myQueue.enqueue(aNode);
		
		aNode = new Generic_Node();
		aNode.setData("Alice");
		myQueue.enqueue(aNode);
		
		aNode = new Generic_Node();
		aNode.setData("Bob");
		myQueue.enqueue(aNode);
		
		System.out.println("VegeBurger Palace: ");
		System.out.println("Bill, Alice, and Bob are in line.");
		
		/*Creates a Generic Node variable which is tempnode.
		 * 
		 * tempnode holds the item in the head of the list by using the 
		 * getFront() method, which does not change the list. Then
		 * it gets converted to literal data (tempnode.data). And this
		 * "literal data" was a String in the list, so the .data makes
		 * sure that the tempnode item is its intended data type, which
		 * here is a String.
		 */
		
		Generic_Node tempnode;
		
			tempnode = myQueue.getFront();
			
			/*
			 * The do-while loop here prints out all the 
			 * Names of the people in the waiting line until
			 * there are no more nodes left.
			 */
			do 
			{
				System.out.println(tempnode.data);
				tempnode=tempnode.nextNode;
			} while (tempnode!=null);
		//do-while loop ends here.
			
		/*
			Generic_Node tempName = myQueue.dequeue();
			tempName = tempName.nextNode;
		System.out.println("A customer is served, which is "+tempName.data);
		*/
		
			/*
			 * tempName is similar to tempnode above. However this time it dequeues
			 * the list, meaning the head of the list gets shifted to the next node, while
			 * the item is recovered.
			 */
			
			/*
			 * In this case, the first person in the waiting line, which is Bill has 
			 * his order served, so he leaves the list, now the new person in the front
			 * is Alice.
			 */
			Generic_Node tempName = myQueue.dequeue();
			/*
			 * Order of code matters here! tempName.data converts the old "head" of the
			 * list/waiting line which is Bill, prints it out, then the head of the list/
			 * waiting line gets shifted to the next node, which becomes the new head. In
			 * which case is Alice! Below, this applies as well to the others.
			 */
			System.out.println("A customer is served, which is "+tempName.data);
			tempName = tempName.nextNode;
			
			System.out.println("Jane arrives and is at the waiting line.");
			aNode = new Generic_Node();
			aNode.setData("Jane");
			myQueue.enqueue(aNode);
			
			System.out.println("Hamad arrives and is at the waiting line.");
			aNode = new Generic_Node();
			aNode.setData("Hamad");
			myQueue.enqueue(aNode);
		
			tempName = myQueue.dequeue();
			System.out.println("Two customers are served which is: "+tempName.data+" and ");
			tempName = tempName.nextNode;
			tempName = myQueue.dequeue();
			System.out.println(""+tempName.data);
			
			System.out.println("Jim arrives and is at the waiting line.");
			aNode = new Generic_Node();
			aNode.setData("Jim");
			myQueue.enqueue(aNode);
			
			tempName = myQueue.dequeue();
			System.out.println("Two customers are served which is: "+tempName.data+" and ");
			tempName = tempName.nextNode;
			tempName = myQueue.dequeue();
			System.out.println(""+tempName.data);
			
			
		
		
	}

}
