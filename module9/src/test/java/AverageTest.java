import static org.junit.Assert.*;

//import org.junit.Before;
//import org.junit.Test;
import org.junit.*;

public class AverageTest {

	// test fixture
	private int[] numList;
	int offset;

	@Before
	public void setup() {
		int[] numList = { 1, 2 };
		int offset = 1;
	}

	@After
	public void tearDown() {
		// int [] numList = null;
		// int offset = null;
	}

	// Suite 1
	/*****************************************************************/
	@Test
	public void testNegativeKNonEmptyList() {

		Average avg = new Average();
		int[] list = { 1, 2, 3 };
		int k = -1;

		// int value = avg.average(k, list);
		// assertEquals(value, 3);

		assertEquals(avg.average(k, list), 0);
	}

	@Test
	public void testZeroKNonEmptyList() {

		Average avg = new Average();
		int[] list = { 1, 2, 3 };
		int k = 0;
		assertEquals(avg.average(k, list), 0);
	}

	@Test
	public void testOneKNonEmptyList() {

		Average avg = new Average();
		int[] list = { 1, 2, 3 };
		int k = 1;
		assertEquals(avg.average(k, list), 1);
	}

	@Test
	public void testTwentyKNonEmptyList() {

		Average avg = new Average();
		int[] list = { 1, 2, 3 };
		int k = 20;
		assertEquals(avg.average(k, list), 2);
	}

	
	// Suite 2
	/*****************************************************************/
	@Test
	public void testNegativeKEmptyList() {

		Average avg = new Average();
		int[] list = {};
		int k = -1;

		// int value = avg.average(k, list);
		// assertEquals(value, 3);

		assertEquals(avg.average(k, list), 0);
	}

	@Test
	public void testZeroKEmptyList() {

		Average avg = new Average();
		int[] list = {};
		int k = 0;
		assertEquals(avg.average(k, list), 0);
	}

	@Test
	public void testOneKEmptyList() {

		Average avg = new Average();
		int[] list = {};
		int k = 1;
		assertEquals(avg.average(k, list), 0);
	}

	@Test
	public void testTwentyKEmptyList() {

		Average avg = new Average();
		int[] list = {};
		int k = 20;
		assertEquals(avg.average(k, list), 0);
	}

	// Suite 3
	/*****************************************************************/
	@Test
	public void testNegativeKOneElementList() {

		Average avg = new Average();
		int[] list = {3};
		int k = -1;

		// int value = avg.average(k, list);
		// assertEquals(value, 3);

		assertEquals(avg.average(k, list), 0);
	}

	@Test
	public void testZeroKOneElementList() {

		Average avg = new Average();
		int[] list = {3};
		int k = 0;
		assertEquals(avg.average(k, list), 0);
	}

	@Test
	public void testOneKOneElementList() {

		Average avg = new Average();
		int[] list = {3};
		int k = 1;
		assertEquals(avg.average(k, list), 3);
	}

	@Test
	public void testTwentyKOneElementList() {

		Average avg = new Average();
		int[] list = {3};
		int k = 20;
		assertEquals(avg.average(k, list), 3);
	}
}
