package questionssolving;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElementUsingHash {

	public static void main(String[] args) {
		int arr[] = {1,2,4,3,3,1,2};
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
System.out.println(map);
	}

}
