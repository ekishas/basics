public class MathFunctions {
   public static void main(String[] args) {
   
      int minOfAll = findMin(1,2,3);
      System.out.println("Min of all is "+ minOfAll);
      
      minOfAll = findMin(3,-2,7);
      System.out.println("Min of all is "+ minOfAll);
      
      minOfAll = findMin(6,19,27);
      System.out.println("Min of all is "+ minOfAll);
  
      int q = countQuarters(1278);
      System.out.println("Number of quarters are " + q);
      
      //Testing:
      q = countQuarters(100);
      System.out.println("Number of quarters are " + q);

   } //main close
   
   public static int findMin(int num1,int num2,int num3) {
      int min = Math.min(num1,num2); 
      min = Math.min(num3,min);
      
      return min;
   }   
   
   public static int countQuarters(int cents) {
   
      int centsWithDollarsRemoved = cents%100;
      int countQuarters = centsWithDollarsRemoved/25;
      
      return countQuarters;
  } 
}