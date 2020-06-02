
public class IntArray {
	private	int[] arrayofInt = new int[10];

	public  IntArray () {
		   for(int i = 0; i < arrayofInt.length; i++) {
			   arrayofInt[i] = i;
	        }
	}
	
	public void print() {
		for (int element : arrayofInt){
			System.out.print(element);
			if (element !=9)
			System.out.print(',');
		}
	}
	
	public int highestNumber() {	
		return arrayofInt[9];
	}
	
	public void oddNumbers() {
		int oddNum = 0;
		  for(int i = 0; i < arrayofInt.length; i++) {
			  oddNum = arrayofInt[i] %2;
			  if (oddNum == 1) {
			  System.out.println ("odd number = " + arrayofInt[i]);
			  }
		  }
	}
	
	public int [][] splitArray() {
		int n = arrayofInt.length;
		int[] a = new int[(n + 1)/2];
		int[] b = new int[n - a.length];
		//System.arraycopy(arrayofInt, 0, a, 0, a.length);
		//System.arraycopy(arrayofInt, a.length, b, 0, b.length);
		for (int i1 = 0; i1 <a.length; i1++ ) {
			a[i1] = arrayofInt[i1];
		}
		for (int j1 = 0; j1 <b.length; j1++ ) {
			b[j1] = arrayofInt[j1 + b.length];
		}

		int[][] arr = new int[2][a.length];
		for (int i = 0; i < a.length; i++) {
			arr[0][i] = a[i];
			arr[1][i] = b[i];
		}		
        return arr;
	}
	
	public  static void printArray(int int2dArr[][]){
	    for (int row = 0; row < int2dArr.length; row++) {
	        for (int column = 0; column < int2dArr[row].length;column++) {
	        System.out.print(int2dArr[row][column] + " ");
	      }
	    System.out.println();
	   }

	}
	

}
