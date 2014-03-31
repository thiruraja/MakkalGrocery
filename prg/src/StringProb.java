
import java.lang.*;

public class StringProb {

	public static String removeDuplicateChar(String s)
	{
		if(s.length()==1||s.length()==0)
			return s;
		
		StringBuilder str=new StringBuilder();
		
		for(int i=0;i<s.length();i++){
			if(str.length()==0)
				str.append(s.charAt(i));
			else if(str.charAt(str.length()-1)!=s.charAt(i))
				str.append(s.charAt(i));
			else if(str.charAt(str.length()-1)==s.charAt(i))
				str.deleteCharAt(str.length()-1);
		}
		
		return str.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(StringProb.removeDuplicateChar(""));
	}
}
