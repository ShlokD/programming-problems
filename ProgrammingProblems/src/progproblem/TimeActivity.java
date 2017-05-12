package progproblem;

public class TimeActivity {
	int start;
	int end;
	
	public TimeActivity(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public int getStart() {
		return start;
	}
	
	public int getEnd() {
		return end;
	}
	
	public String toString() {
		return ""+this.getStart()+""+this.getEnd();
	}
}
