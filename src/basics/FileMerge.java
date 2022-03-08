package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {

		public static void main(String[] args) throws IOException{
        File f=new File("file1.txt");
        f.createNewFile();
        f=new File("file2.txt");
        f.createNewFile();
        
		BufferedReader fw=new BufferedReader(new FileReader("file1.txt"));
		BufferedReader fw2=new BufferedReader (new FileReader("file2.txt"));
		PrintWriter pw=new PrintWriter("file3.txt");
		String line1=fw.readLine();
		String line2=fw2.readLine();
		while(line1!=null || line2!=null){
			if(line1!=null) {
		pw.println(line1);
		line1=fw.readLine();
		}
		if(line2!=null) {
		pw.println(line2);
		line2=fw2.readLine();
				}	
		}
		pw.flush();
		fw.close();
		fw2.close();
		pw.close();
		}

}
