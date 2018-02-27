//Implement stack using an array - resizing of array
//Implement queue using linked list
//Implement queue using an array - resizing of array (tricky)
//Implement Iterator - hasNext() and next()
//Implement List - using Stack and queue
//Arithmetic expression evaluation - using stack and queue - Djikstra's - Two stack algorithm
	/*Left Parenthesis - Ignore
	 Right Parenthesis - Pop operand and 2 values
	 Push that result of applying the operator to the two values to 
	 the operand stack
	 Implement for multiple operations*/

package com.test.firstproject;
//Implement stack using an array - resizing of array
public class Stack {
	private int array[] = new int[4];
	int newArray[];
	int popArray[];
	private int count=0;
	
	public static void main(String[] args) {	
		Stack stack = new Stack();
		stack.push(2);
		stack.push(6);
		stack.push(5);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	public void push(int a){
		if(count > array.length-1){
			newArray = new int[2 * array.length];
			int i=0;
			for(Integer ar : array) {
				newArray[i++] = ar;
			}
			newArray[count] = a;
			count=count + 1;
		}else {
			array[count++] = a;
		}
	}
	
	public int pop() {
		int item = 0;
		if(count>0 && count < array.length) {
			item = array[--count];
			if(count == (array.length/2 -1)) {
				newArray = new int[array.length/2];
				int i=0;
				for(Integer ar : array) {
					if(i == newArray.length)
						break;
					newArray[i++] = ar;
				}
			}
		}
		if(count>array.length -1 && count < newArray.length) {
			item = newArray[--count];
			if(count == (newArray.length/2 -1)) {	
				newArray = new int[newArray.length/2];
				int i=0;
				for(Integer ar : array) {
					if(i == newArray.length)
						break;
					newArray[i++] = ar;
				}
			}
		}
		return item;
	}

}
