
public class StudentAdvanceTicket extends AdvanceTicket{

	public StudentAdvanceTicket(int ticketNumber, int daysInAdvance) {
		super(ticketNumber, daysInAdvance);
		if(daysInAdvance <10) {
			super.setPrice(15.0);
		}else {
			super.setPrice(20.0);
		}
	}

	public String toString() {
		return super.getNumber() + " " + super.getPrice();
	}

}