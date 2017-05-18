package progproblem;

import java.util.Stack;

public class SolutionClasses {

}

class QueueUsingTwoStacks {
	Stack<Integer> stack1;
	Stack<Integer> stack2;
	
	public QueueUsingTwoStacks() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	public void enQueue(int num) {
		stack1.push(num);
	}
	
	public int deQueue() {
		if(stack1.isEmpty() && stack2.isEmpty()) {
			throw new Error("Dequeuing empty queue");
		}
		
		while(!stack1.isEmpty()) {
			Integer top = stack1.pop();
			stack2.push(top);
		}
		return stack2.pop();
	}
}