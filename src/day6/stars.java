package day6;

public class stars {
	static void printRowOfKSize(int row) {
		if(row<=0) {
			throw new IllegalArgumentException("row value should be greater than zero");
		}
		for (; row >= 1; row--) {
			for (int col = 0; col < row; col++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		printRowOfKSize(7);

	}

}
/**
 * printRowOfKSize taking An Input Argument And Printing "row" Number of Rows
 * and inside every Iteration we Are printing it By "rows" times and every time
 * the "row is getting decremented..
 * 
 * @param row
 */