package basics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileClass {

	public static void main(String[] args) throws IOException {
		boolean append = true;
		File f = new File("abc.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		File f1 = new File("Directory");
		f1.mkdir();
		File f3 = new File(f1, "test.txt");
		System.out.println(f3.exists());
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f3.exists());

		File f5 = new File("C:\\eclipse\\Direct", "abc.text");
		try {
			f5.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f5.exists());

		System.out.println(f3.isFile());
		System.out.println(f1.isDirectory());
		String[] fil = f1.list();
		for (String fil1 : fil) {
			System.out.println(fil1);
		}

		System.out.println(f3.length());
		System.out.println(System.getProperty("user.dir"));
		try {
			FileWriter fw = new FileWriter(f3, append);
			fw.append("Family");
			fw.append("I love my kids and Husband more than my life");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("Fruits");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileWriter fw = new FileWriter("text.txt");
			char[] ch = { 'a', 'b', 'c' };
			fw.write(String.valueOf(ch) + "\n");
			fw.write(100 + "\n");
			fw.write("I love kids \n and Husband");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileReader fr = new FileReader("text.txt");

		int i = fr.read();
		// this method returns the unicode vaue
		while (i != -1) {
			System.out.println((char) i);
			i = fr.read();
		}

		fr.close();
		System.out.println("***********************************");

		long l = f3.length();
		FileReader fr1 = new FileReader(f3);
		char[] ch = new char[(int) l];
		fr1.read(ch);
		// this method returns the char array

		for (char ch1 : ch) {
			System.out.println(ch1);

		}
		fr1.close();
		
		//BufferedWriter /////////////////////////////////////////////////////////////////////
		try {
			FileWriter fw = new FileWriter("text3.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			char[] ch1 = { 'a', 'b', 'c' };
			bw.write(ch1);
			bw.newLine();
			bw.write(100 );
			bw.newLine();
			bw.write("I love kids \n and Husband");
			bw.newLine();
			bw.flush();
			bw.close();
			//fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
