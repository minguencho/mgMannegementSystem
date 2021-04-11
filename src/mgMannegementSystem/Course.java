package Event;

import java.util.Scanner;

public class Course extends Event {
	public void getuserinput(Scanner input){

		System.out.println("event number");
		int eventnum = input.nextInt();
		this.setEventnum(eventnum);
		
		
		String time;

		System.out.print("when does the course start and end?");
		time = input.next();

		System.out.println("eventdate : ");
		String eventdate = input.next();
		this.setEventdate(eventdate +" ["+ time + "] " );
		
		
		
		System.out.println("eventname : ");
		String eventname = input.next();
		this.setEventname(eventname);
		
		
		
		System.out.println("event contents : ");
		String eventcontent = input.next();
		this.setEventcontent(eventcontent);

	}
}
