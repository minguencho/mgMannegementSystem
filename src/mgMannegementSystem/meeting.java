package Event;

import java.util.Scanner;

public class Meeting extends Event implements EventInput {
	protected String place;

	public Meeting(Eventskind kind) {
 		super(kind);
	}

	public void getuserinput(Scanner input){

		System.out.println("event number");
		int eventnum = input.nextInt();
		this.setEventnum(eventnum);
		
		
		

		System.out.println("where do you meet?");
		place = input.next();

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
		System.out.println("Eventkind : "+ skind + "Eventnumber : "+ eventnum + " Name : " + eventname + " Date : " + eventdate + " Content : " + eventcontent + " meeting place : "+ place );
	}
}
