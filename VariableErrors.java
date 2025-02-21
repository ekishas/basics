
/*
 * © 2024 Eastside Technology Center
 * 
 * Welcome to the VariableErrors Assignment!
 * 
 * Below you will find an existing program that attempts to calculate someone's
 * overall grade based on their individual grades and various category weights.
 *
 * However, the original programmer made many mistakes. Using your knowledge
 * from class, try to fix all the errors, improve the quality of the code, and
 * get a correct output for the overall grade.
 * 
 * The math theory underpinning the below calculations is: "Weighted Averages"
 * While none of the mistakes in the below program are related to the math
 * theory, you may still find that an understanding of weighted averages is
 * useful context to have as you're navigating the code.
 */
 
public class VariableErrors {
   public static void main(String[] args) {
      // Do not modify the below group of declarations and initializations
      double homeworkCategoryWeight = 0.2;
      double testCategoryWeight = 0.7;
      double participationCategoryWeight = 0.1;
      int homework1Grade = 2;
      int homework2Grade = 3;
      int homework3Grade = 4;
      int test1Grade = 2;
      int test2Grade = 3;
      int participation1Grade = 1;
      int participation2Grade = 4;
      // Do not modify the above group of declarations and initializations
      
      // There are programming errors below that you will need to fix
      int homeworkSum = homework1Grade + homework2Grade + homework3Grade;
      int testSum = test1Grade + test2Grade;
      int participationSum = participation1Grade + participation2Grade;
      
      double homeworkAverage = homeworkSum / 3.0;//  3.0: This is a double so it has to be in decimal form-Ekisha
      int testAverage = testSum / 2;// 2: This is Int, so it has to be a whole number-Ekisha 
      int participationAverage = participationSum / 2;
      
      double homeworkWeightedValue = homeworkAverage * homeworkCategoryWeight;// it has to say Int or double before the code-Ekisha
      double testWeightedValue = testAverage * testCategoryWeight;// It has to say double before the "testwightedvalue"-Ekisha
      double participationWeightedValue // it has to say int or double-Ekisha 
            = participationAverage * participationCategoryWeight;  // This line is split to prevent it from becoming too long. This is not a mistake.
      
      double overallGrade = homeworkWeightedValue 
            + testWeightedValue
            + participationWeightedValue;  // This line is split to prevent it from becoming too long. This is not a mistake.
      
      System.out.println("Overall grade: " + overallGrade);  // The correct output should be 2.6, not 2.2!
      
      /*
       * Optional Extension:
       * Use modify the above code to calculate the overall grade in one of
       * your own classes! Verify that your program output agrees with what
       * your school gradebook says.
       * 
       * You may need to add or remove variables based on how your class'
       * grading is structured.
       */
   }
}
