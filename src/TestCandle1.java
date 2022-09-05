
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kenne-krcutkomp CIS175 - Fall 2022
 */
public class TestCandle1 {
	String candleScent = "Pumpkin";
	char candleSize = 'M';
	double candlePrice = 12.99;
	CandleJar pumpkinCandle = new CandleJar(candleSize, candleScent, candlePrice);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String candleMessage = "Pumpkin M $12.99";
		assertEquals(candleMessage, pumpkinCandle.printCandle());
	}

	@Test
	public void testMemoNotNull() {
		assertNotNull(pumpkinCandle.printCandle());
	}

}
