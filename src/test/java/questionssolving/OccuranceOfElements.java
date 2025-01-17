package questionssolving;

import java.util.HashSet;
import java.util.Set;

public class OccuranceOfElements {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,4,5,3,3,1};
		
		//System.out.println(array[6]);
		Set unique = new HashSet();
		Set duplicate = new HashSet();
		Set twoduplicate = new HashSet();
		
		/*
		 for(int i=0;i<array.length;i++) {
			//System.out.println(array[i]);
			if(unique.add(array[i])) {
				
			}else if (duplicate.add(array[i])) {
				
			}else {
				twoduplicate.add(array[i]);
			}
		}
	
	System.out.println(unique);
	System.out.println(duplicate);
	System.out.println(twoduplicate);
	*/
		int count =0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					System.out.println(array[i] + " is repetead");
				}
			}
		}
		
	
	
	
	}

}
