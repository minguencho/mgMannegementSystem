package Event;

import java.util.Scanner;

public class Course extends Event implements EventInput{
	protected String time;
	public Course(Eventskind kind) {
		super(kind);
	}
	
	public void getuserinput(Scanner input){

		setEventNum(input);

		setEventDate(input);
		
		System.out.print("when does the course start and end?");
		time = input.next();

		setEventName(input);		

		setEventContent(input);

	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Eventkind : "+ skind + "Eventnumber : "+ eventnum + " Name : " + eventname + " Date : " + eventdate + " Time : "+ time + "Content : " + eventcontent );
	}
}

