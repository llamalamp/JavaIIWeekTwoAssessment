import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
public class TestCandle2 {
	String candleScent = "Apple";
	char candleSize = 'K';
	double candlePrice = 13.99;
	CandleJar appleCandle = new CandleJar(candleSize, candleScent, candlePrice);
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String candleMessage = "Apple E $13.99";
		assertEquals(candleMessage, appleCandle.printCandle());
	}

}
