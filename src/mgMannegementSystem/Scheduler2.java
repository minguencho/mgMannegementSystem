package mgMannegementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import Event.Assignment;
import Event.Course;
import Event.Event;
import Event.EventInput;
import Event.Eventskind;
import Event.Meeting;

public class Scheduler2 {
	ArrayList<EventInput> event = new ArrayList<EventInput>();
	Scanner input;
	
	Scheduler2(Scanner input){
		this.input = input;
		
	}
	public void addEvent() {
		int kind = 0;
		
		EventInput eventsInput;
		
		while(kind != 1 && kind != 2) {
		System.out.println("Select Event kind : ");
		System.out.println("1 for Assignment ");
		System.out.println("2 for Course ");
		System.out.println("3 for Meeting ");
		System.out.println("Select num 1,2 or 3 for Event kind : ");
		kind = input.nextInt();
		if (kind == 1) {
			eventsInput = new Assignment(Eventskind.Assignment);
			eventsInput.getuserinput(input);
			event.add(eventsInput);
			break;
		}
		else if (kind == 2) {
			eventsInput = new Course(Eventskind.Course);
			eventsInput.getuserinput(input);
			event.add(eventsInput);
			break;
		
		}
		else if (kind == 3) {
			eventsInput = new Meeting(Eventskind.Meeting);
			eventsInput.getuserinput(input);
			event.add(eventsInput);
			break;
		
		}
		
		else {
			System.out.println("Select num 1,2 or 3 for Event kind : ");
			}
		}
	
	}
	
	public void deleteEvent() {
		System.out.print("Event Number : ");
		int eventnum = input.nextInt();
		int index = -1;
		for (int i =0; i<event.size();i++) {
			if (event.get(i).getEventnum() == eventnum) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			event.remove(index);
			
			System.out.println("event "+eventnum+" is deleted");
		}
		else {
			System.out.println("event has not been registered");
			return;
		}
	}
	
	public void editEvent() {
		System.out.print("Event Number : ");
		int eventnum = input.nextInt();
		for (int i = 0; i<event.size();i++) {
			EventInput eventsInput = event.get(i);
			if(eventsInput.getEventnum() == eventnum) {
				int num = -1;
				System.out.print("EDIT : 1.Event date 2.Event name 3. Event content ");
				
				while (num < 4) {
				
					num = input.nextInt();
				
					if(num ==1) {
						
						System.out.print("Event date");
						String eventdate = input.next();
						eventsInput.setEventdate(eventdate);
					}
					else if(num ==2) {
						System.out.print("Event name");
						String eventname = input.next();
						eventsInput.setEventname(eventname);
					}
					else if(num ==3) {
						System.out.print("Event content");
						String eventcontent = input.next();
						eventsInput.setEventcontent(eventcontent);
					}	
					else if(num >=4 ) {
						break;
						
					}
			
				}
				break;
			}
			
		}
	}
	public void viewEvent() {
		for (int i=0; i < event.size(); i++){
			event.get(i).printInfo();
		}
	}

}
