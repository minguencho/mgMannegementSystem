package Event;

import java.util.Scanner;

import Exception.DeadlineFormatException;

public abstract class Event implements EventInput{
	protected Eventskind kind = Eventskind.Assignment;
	protected int eventnum;
	protected String eventname;
	protected String eventdate;
	protected String eventcontent;
	protected String deadline;
	
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
	public String getdeadline() {
		return deadline;
	}

	public void setdeadline(String deadline) throws DeadlineFormatException {
		if(!deadline.contains("~") && !deadline.equals("")) {			
			throw new DeadlineFormatException();
		}
		this.deadline = deadline;
	}
	
	
	public Event() {
		
		
	}
	public Event(Eventskind kind) {
		this.kind  = kind;
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
	public Event(Eventskind kind,int num, String name, String date, String content) {
		this.kind = kind;
		this.eventnum = num;
		this.eventname = name;
		this.eventdate = date;
		this.eventcontent = content;
		
	}
	
	public abstract void printInfo(); 

	public void setDeadline(Scanner input) {
		String deadline = "";
		while(!deadline.contains("~")) {
			System.out.println("deadline : today ~ deadline");
			deadline = input.next();
			try {
				System.out.println("xxxxxxx");
				this.setdeadline(deadline);
			}catch(DeadlineFormatException e) {
				System.out.println("Incorrect deadline format, deadline must contain ' ~ '  ");
			}
		}
	}

	public void setEventNum(Scanner input) { //
		System.out.print("Event number");
		int eventnum = input.nextInt();
		this.setEventnum(eventnum);
	}
	
	public void setEventName(Scanner input) {
		System.out.print("Event name");
		String eventname = input.next();
		this.setEventname(eventname);
	}
	public void setEventDate(Scanner input) {
		System.out.print("Event date");
		String eventdate = input.next();
		this.setEventdate(eventdate);
	}
	public void setEventContent( Scanner input) {
		System.out.print("Event content");
		String eventcontent = input.next();
		this.setEventcontent(eventcontent);
	}
	public String getKindString() {
		String skind ="none";
		switch(this.kind) {
		case Assignment :
			skind = "assignment ";
			break;
		case Course :
			skind = "course";
			break;
		case Meeting :
			skind = "meeting";
			break; 
		default : 
		}
		return skind;
	}
	

}
