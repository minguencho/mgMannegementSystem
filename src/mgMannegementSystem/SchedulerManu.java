package mgMannegementSystem;

import java.util.Scanner;

public class SchedulerManu {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add event");
			System.out.println("2. Delete event");
			System.out.println("3. Edit event");
			System.out.println("4. View event");
			System.out.println("5. Show a menu");
			System.out.println("6. EXIT");
			System.out.println("Select one number between 1 - 6 : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("event date");
				int eventdate = input.nextInt();
				System.out.println("event name");
				String eventname = input.next();
				System.out.println("event content");
				String eventcontent = input.next();
				break;
			
				
			}
		}
	}
}
	
