package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileVerifyForDuplicacy {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("f.txt");
		f.createNewFile();
		f=new File("f1.txt");
		f.createNewFile();
		
		BufferedReader br1=new BufferedReader(new FileReader("f1.txt"));
        PrintWriter pw=new PrintWriter("results.txt");
        
        String line1=br1.readLine();
       
        while(line1!=null ) {
        	 boolean available=false;
        	BufferedReader delete=new BufferedReader(new FileReader("f.txt"));
        	String target=delete.readLine();
        	while(target!=null) {
        		if(line1.equalsIgnoreCase(target)) {
        		
        	available=true;
        			break;
        		}
        		target=delete.readLine();
        		
        	}
        if(available==false) {
        	pw.println(line1);
        }
    		line1=br1.readLine();
        	
        	
//             	if(line2!=null) {
//             		boolean val=line2.equalsIgnoreCase(line1);
//             		if(val==false) {
//             			pw.println(line2);
//             		}
//             		line2=br1.readLine();
//             	}
//        	
        }

        	pw.flush();
        	br1.close();
        
        	pw.close();
		
	}
	

}
