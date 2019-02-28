
public class MyQueue 
{
	MyStack stack= new MyStack();
	
	public MyQueue()
	{}
	
	public MyQueue(String[] list)
	{
		stack= new MyStack(list);	
	}
	
	public void enqueue(String item)
	{
		stack.push(item);
	}
	
	public String dequeue()
	{
		MyStack tempStack= new MyStack();
		for(; !stack.isEmpty();)
		{
			tempStack.push(stack.pop());
		}
		String poppedData= tempStack.pop();
		for(; !tempStack.isEmpty();)
		{
			stack.push(tempStack.pop());
		}
		return poppedData;
		
	}
	
	public void printQueue()
	{
		if(!stack.isEmpty()) 
		{
		   stack.printStack();
		}
		else 
		{
			System.out.println("Queue is empty");
		}
	}
	
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	

}
