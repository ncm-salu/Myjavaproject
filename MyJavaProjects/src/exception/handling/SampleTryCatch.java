package exception.handling;

public class SampleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("start");
      int x[] = { 2,3,4};
   try {
	x[4]= 20/1;
       }
   catch(ArithmeticException e)
   {
    System.out.println(e);
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println(e);
   }
   catch(Exception e) 
   {
	System.out.println(e);	
   }

	System.out.println("End");
}
}