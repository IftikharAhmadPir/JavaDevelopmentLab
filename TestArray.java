
public class TestArray {
	public static void main (String[] args) {
    	System.out.println("\n----tasks1 ---- ");
    	IntArray myObj = new IntArray();
    	System.out.println("\n----tasks2 ---- ");
    	myObj.print();
    	System.out.println("\n----tasks3 ---- ");
    	System.out.println("Highest Number: " + myObj.highestNumber());
    	System.out.println("\n----tasks4 ---- ");
    	myObj.oddNumbers();
    	System.out.println("\n----tasks5 ---- ");
    	int [][]  int2Darr = myObj.splitArray();
    	System.out.println("\n----tasks55 ---- ");

    	//System.out.println (int2Darr[0][1]);
    	System.out.println("\n----tasks6 ---- ");
    	myObj.printArray(int2Darr);

	}

}
