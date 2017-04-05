package progproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemSetsTest {

	@Test
	public void echoTest() {
		ProblemSets pSets = new ProblemSets();
		assertEquals(10, pSets.echo(10));
	}

}
