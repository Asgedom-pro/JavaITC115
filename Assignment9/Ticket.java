
public abstract class Ticket {

	private int number;
	private double price;
	
	public Ticket(int ticketNumber) {
		this.number = ticketNumber;
	}
		
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return  number + " " + price;
	}
	
}