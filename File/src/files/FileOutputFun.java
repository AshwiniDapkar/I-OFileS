package files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	PrintWriter pw=new PrintWriter("output.txt");
	pw.println("Hello there");
	pw.println("My name is ashwini");
	pw.close();
	}
catch(FileNotFoundException ex) {
	System.out.println("couldn't write to the file");
}
	}

}
