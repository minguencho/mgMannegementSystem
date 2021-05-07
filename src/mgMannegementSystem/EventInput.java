package Event;

import java.util.Scanner;

public interface EventInput {
	public int getEventnum();
	
	public void setEventnum(int eventnum);
	
	public void setEventname(String eventname);
	
	public void setEventdate(String eventdate);
	
	public void setEventcontent(String eventcontent);
	
	public void printInfo();
	
	public void getuserinput(Scanner input);
	
}
