
public class IntegertoRoman {
	public String intToRoman(int num) {
        int[] a = {1,4,5,9,10,40,50,90,100,400,500,900,1000 };
        String[] b = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int ans = 0 , i = 12;
        String s="";
        while(i>=0 && num!=0 ){
        	if(num >= a[i]){
        		ans = a[i]+ans;
        		num = num - a[i];
        		s = s+b[i];
        	}else{
        		i--;
        	}
        }
        return s;
    }
}
