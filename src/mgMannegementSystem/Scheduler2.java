package mgMannegementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Scheduler2 {
	ArrayList<Event> event = new ArrayList<Event>();
	Scanner input;
	
	Scheduler2(Scanner input){
		this.input = input;
		
	}
	public void addEvent() {
		Event events = new Event();
		
		System.out.println("event number");
		events.eventnum = input.nextInt();

		System.out.println("eventdate : ");
		events.eventdate = input.next();

		System.out.println("eventname : ");
		events.eventname = input.next();
	
		System.out.println("event contents : ");
		events.eventcontent = input.next();
		
		event.add(events);

	}
	
	public void deleteEvent() {
		System.out.print("Event Number : ");
		int eventnum = input.nextInt();
		int index = -1;
		for (int i =0; i<event.size();i++) {
			if (event.get(i).eventnum == eventnum) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			event.remove(index);
			Event.numEventsregistered--;
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
			if(events.eventnum == eventnum) {
				int num = -1;
				System.out.print("EDIT : 1.Event date 2.Event name 3. Event content ");
				while (num < 4) {
				
					num = input.nextInt();
				
					if(num ==1) {
						
						System.out.print("Event date");
						events.eventdate = input.next();
					
					}
					else if(num ==2) {
						System.out.print("Event name");
						events.eventname = input.next();
						
					}
					else if(num ==3) {
						System.out.print("Event content");
						events.eventcontent = input.next();
						
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
		System.out.println("registered events : " + Event.numEventsregistered + " ");
		for (int i=0; i < event.size(); i++){
			event.get(i).printInfo();
		}
	}

}
