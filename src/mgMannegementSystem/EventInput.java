package Event;

import java.util.Scanner;

import Exception.DeadlineFormatException;

public interface EventInput {
	public int getEventnum();
	
	public void setEventnum(int eventnum);
	
	public void setEventname(String eventname);
	
	public void setEventdate(String eventdate);
	
	public void setEventcontent(String eventcontent);
	
	public void printInfo();
	
	public void getuserinput(Scanner input);
	
	public void setEventNum(Scanner input);
	
	public void setEventDate(Scanner input);
	
	public void setEventName(Scanner input);

	public void setEventContent(Scanner input);
	
	public void setdeadline(String deadline) throws DeadlineFormatException;
	
}
