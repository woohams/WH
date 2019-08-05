package test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class practice7 {
	
	public static void main(String[] args) {
		  Random r = new Random();
		  int k = 0;
		  int rd = 0;
		  Map m = new HashMap();
		  for (int i = 1; i < 31; i++) {
		   m.put(i, i);
		  }
		  int[][] arr = new int[5][6];
		  int[] tempArr = new int[30];
		  
		  while(k<tempArr.length){
		   rd = r.nextInt(31);
		   if(m.get(rd)!=null){
		    tempArr[k] = rd;
		    m.remove(rd);
		    k++;
		   }
		  }
		  
		  k = 0;
		  for (int i = 0; i < 5; i++) {
		   for (int j = 0; j < 6; j++) {
		    arr[i][j] = tempArr[k];
		    k++;
		    System.out.print(arr[i][j]+"\t");
		   }
		   System.out.println();
		  }
		 }
}