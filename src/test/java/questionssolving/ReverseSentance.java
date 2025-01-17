package questionssolving;

public class ReverseSentance {

	public static void main(String[] args) {
		String sentance = "bappa is a brilliant guy";
		String revsentance = "";
		String revsentance2="";
		/*for(int i=sentance.length()-1;i>=0;i--) {
			revsentance = revsentance+sentance.charAt(i);
			
		}
		
		System.out.println(revsentance);
		
		System.out.println("***************");
		
		int i=sentance.length()-1;
		while(i>=0) {
			revsentance2=revsentance2+sentance.charAt(i);
			i--;
		}
		
		System.out.println(revsentance2);
     */
		
		/*char[] chararray = sentance.toCharArray();
		String array="";
		System.out.println(chararray.length);
		
		for(int i=chararray.length-1;i>=0;i--) {
			array = array+chararray[i] ;
		}
		System.out.println(array);
		*/
		
		StringBuilder sb = new StringBuilder(sentance);
		System.out.println(sb.reverse());
		
		StringBuffer sf = new StringBuffer(sentance);
		System.out.println(sf.reverse());
		
	}

}
