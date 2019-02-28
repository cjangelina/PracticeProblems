
public class MyStack {
	Node head;
	//default constructor 
	public MyStack()
	{
		head= null; 
	}
	//paramerterized constructor 
	public MyStack(String[] list) 
	{
		
		for(String currElement: list)
		{
			this.push(currElement);
		}
		
	}
	public void push(String item)
	{
		Node tempHead= head;
		head= new Node();
		
		head.data= item;
		head.next= tempHead;
	}
	public String pop()
	{
		if(head== null)
		{
			throw new RuntimeException("Stack underflow");
		}
		String popData= head.data;
		head= head.next;
		return popData;
	}
	
	public void printStack()
	{
		if(head==null)
		{
			System.out.println("Stack is empty.");
		}
		else
		{
			Node temp= head;
			for(; temp!= null; temp= temp.next)
			{
				System.out.println(temp.data);
			}
		}
	}
	
	public boolean isEmpty()
	{
		if(head== null)
		{
			return true;
		}
		return false;
	}
	

}
