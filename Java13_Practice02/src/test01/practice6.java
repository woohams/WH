package test01;

public class practice6 {
	
	public static void main(String[] args) {
	
		int arr [][] = new int[5][6];
		
		for(int i =0; i<5;i++) {
			for(int j =0; j<6;j++) {
				int a = (int)(Math.random()*29)+1;
				arr[i][j] = a;
				if(a==a) {
					a--;
				}
			}
		}
		
		
		
		prn(arr);
	}
		public static void prn(int[][] arr) {


		for(int i = 0; i <arr.length; i++) {
			// j는 작은 배열의 길이
			for(int j = 0; j < arr[i].length;  j++) {	
				
				System.out.print(arr[i][j] + "\t");

			}
				System.out.println();
		}
		System.out.println();
	}

}
