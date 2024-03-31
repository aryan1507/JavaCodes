package oops;

public class Theater{
	int seat=200;
	static Theater t=null;
	public void bookTicket(int n) {
		if(seat==0) {
			System.out.println("Seats Unavailable");
		}
		else if(n<=seat)
		{ 
			seat-=n;
			System.out.println(n+" seats are booked");
			}
		else {
			System.out.println("Only "+seat+"are available");
			System.out.println("Please Book the seat again");
		}
			
		}
		public static Theater getInstance() {
			if(t==null) {
				t=new Theater();
				return t;
			}
			else {return t;}
		}
	
		
}
