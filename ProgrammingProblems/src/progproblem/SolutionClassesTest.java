package progproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionClassesTest {

	@Test
	public void queueUsingTwoStacks() {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		assertEquals(1, queue.deQueue());
		assertEquals(2, queue.deQueue());
		assertEquals(3, queue.deQueue());		
	}

}
