package mgMannegementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import Event.Assignment;
import Event.Course;
import Event.Event;

public class Scheduler2 {
	ArrayList<Event> event = new ArrayList<Event>();
	Scanner input;
	
	Scheduler2(Scanner input){
		this.input = input;
		
	}
	public void addEvent() {
		int kind = 0;
		
		Event events;
		
		while(kind != 1 && kind != 2) {
		System.out.println("Select Event kind : ");
		System.out.println("1 for Assignment ");
		System.out.println("2 for Course ");
		System.out.println("Select num for Event kind between 1 and 2 : ");
		kind = input.nextInt();
		if (kind == 1) {
			events = new Assignment();
			events.getuserinput(input);
			event.add(events);
			break;
		}
		else if (kind == 2) {
			events = new Course();
			events.getuserinput(input);
			event.add(events);
			break;
		}
		else {
			System.out.println("Select num for Event kind between 1 and 2: ");
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
			Event events = event.get(i);
			if(events.getEventnum() == eventnum) {
				int num = -1;
				System.out.print("EDIT : 1.Event date 2.Event name 3. Event content ");
				while (num < 4) {
				
					num = input.nextInt();
				
					if(num ==1) {
						
						System.out.print("Event date");
						String eventdate = input.next();
						events.setEventdate(eventdate);
					}
					else if(num ==2) {
						System.out.print("Event name");
						String eventname = input.next();
						events.setEventname(eventname);
					}
					else if(num ==3) {
						System.out.print("Event content");
						String eventcontent = input.next();
						events.setEventcontent(eventcontent);
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
