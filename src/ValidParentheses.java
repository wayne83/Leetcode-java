
public class ValidParentheses {
	public int tonum(char a){
		if(a == '('  )
			return 1;
		else if(a == ')')
			return 2;
		else if( a == '[' )
			return 3;
		else if( a == ']' )
			return 4;
		else if( a == '{' )
			return 5;
		else
			return 6;
	}
	public boolean isValid(String s) {
		int len = s.length();
        char[] stack = new char[len+1];
        int top = 0 ;
        for(int i=0;i<len;i++){
        	if(tonum( s.charAt(i) ) - tonum( stack[top] ) == 1){
        		top--;
        	}else{
        		top++;
        		stack[top] = s.charAt(i);
        	}
        }
        if( top != 0)
        	return false;
        else
        	return true;
    }
}
