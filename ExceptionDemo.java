/* here we are showing the exception which occurs when we try to implement multiple methods */
package session11; //here it is the package session11

import java.util.Scanner;//import scanner class is in util folder inside the java folder
//util contains utility classes
//scanner is a predefined class for taking inputs from user

public class ExceptionDemo {
//created class as ExceptionDemo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo e1 = new ExceptionDemo();//creted ExceptionDemo using new keyword
		e1.doSomething();
	}

	void doSomething() {//void doest return any value
		System.out.println("do more got called");//prints
		doMore();
	}

	void doMore() {
		Scanner in = new Scanner(System.in);// Scanner for input

		System.out.println("Input the numerator: ");
		int num1 = in.nextInt();
		/** nextint() scans or reads the incoming input
		* sees that input is not an integer and throws an exception**/
		int denominator = 0;

		System.out.println(num1 / denominator);//prints

	}
}
 
	
		
      