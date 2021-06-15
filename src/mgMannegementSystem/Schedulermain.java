package mgMannegementSystem;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.WindowFrame;
import log.EventLogger;

public class Schedulermain {
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scheduler2 scheduler = getObject("eventmanager.ser");
		if(scheduler == null) {
			scheduler = new Scheduler2(input);
		}
		WindowFrame frame = new WindowFrame(scheduler);
		selectMenu(input,scheduler);
		putObject(scheduler,"eventmanager.ser");
	}

	public static void selectMenu(Scanner input, Scheduler2 scheduler) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1 :
					scheduler.addEvent(input);
					logger.log("add a event");
					break;
				case 2 :
					scheduler.deleteEvent();
					logger.log("delete a event");
					break;
				case 3 :
					scheduler.editEvent();
					logger.log("edit a event list");
					break;
				case 4 :
					scheduler.viewEvent();
					logger.log("view a event");
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
	public static Scheduler2 getObject(String filename) {
		Scheduler2 scheduler = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			
			ObjectInputStream in = new ObjectInputStream(file);
			
			scheduler = (Scheduler2) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return scheduler;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scheduler;
	}
	
	public static void putObject(Scheduler2 scheduler, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(scheduler);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


