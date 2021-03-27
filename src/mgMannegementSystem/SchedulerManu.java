package mgMannegementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class SchedulerManu {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		
		int num = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("Select one number between 1 - 6 : ");
			System.out.println("1. Add event");
			System.out.println("2. Delete event");
			System.out.println("3. Edit event");
			System.out.println("4. View event");
			System.out.println("5. Show a menu");
			System.out.println("6. EXIT");
			
			num = input.nextInt();
			if(num ==1) {
				
				arraylist.addAll(addEvent());	
			
			}
			else if(num ==2) {
				deleteEvent(arraylist);
				
			}
			else if(num ==3) {
				editEvent(arraylist);
			}
			else if(num ==4) {
				viewEvent(arraylist);
			}
			else {
				continue;
				
			}
		}
	}	

		public static ArrayList<String> addEvent() {
		Scanner input = new Scanner(System.in);

		System.out.println("eventdate : ");
		String eventdate = input.next();

		System.out.println("eventname : ");
		String eventname = input.next();
	
		System.out.println("event contents : ");
		String eventcontents = input.next();

		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add(eventdate);
		arraylist.add(eventname);
		arraylist.add(eventcontents);
		for (String data : arraylist) {
			System.out.print(data + " ");
		}
		System.out.println();
	
		return arraylist;		
	}
		
	 static void deleteEvent(ArrayList<String> arraylist) {
		 
		 System.out.println("delete event");
		 
		 arraylist.clear();
		 
		 System.out.println(arraylist);

	}
	 static void editEvent(ArrayList<String> arraylist) {
		 System.out.println(arraylist);
		 System.out.println("editevent :  0.eventdate, 1.eventname, 2.eventcontents");
		 Scanner input = new Scanner(System.in);	 //
		 int y = input.nextInt();
		 System.out.println("edit to : ");
		 Scanner input1 = new Scanner(System.in);
		 String z = input1.next();
		 arraylist.set(y,z);
		 System.out.println("editevent : " + arraylist);
	}
	 static void viewEvent(ArrayList<String> arraylist) {
		
			System.out.println(arraylist);
		}
		
	}
	



