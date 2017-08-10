import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		num1 = reverge(num1);
		num2 = reverge(num2);
		String ans = "", shu1, shu2;
		int len1 = num1.length(), len2 = num2.length(), l1, l2;
		if (len1 > len2) {
			shu1 = num1;
			shu2 = num2;
			l1 = len1;
			l2 = len2;
		} else {
			shu1 = num2;
			shu2 = num1;
			l1 = len2;
			l2 = len1;
		}
		List<String> list = new ArrayList<String>();
		int n, m, gw = 0, sw = 0, js;
		for (int i = 0; i < l2; i++) {
			n = shu2.charAt(i) - '0';
			ans = "";
			gw = 0;
			sw = 0;
			for (int j = 0; j < l1; j++) {
				m = shu1.charAt(j) - '0';
				gw = (n * m) % 10;
				js = gw + sw;
				sw = (n * m) / 10;
				//System.out.println("js:" + js );
				if (js >= 10) {
				    sw = sw + js/10;
					js = js % 10;
					//System.out.println("sw:" + sw);
				}
				ans = ans + js;
				//System.out.println(js);
			}
			if(sw != 0 )ans = ans + sw;
			for (int k = 0; k < i; k++) {
				ans = '0' + ans;
			}
			list.add(ans);
		}
	
		if (!list.isEmpty()) {
			shu1 = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				shu2 = list.get(i);
				len2 = shu2.length();
				len1 = shu1.length();
				gw = sw = 0;
				ans = "";
				for(int j=0;j<len2;j++){
					if(j < len1){
						n = shu1.charAt(j) - '0';
					}else{
						n = 0;
					}
					m = shu2.charAt(j) - '0';
					gw = (m+n) %10 + sw;
					js = gw ;
					sw = (m+n) /10;
					if(js >= 10){
					    sw = js/10 + sw;
						js = js %10;
					}
					ans+= js;
				}
				if(sw != 0) ans = ans + sw;
				shu1 = ans;
				//System.out.println("and: " + shu1);
			}
		}else{
			ans = "";
		}
		ans =  reverge(ans);
		if(ans.charAt(0) == '0'){
		    return "0";
		}else
		    return ans;
	}

	public String reverge(String str) {
		int len = str.length();
		String s = "";
		for (int i = len-1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}
}
