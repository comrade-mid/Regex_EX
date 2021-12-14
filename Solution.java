import java.util.*;
import java.util.regex.*;
import java.lang.*;

public class Solution{
	
	public static void main(String[] args){
		
		String[] helps = new String[200];
		String[] regex = new String[6];
		
			int z = 0;
			regex[0] = "\\p{javaMirrored}";
			regex[1] = "\\d+\\.\\d*|\\d*\\.\\d+";
			Pattern P = Pattern.compile(regex[1]);
			
			Matcher M = P.matcher(here);
			
			
			
			while(M.find() ){ 
				helps[z++] = M.group();
			}
			float min = 0;
			float max = 0;
			float avg = 0;
			float[] holds = new float[z];
			
			for(int i=0;i<z;i++) holds[i] = Float.valueOf(helps[i]);
				
			
			
			for(int i=1; i<z;i++){
				if(holds[i] < (holds[i-1])) min = holds[i];
				else min = holds[i-1];
				if(holds[i] > holds[i-1] ) max = holds[i];
				else max = holds[i-1];
				
				avg += (holds[i]);
			}
			avg += (holds[0]);
			avg = avg/z;
			
			Hashtable<String, Float> Cases = new Hashtable<String, Float>();
			
			Cases.put("Min",min);
			Cases.put("Max",max);
			Cases.put("AVG",avg);
			
			System.out.println("The average: " + Cases.get("AVG") + " The Worst: " + Cases.get("Max") + " The Best: " + Cases.get("Min"));
			
			
			
			
		
	}
	
}