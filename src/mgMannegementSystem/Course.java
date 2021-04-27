package Event;

import java.util.Scanner;

public class Course extends Event {
	protected String time;
	public Course(Eventskind kind) {
		super(kind);
	}
	
	public void getuserinput(Scanner input){

		System.out.println("event number");
		int eventnum = input.nextInt();
		this.setEventnum(eventnum);

		System.out.println("eventdate : ");
		String eventdate = input.next();
		this.setEventdate(eventdate);
		
		System.out.print("when does the course start and end?");
		time = input.next();
		
		
		
		System.out.println("eventname : ");
		String eventname = input.next();
		this.setEventname(eventname);
		
		
		
		System.out.println("event contents : ");
		String eventcontent = input.next();
		this.setEventcontent(eventcontent);

	}
	public void printInfo() {
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
		System.out.println("Eventkind : "+ skind + "Eventnumber : "+ eventnum + " Name : " + eventname + " Date : " + eventdate + " Time : "+ time + "Content : " + eventcontent );
	}
}

