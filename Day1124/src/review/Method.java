package review;

import java.util.Scanner;

class AAA {

	// void method name(parameter x)
		public void display() {
			System.out.println("멧서트");
		}
		
	// void method name(parameter o)		
		public void display(String name) {
			System.out.println("하하"+name);
		}
		
	// returen type method name (parameter x)
		public int readInt() {
			Scanner in=new Scanner(System.in);
			System.out.println("정수입력");
			int inputData=in.nextInt();
			
			return inputData;
		}
		
	// returen type method name (parameter o)  <-- 
		public double div(int n, int m) {
			return (double)n/m;
		}
		
		
		public void non_static_disp() {
			display();	//<-- void method can be loaded in void method.
		}
}


	public class Method{
		public static void main (String[] args) {
			AAA aaa=new AAA();
			aaa.display();
			aaa.display("what a great world");
			aaa.readInt();
			
			System.out.println("--------------------");
			
			aaa.div(10, 20);
			System.out.println((aaa.div(10, 20)));
			double rediv=aaa.div(10, 20);
			System.out.println(rediv);
			
			//display();;  <-- void method can't be loaded in static method.
		
		
			
		}
}
