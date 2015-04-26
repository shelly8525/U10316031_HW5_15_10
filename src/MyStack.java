import java.util.ArrayList;

public class MyStack implements Cloneable{
	//main method
	public static void main(String[] args){
		//copy MyStack method and create an object
		MyStack stack = new MyStack();
		//input 3 String
		stack.push("S");
		stack.push("S1");
		stack.push("S2");
		//copy stack 
		MyStack stack1 = (MyStack)stack.clone();
		//add 3 String
		stack1.push("S");
		stack1.push("S1");
		stack1.push("S2");
		//print stack and stack1 size
		System.out.println(stack.getSize());
		System.out.println(stack1.getSize());
	} 
	//create an list object
	private ArrayList<Object> list = new ArrayList<Object>();
	//create isEmpty() method
	public boolean isEmpty(){
		return list.isEmpty();
	}
	//create getSize() method
	public int getSize(){
		return list.size();
	}
	//create peek() method
	public Object peek(){
		return list.get(getSize() - 1);
	}
	//create pop() method
	public Object pop(){
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	//create push() method
	public void push(Object o){
		list.add(o);
	}
	//Override toString() method
	@Override
	public String toString(){
		return "stack:" + list.toString();
	}
	//create clone() method to deep copy
	public Object clone(){
		try{
			//perform a shallow copy
			MyStack MyStack1 = (MyStack)super.clone();
			//deep copy on list
			MyStack1.list = (ArrayList<Object>)(list.clone());
			return MyStack1;
		}
		catch(CloneNotSupportedException ex){
			return null;
		}
	}
}
