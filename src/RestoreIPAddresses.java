import java.util.*;

public class RestoreIPAddresses {
	public List<String> restoreIpAddresses(String s) {
		List<String> list = new ArrayList<String>();
		dps(1, new String(), list, s);
		return list;
	}

	public void dps(int n, String ans, List<String> list, String s) {
		if(n <= 4){
			if(s.length() >= 1 &&  s.charAt(0) == '0' ){
				String tans = ans + "0.";
				dps(n+1 , tans , list , s.substring(1));
			}else{
				for (int i = 1; i <= 3; i++) {
					if (s.length() >= i) {
						int temp = Integer.valueOf(s.substring(0, i));
						if (temp < 256 && temp != 0) {
							String tans = ans + temp + ".";
							dps(n + 1, tans, list, s.substring(i));
						}
					}
				}
			}
		}else{
			if(s.length() == 0){
				list.add(ans.substring(0,ans.length()-1));
			}
		}
	}
}
