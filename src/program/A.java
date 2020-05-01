package program;

public class A {
	 static int x = 60;
	 static void fun() {
	  System.out.println("Within Static");
	 }
	 public static void main(String[] args) {
		 A.fun();
	  System.out.println(x);
	  A a = new A();
	   
	
	 }
	}