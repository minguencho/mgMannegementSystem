package Event;

import java.util.Scanner;

public class Meeting extends Event implements EventInput{
	protected String place;

	public Meeting(Eventskind kind) {
 		super(kind);
	}

	public void getuserinput(Scanner input){

		setEventNum(input);
		
		System.out.println("where do you meet?");
		place = input.next();

		setEventDate(input);
			
		setEventName(input);
		
		setEventContent(input);

	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Eventkind : "+ skind + "Eventnumber : "+ eventnum + " Name : " + eventname + " Date : " + eventdate + " Content : " + eventcontent + " meeting place : "+ place );
	}
}
