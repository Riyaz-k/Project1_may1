package program;

public class SpeedConverter {

   int empid;  
   String empname;  
	    
   //parameterized constructor with two parameters
   SpeedConverter(int id, String name){  
     this.empid = id;
     this.empname = name;
   }  
   
   public static void main(String args[]){  
	   SpeedConverter obj1 = new SpeedConverter(10245,"Chaitanya");  
	   SpeedConverter obj2 = new SpeedConverter(92232,"Negan"); 

	System.out.println("Id: "+obj1.empid+" Name: "+obj1.empname);
	System.out.println("Id: "+obj2.empid+" Name: "+obj2.empname);
	
   }  
}