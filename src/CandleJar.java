
/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
public class CandleJar {
	private char size;
	private String scent;
	private double price;

	/**
	 * 
	 */
	public CandleJar() {
	}
	public CandleJar(char size, String scent, double price) {
		setSize(size);
		setScent(scent);
		setPrice(price);
	}
	/**
	 * @return the size
	 */
	public char getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 * checks that the size input is one of three options
	 * else makes the size E for error so that the object still
	 * gets made.
	 */
	public void setSize(char size) {
		if(size == 'M' || size == 'L' || size == 's') {
			this.size = size;
		}else {
			this.size = 'E';
		}
		
		
	}
	/**
	 * @return the scent
	 */
	public String getScent() {
		return scent;
	}
	/**
	 * @param scent the scent to set
	 */
	public void setScent(String scent) {
		this.scent = scent;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return formatted string
	 */
	public String printCandle() {
		return getScent() + " " + getSize() + " $" + getPrice();
	}

}
