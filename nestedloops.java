public class nestedloops {
   public static void main(String[] args) {
      int multiplier = 2; 
      int shift = 0;
      
      // Write your code inside the curly brackets: { and }
      System.out.println ("Nested for loops: Problem 1 solution");
 
      for (int i = 0; i < 4; i++) {
         int stars = multiplier * i + 3;   // Y = 2i+3
  
         for ( int j = 0; j < stars; j++) { 
            System.out.print ("*"); 
         }
         
         System.out.println("");
      }
      
      System.out.println (" ");

      System.out.println("Nested for loops: Problem 2 solution");
      shift = 3;
   
      for( int i = 0; i <= 3; i++) {
         int stars = multiplier * i + 5;   
         System.out.println(" "); 
    
         for ( int x = shift; x > 0; x--) {
             System.out.print( "." );
         }

         for ( int j = 0; j < stars; j++) {  
             System.out.print( "*");
         }
   
         shift--;
      }
 
      System.out.println(" "); 
      System.out.println(" "); 
 
      System.out.println("Nested for loops: Problem 3 solution");
      
      int startingnum = 1;
      shift = 0;
      
      for( int i = 0; i <= 8; i++) {
            
         System.out.println(" "); 
    
         for ( int j = startingnum; j < 10; j++) {  
             System.out.print(j);
         }
         
         startingnum++;
         shift--;
       }

         System.out.println(" ");
 
         System.out.println("Nested for loops: Problem 4 solution");
         shift = 9;
         
         for( int i = 0; i < 9; i++) {
            System.out.println(" ");
    
            for ( int x = shift; x > 0; x--) {
               System.out.print( x );
            }

            for ( int j = 0; j > 0; j--) {  
               System.out.print(j);
            }
   
            shift--;
         }
   } //main
} //class
 

