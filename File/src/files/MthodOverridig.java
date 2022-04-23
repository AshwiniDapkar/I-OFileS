package files;

import java.util.Scanner;

public class MthodOverridig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
Numbers num=new Numbers(a,b,c);
num.lgreatest(a,b,c);
numFun fun=new Numbers(a,b,c);
fun.greatest(a,b,c);
fun.greatest(a,b);
	}

}
class  Numbers{
	int a,b,c;
	Numbers(int a,int b,int c){
	this.a=a;
	this.b=b;
	this.c=c;
	}

public void lgreatest(int a ,int b int c) {
int large=a;
if(b>large) {
	large=b;
	}
if(c>large) {
	large=c;
	}
System.out.println("largets among 3"+largets);
}
}
class numFun extends Numbers{
	numFun(int a,int b,int c){
		super(a,b,c);
	}

	public void lgreatest(int a ,int b int c) {
		int large=a;
		if(b>large) {
			large=b;
			}
		if(c>large) {
			large=c;
			}
		System.out.println("largets among 3"+largets);
		}
		}
public void lgreatest(int a ,int b) {
	if(a>b) {
		System.out.println(a);
	}
	else {
		System.out.println(b);
	}
	}
}
}