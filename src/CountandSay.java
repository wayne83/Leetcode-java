public class CountandSay {
	public String countAndSay(int n) {
		String s = "1",str = "1";
		int num = 0,len ;
		char c;
        for(int i=1;i<n;i++){
        	num = 1;
        	c=s.charAt(0);
        	str = "";
        	len = s.length();
        	for(int j=1;j<len;j++){
        		if(s.charAt(j) == c){
        			num++;
        		}else{
        			str = str + num + c;
        			num = 1;
        		}
        		c = s.charAt(j);
        	}
        	str = str + num + c;
        	s = str;
        }
        return str;
    }
}
