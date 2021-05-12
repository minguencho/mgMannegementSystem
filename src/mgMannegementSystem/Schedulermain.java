package mgMannegementSystem;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Schedulermain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scheduler2 scheduler = new Scheduler2(input);

		selectMenu(input,scheduler);
	}

	public static void selectMenu(Scanner input, Scheduler2 scheduler) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1 :
					scheduler.addEvent();
					break;
				case 2 :
					scheduler.deleteEvent();
					break;
				case 3 :
					scheduler.editEvent();
					break;
				case 4 :
					scheduler.viewEvent();
					break;
				default :
					continue;	
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an Integer between 1 and 5 ");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}

		}
	}
	public static void showMenu() {
		System.out.println("1. Add event");
		System.out.println("2. Delete event");
		System.out.println("3. Edit event");
		System.out.println("4. View events");
		System.out.println("5. EXIT");
		System.out.print("Select one number between 1 - 5 : ");
	}
}
