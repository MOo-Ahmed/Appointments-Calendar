
public class Time {
	int hour;
	int minute;
	String daynight;
	
	public Time(int h, int m, String day) {
		this.hour = h ;
		this.minute = m ;
		this.daynight = day ;
	}
	
	@Override
	public String toString() {
		return hour + ":" + minute + " " + daynight;
	}

	public boolean isGreater(Time t) {
		// if I'm greater, return true
		if(t.daynight.compareTo(daynight) < 0 ) {
			return true ;
		}
		else if(t.hour < hour && t.daynight.compareTo(daynight) == 0) {
			return true ;
		}
		else if(t.minute < minute && t.hour == hour && t.daynight.compareTo(daynight) == 0) {
			return true;
		}
		return false ;
	}

	public boolean isEqual(Time t) {
		if(hour == t.hour && t.minute == minute && daynight.matches(t.daynight)) {
			return true;
		}
		return false;
	}
	
	public boolean isLess(Time t) {
		return !isEqual(t) && !isGreater(t);
	}
	
	public Time getCopy() {
		return new Time(hour, minute, daynight);
	}
}
