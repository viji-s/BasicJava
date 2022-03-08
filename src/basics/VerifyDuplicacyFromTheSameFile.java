package basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class VerifyDuplicacyFromTheSameFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter("res.txt");
		String line1 = br.readLine();
		while (line1 != null) {
			boolean res = false;
			BufferedReader output = new BufferedReader(new FileReader("res.txt"));
			String line2 = output.readLine();
			while (line2 != null) {
				if (line1.equalsIgnoreCase(line2)) {
					res = true;
					break;
				}
				line2 = output.readLine();
			}
			if (res == false) {

				pw.println(line1);
				pw.flush();
			}
			line1 = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();

	}
}
