package Event;

import java.util.Scanner;

public class Assignment extends Event implements EventInput{
	
	public Assignment(Eventskind kind) {
		super(kind);
	}

	public void getuserinput(Scanner input){
		setEventNum(input);
		setEventName(input);
		setEventContent(input);
		setDeadLine(input);		
	}
	public void setDeadLine(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' ) {
			System.out.print("the assignment has deadline? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setEventDate(input);
				setDeadline(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				setEventDate(input);
				
				break;
			}
			else {
				
			}
		}
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Eventkind : "+ skind + "Eventnumber : "+ eventnum + " Name : " + eventname +"Date : " + eventdate + " Deadline : "+ deadline + " Content : " + eventcontent );
	}
}
