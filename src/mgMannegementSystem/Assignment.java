package Event;

import java.util.Scanner;

public class Assignment extends Event  implements EventInput {
	
	public Assignment(Eventskind kind) {
		super(kind);
	}
	
	public void getuserinput(Scanner input){

		System.out.println("event number");
		int eventnum = input.nextInt();
		this.setEventnum(eventnum);

		char answer = 'x';
		String deadline;
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' ) {
			System.out.print("the assignment has deadline? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("deadline : today ~ deadline");
				deadline = input.next();
				this.setEventdate(deadline);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				System.out.println("eventdate (assignment): ");
				String eventdate = input.next();
				this.setEventdate(eventdate);
				break;
			}
			else {
				
			}
		}
		
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
		System.out.println("Eventkind : "+ skind + "Eventnumber : "+ eventnum + " Name : " + eventname + " Date : " + eventdate  + " Content : " + eventcontent );
	}
}
