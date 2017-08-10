import java.util.*;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}


public class InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		Collections.sort(intervals,new MyComparator());
		List<Interval> ans = new ArrayList<Interval>();
		if(intervals.size() == 0){
			ans.add(newInterval);
			return ans;
		}
	
		return ans;
	}
	
	class MyComparator implements Comparator<Interval>{
		@Override
		public int compare(Interval i1,Interval i2){
			return i1.start - i2.start;
		}
		
	}
}
