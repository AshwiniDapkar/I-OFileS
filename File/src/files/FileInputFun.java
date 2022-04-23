package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner infile;
try {
	infile=new Scanner(new File ("input.txt"));
	int input;
	int sum=0;
	while(infile.hasNext())
	{
		input=infile.nextInt();
				System.out.println(input);
				sum+=input;
	}	infile.close();
	System.out.println("sum is"+sum);
} catch(FileNotFoundException ex){
	System.out.println("cant find file");
	System.out.println(ex.getMessage());

}catch(InputMismatchException ex) {
	System.out.println("error reading input");

}

	}

}
	