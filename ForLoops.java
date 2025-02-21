
/*
 * © 2024 Eastside Technology Center
 */
 
public class ForLoops{
   public static void main(String[] args) {
      /*
      This below loop attempts to print out all the cubes from 1 to 10.
      However, it does not label each cube well as it just prints out
      "ith cube" for every cube.
      */
      System.out.println("Start of Problem 1");
      for (int i = 10; i <= 1; i++) {
         int cube = i * i * i;
         System.out.println("The ith cube is " );
      }
      System.out.println("End of Problem 1");
      System.out.println();
      
      /*
      Problem 1
      Below, try to implement your own version of the loop so that a more
      useful label for each row is printed.
      \
      
      */
      
      System.out.println(" Start of problem 1");
      for (int i = 1; i <= 10; i++) {
         int cube = i * i * i;
         System.out.println("The " + i + "th cube is " + cube);
      }
      System.out.println("End of problem 1");
      
      // End of Problem 1
      
      /*
      Problem 2
      In the below comment, you will find a loop that attempts to print out the
      first 10 multiples of 3. Copy the code into the below Problem 2 coding
      space (after finishing Problem 1) and fix the mistakes.
      *
      
      /*
      System.out.println("Here are the first 10 multiples of 3:"); 
      for (i = 1: i < 10; i++)
          int sum = 0;
          sum += 3;
          System.out.print(sum + " ");
      }
      */
      // Insert your copied code for Problem 2 below
      System.out.println("Start of Problem 2");
      System.out.println("Here are the first 10 multiples of 3:");
      for (int i = 1; i <= 10; i++) {
          int sum = 0;
          sum += 3 * i;
          System.out.print(sum + " ");
      }
          // End of Problem 2
      System.out.println();
      System.out.println("End of Problem 2");
      System.out.println(); 
      /*
      Extra reading and reflection:
      The above solution to Problem 2 slowly builds and updates a sum as the
      loop iterates multiple times. Below, you will find an alternative
      solution that instead calculates the correct multiple of 4 during each
      loop iteration.
      */
      
      System.out.println("Start of Problem 3");
      System.out.println("Here are the first 10 multiples of 4:");
      for (int i = 1; i <= 10; i++) {
         System.out.print(4 * i + " ");
      }
      System.out.println();
      System.out.println("End of Problem 3");
      System.out.println();
     
  
      
      
      /*
      Many programmers would say this solution is a little easier to read, but
      also a little bit computationally slower than the previous solution. Try
      to explain why this solution is slower for the computer to run.
      */
      
      /*
      It would be slower to run becuase, It has to do thsi looping procces 
      as many times as the programer desires until it has a false loop and stops immediatly.
      If it is a long number, the computer might have a long time to do all of the solving.
      That is why this solution is slower than the previous solution.
      */   
   }
}