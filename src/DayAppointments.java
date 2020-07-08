import java.util.ArrayList;

public class DayAppointments {
	ArrayList<Appointment> appointments = new ArrayList();
	int numOfAppointments;
	String weekDay;
	
	public DayAppointments(ArrayList<Appointment> apps, int num, String day) {
		appointments.addAll(apps);
		numOfAppointments = num ;
		weekDay = day ;
	}
	
	
}
