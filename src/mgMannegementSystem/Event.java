package Event;

import java.util.Scanner;

public class Event {
	protected Eventskind kind = Eventskind.Assignment;
	protected int eventnum;
	protected String eventname;
	protected String eventdate;
	protected String eventcontent;
	
	public Eventskind getKind() {
		return kind;
	}

	public void setKind(Eventskind kind) {
		this.kind = kind;
	}

	public int getEventnum() {
		return eventnum;
	}

	public void setEventnum(int eventnum) {
		this.eventnum = eventnum;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getEventdate() {
		return eventdate;
	}

	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}

	public String getEventcontent() {
		return eventcontent;
	}

	public void setEventcontent(String eventcontent) {
		this.eventcontent = eventcontent;
	}
	
	
	public Event() {
		
		
	}
	
	public Event(int num, String date) {
		this.eventnum = num;
		this.eventdate = date;
		
	}
	public Event(int num, String name, String date, String content) {
		this.eventnum = num;
		this.eventname = name;
		this.eventdate = date;
		this.eventcontent = content;
		
	}
	public void printInfo() {
		System.out.println("Eventnumber : "+ eventnum + " Name : " + eventname + " Date : " + eventdate + " Content : " + eventcontent );
	}
	
	public void getuserinput(Scanner input){
		
		System.out.println("event number");
		int eventnum = input.nextInt();
		this.setEventnum(eventnum);
		
		System.out.println("eventdate : ");
		String eventdate = input.next();
		this.setEventdate(eventdate);
		
		System.out.println("eventname : ");
		String eventname = input.next();
		this.setEventname(eventname);
		
		System.out.println("event contents : ");
		String eventcontent = input.next();
		this.setEventcontent(eventcontent);
		
	}

}
