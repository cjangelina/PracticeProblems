
public class MyTest 
{
	public static void main (String[] args)
	{
		String[] colors= new String[] {"Purple", "Red", "Green"};
		MyStack stack= new MyStack(colors);
		MyStack stack2= new MyStack();
		stack.push("hello");
		stack.push("bye");
		stack.push("yes");
		System.out.println("The Stack consist of:");
		stack.printStack();
		System.out.println("************************************************************");
		System.out.println("The Stack will pop elements:");
		System.out.println(stack.pop() + " is popped");
		System.out.println(stack.pop() + " is popped");
		System.out.println(stack.pop() + " is popped");
		System.out.println(stack.pop() + " is popped");
		System.out.println(stack.pop() + " is popped");
		//System.out.println(stack.pop() + " is popped");
		stack.printStack();
		// If the below line is uncommented it will throw StackUnderflow runtime exception
		// stack.pop();
		System.out.println();
		System.out.println("Is the Stack empty? \n" + stack.isEmpty());
		System.out.println("Is the Stack 2 empty? \n" + stack2.isEmpty());
		
		System.out.println("************************************************************");
		System.out.println("The Stack will enqueue elements:");
		MyQueue queue= new MyQueue();
		queue.enqueue("strawberries");
		queue.enqueue("bananas");
		queue.enqueue("grapes");
		queue.printQueue();
		
		System.out.println("************************************************************");
		System.out.println("The Stack will dequeue the first element in the Stack:");
		queue.dequeue();
		System.out.println("After dequeuing the queue elements are:");
		queue.printQueue();
	}

}
