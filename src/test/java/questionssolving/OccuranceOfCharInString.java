package questionssolving;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		String s ="Bapparaya";
		
		char[] a = s.toCharArray();
		System.out.println(a.length);
		
		
		Map<Character, Integer> chatcount = new HashMap<Character, Integer>();
		//int count=0;
		//for(int i=0;i<a.length;i++) {
		//for(char c:a) {
		for(int i=0;i<=a.length-1;i++) {
			//System.out.println(a);
			if(chatcount.containsKey(a[i])) {
				chatcount.put(a[i], chatcount.get(a[i])+1);
			}else {
				chatcount.put(a[i], 1);
			}
		}
		//}
	//}
System.out.println(chatcount);
	}

}
