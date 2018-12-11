


public class TicketMain {

	public static void main(String[] args) {

		Ticket[] tickets = new Ticket[3];
		tickets[0] = new AdvanceTicket(28, 21);
		tickets[1] = new StudentAdvanceTicket(51, 11);
		tickets[2] = new WalkupTicket(55);
		
		
		for(int i = 0; i < tickets.length; i++){
			
			System.out.println(tickets[i].toString());
		}
	}

}


