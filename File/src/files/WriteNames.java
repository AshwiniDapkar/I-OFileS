package files;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class WriteNames {
	public class FileOutputFun {
			public static void main(String[] args) {
				ArrayList<String> AL=new ArrayList<>();
				// TODO Auto-generated method stub
				AL.add("akash");
				AL.add("ashwini");
				AL.add("pratish");
				AL.add("akka");
				AL.add("avni");
		
		
			try {
				PrintWriter pw=new PrintWriter("output.txt");
				for(int i=0;i<AL.size();i++) {
					System.out.println(AL.get(i));
				pw.close();
				}
			}
			catch(FileNotFoundException ex) {
				System.out.println("couldn't write to the file");
			}
		}
			}

		}


