package oops;

public class TheaterDriver {

	public static void main(String[] args) {
		Theater t1=Theater.getInstance();
		t1.bookTicket(10);
		System.out.println(t1.seat);
		Theater t2=Theater.getInstance();
		t2.bookTicket(80);
		System.out.println(t2.seat);
		Theater t3=Theater.getInstance();
		t3.bookTicket(90);
		System.out.println(t2.seat);
		t3.bookTicket(20);
		Theater t4=Theater.getInstance();
		t4.bookTicket(10);
		

	}

}
