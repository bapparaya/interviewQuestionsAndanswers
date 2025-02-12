package questionssolving;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmappractice {

	public static void main(String[] args) {
		/*HashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(100, "bappa");
		map.put(101, "muthu");
		map.put(103, "shanthamma");
		map.put(104, "ramji");
		map.put(null, "xyz");
		map.put(null, "pqr");
		map.put(105, null);
		map.put(105, null);
		map.put(106, null);
		
		System.out.println(map);
		System.out.println(map.get(104));
		System.out.println(map.entrySet());
		System.out.println(map.containsKey(105));
		System.out.println(map.put(101, "raj"));
		System.out.println(map);
		*/
		
		//find the number of occurance of elements in array
		
		/*int[] a = new int[6];
		
		a[0]=1;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		a[5]=5;
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=1;i<a.length;i++) {
			if(map.containsValue(a[i])) 
			{
				map.put(map.get(a[i])+1, a[i]);
			}
			else {
				map.put(i, a[i]);
			}
		}
		
		System.out.println(map);*/
		
	
	/*String[] a = {"bappa","bappa","muthu","shanth","ram"};
	Map<String,Integer> map = new HashMap<String, Integer>();
	for(String s:a) {
		if(map.containsKey(s)) {
			map.put(s, map.get(s)+1);
		}else {
			
		map.put(s, 1);
		}
		
	
	}
	
	System.out.println(map);
	
	}*/
		
/*int[] a = new int[6];
		
		a[0]=1;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		a[5]=5;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int b:a) {
			if(map.containsKey(b)) {
				map.put(b, map.get(b)+1);
			}else {
				map.put(b, 1);
				
			}
		
		}
		System.out.println(map);*/
		
		/*String s="bapparaya";
		
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
	}else {
		map.put(c, 1);
	}
		}
		System.out.println(map);*/
		
		
		
}
}
