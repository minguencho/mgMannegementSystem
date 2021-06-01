package mgMannegementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Event.Assignment;
import Event.Course;
import Event.Event;
import Event.EventInput;
import Event.Eventskind;
import Event.Meeting;

public class Scheduler2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5816230158685592568L;
	
	ArrayList<EventInput> events = new ArrayList<EventInput>();
	transient Scanner input;

	Scheduler2(Scanner input){
		this.input = input;
	}
	public void addEvent() {
		int kind = 0;
		EventInput eventsInput;
		while(kind < 1 || kind > 3) {
			try {
				System.out.println("Select Event kind : ");
				System.out.println("1 for Assignment ");
				System.out.println("2 for Course ");
				System.out.println("3 for Meeting ");
				System.out.println("Select num 1,2 or 3 for Event kind : ");
				kind = input.nextInt();
				if (kind == 1) {
					eventsInput = new Assignment(Eventskind.Assignment);
					eventsInput.getuserinput(input);
					events.add(eventsInput);
					break;
				}
				else if (kind == 2) {
					eventsInput = new Course(Eventskind.Course);
					eventsInput.getuserinput(input);
					events.add(eventsInput);
					break;

				}
				else if (kind == 3) {
					eventsInput = new Meeting(Eventskind.Meeting);
					eventsInput.getuserinput(input);
					events.add(eventsInput);
					break;

				}

				else {
					System.out.println("Select num 1,2 or 3 for Event kind : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an Integer between 1 and 3 ");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}	
		}
	}


	
	public void deleteEvent() {
		System.out.print("Event Number : ");
		int eventnum = input.nextInt();
		int index = findIndex(eventnum);
		removefromStudents(index , eventnum);	
	}
	
	public int findIndex(int eventnum) {
		int index = -1;
		for (int i =0; i<events.size();i++) {
			if (events.get(i).getEventnum() == eventnum) {
				index = i;
				break;
			}
		} 
		return index;
	}
	
	public int removefromStudents(int index ,int eventnum) {
		if(index >= 0) {
			events.remove(index);
			System.out.println("event "+eventnum+" is deleted");
			return 1;
		}
		else {
			System.out.println("event has not been registered");
			return -1;
		}
	}
	
	public void editEvent() {
		System.out.print("Event Number : ");
		int eventnum = input.nextInt();
		for (int i = 0; i<events.size();i++) {
			EventInput event = events.get(i);
			if(event.getEventnum() == eventnum) {
				int num = -1;
				System.out.print("EDIT : 1.Event date 2.Event name 3. Event content ");
				
				while (num < 4) {
				
					num = input.nextInt();
					switch(num) {
					case 1:
						event.setEventDate(input);
						break;
					case 2:
						event.setEventName(input);
						break;
					case 3:
						event.setEventContent(input);
						break;
					default:
						continue;
					}
				break;
				}
			}
		}
	}
		
	public void viewEvent() {
		for (int i=0; i < events.size(); i++){
			events.get(i).printInfo();
		}
	}
	public int size() {
		return events.size();
	}
	public EventInput get(int index) {
		return (Event) events.get(index);
	}
	public void setScanner(Scanner input2) {
		this.input = input2;
		
	}
	
}
