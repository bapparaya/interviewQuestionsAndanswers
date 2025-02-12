package questionssolving;

import java.util.HashMap;
import java.util.Map;

public class Occuranceofelementsinarray3 {

	public static void main(String[] args) {
		int[] a = {1,1,1,2,2,2,2,5,6,6,6,6,6,8,8,8,};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int b:a) {
			if(map.containsKey(b)) {
				map.put(b, map.get(b)+1);
			}else {
				map.put(b, 1);
			}
		}
		
		System.out.println(map);

	}

}
