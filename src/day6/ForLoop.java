package day6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ForLoop {
	public static void writeIntoFile(String data, String file) throws IOException {
		FileWriter Writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(Writer);
		bufferedWriter.write(data);
		bufferedWriter.close();
	}

	public static void main(String[] args) throws IOException {
		usingWhileLoop();
		usingForLoop();

	}

	private static void usingWhileLoop() {
		int row, col, n = 5;
		row = n - 1;
		if (n <= 0) {
			throw new IllegalArgumentException("row value should be greater than zero");
		}
		while (row >= 0) {
			col = 0;
			while (col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println("\n");
			row--;

		}

	}

	private static void usingForLoop() throws IOException {

		int n = 5;
		if (n <= 0) {
			throw new IllegalArgumentException("row value should be greater than zero");
		}
		String fileName = "output.txt";
		for (int row = n - 1; row >= 0; row--) {
			String currROW = "";
			for (int col = 0; col <= row; col++) {
				currROW += "*";
			}
			currROW += "\n";

			writeIntoFile(currROW, fileName);
		}

	}

}
