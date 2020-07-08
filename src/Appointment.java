
public class Appointment {
	Time start, end;
	
	public Appointment(Time s, Time e) {
		start = s.getCopy();
		end = e.getCopy();
	}
	
	public boolean isGreater(Appointment a) {
		// if I'm after a, then I begin after its end
		return start.isGreater(a.end) || start.isEqual(a.end);
	}

	public boolean isConcurrent(Appointment a) {
		// This function decides if I have same start with a, or I have a start before the end of a
		return a.start.isEqual(start) || a.end.isLess(start);
	}
	
	public boolean isBefore(Appointment a) {
		return !isGreater(a) && !isConcurrent(a);
	}



}
