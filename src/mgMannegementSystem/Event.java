package mgMannegementSystem;

public class Event {
	int eventnum;
	String eventname;
	String eventdate;
	String eventcontent;
	
	static int numEventsregistered = 0;
	
	
	public Event() {
		numEventsregistered++;
		
	}
	
	public Event(int num, String date) {
		this.eventnum = num;
		this.eventdate = date;
		numEventsregistered++;
	}
	public Event(int num, String name, String date, String content) {
		this.eventnum = num;
		this.eventname = name;
		this.eventdate = date;
		this.eventcontent = content;
		numEventsregistered++;
	}
	public void printInfo() {
		System.out.println("Eventnumber : "+ eventnum + " Name : " + eventname + " Date : " + eventdate + " Content : " + eventcontent );
	}
	

}
