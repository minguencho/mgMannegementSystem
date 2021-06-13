package Event;

import java.util.Scanner;

import Exception.DeadlineFormatException;

public interface EventInput {
	
	public void getuserinput(Scanner input);
	
	public int getEventnum();
	
	public void setEventnum(int eventnum);
	
	public void setEventname(String eventname);
	
	public String getEventname();
	
	public void setEventdate(String eventdate);
	
	public String getEventdate();
	
	public void setEventcontent(String eventcontent);
	
	public String getEventcontent();
	
	public void printInfo();
	

	
	public void setEventNum(Scanner input);
	
	public void setEventDate(Scanner input);
	
	public void setEventName(Scanner input);

	public void setEventContent(Scanner input);
	
	public void setdeadline(String deadline) throws DeadlineFormatException;
	
	public String getdeadline();
}
