package mgMannegementSystem;


import java.util.Scanner;

public class Schedulermain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scheduler2 scheduler = new Scheduler2(input);
		
		int num = -1;
		
		while (num != 5) {
			System.out.println("1. Add event");
			System.out.println("2. Delete event");
			System.out.println("3. Edit event");
			System.out.println("4. View event");
			System.out.println("5. EXIT");
			System.out.print("Select one number between 1 - 5 : ");

			num = input.nextInt();

			if(num ==1) {
				scheduler.addEvent();
			}
			else if(num ==2) {
				scheduler.deleteEvent();

			}
			else if(num ==3) {
				scheduler.editEvent();
			}
			else if(num ==4) {
				scheduler.viewEvent();
			}
			else {
				continue;

			}
		}
	}

	
}
	