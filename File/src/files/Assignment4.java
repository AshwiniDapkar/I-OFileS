package files;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Assignment4 am=new Assignment4();
		am. largest(0,0);
		am. largest(0,0,0);
	}
public static void largest(int a,int b)
{
	Scanner sc=new Scanner(System.in);

	a=sc.nextInt();
	b=sc.nextInt();
	if(a>b) {
		System.out.println(a);
			}
	else {
		System.out.println(b);

	}
}
public static void largest(int a,int b,int c)
{
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if((a > b && a > c)) {
		System.out.println(a);
	}
		else if((b > a && b > c))
		{
			System.out.println(b);
		}

		else if((c > a && c > b))
		{
			System.out.println(c);
		}
			else {
				System.out.println("invalid");
		}
			}
		}

