package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner infile;
PrintWriter pw;
try{
infile=new Scanner(new File("nums.txt"));
pw=new PrintWriter("twice_nums.txt");
int inputNum;
while(infile.hasNext()) {
	inputNum=infile.nextInt();
	inputNum*=2;
	pw.println(inputNum);
}
infile.close();
pw.close();
}catch(FileNotFoundException ex) {
	System.out.println(ex.getMessage());
}
	}

}
