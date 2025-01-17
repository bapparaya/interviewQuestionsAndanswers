package questionssolving;

import java.util.Arrays;

public class OccuranceOfElements2 {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,3,2,2};
		Arrays.sort(array1);
		System.out.println(array1);
		int count =1;
		for(int i=0;i<array1.length;i++) {
			for(int j=1;j<array1.length;j++) {
				if(array1[i]==array1[j]) {
					count++;
				}else {
					break;
				}
			}
			
			System.out.println(count +"  " +array1[i]);
			i+=(count-1);
		}
		
	}

}
