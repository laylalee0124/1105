package Interface;

public class Rambda_further {

   final static String salutation = "Hello! ";
   
   interface aaa {
	      void sayMessage(String mg);
	   }
	   
	   static int a=3;
	   static int b=5;
	   static int ccc;
	   static {
		   ccc=a*b;
	   }
	   
   public static void main(String args[]) {
      aaa gv = mg  ->  System.out.println(salutation + mg);
      gv.sayMessage("world");
      
      System.out.println(ccc);
   }
	
  

}