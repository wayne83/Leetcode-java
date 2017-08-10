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

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals.size()<=1)
			return intervals;
		Collections.sort(intervals,new MyComparator());
		List<Interval> ans = new ArrayList<Interval>();
		int start = intervals.get(0).start ,end = intervals.get(0).end;
		for(int i=1;i<intervals.size();i++){
			int bstart = intervals.get(i).start, bend = intervals.get(i).end;
			if( bstart <= end ){
    			end = Math.max(end,bend);
    		}else{
    			ans.add(new Interval(start,end));
    			start = bstart;
    			end = bend;
    		}		
        }
		ans.add(new Interval(start,end));
        return ans;
    }
	
	class MyComparator implements Comparator<Interval>{
		@Override
		public int compare(Interval i1,Interval i2){
			return i1.start - i2.start;
		}
	}
}
