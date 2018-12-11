

public class AdvanceTicket extends Ticket{

	public AdvanceTicket(int ticketNumber, int daysInAdvance) {
		super(ticketNumber);
		if(daysInAdvance > 10) {
			super.setPrice(30.0);
		}else {
			super.setPrice(40.0);
		}
	}

}