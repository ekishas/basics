import java.util.*;

public class Budgeter {
    public static void main(String[] args) {
        //Print Introduction (print statement - easy)- done
        System.out.println("This program askes you for you monthly income and expenses, then tells you your net monthly income.");
        //Collect from user input the income amts (Scanners / for loop)-done
        double incomeSum = collectIncome();
        //Collect from user input the expense amts (Scanners / for loop)-done
        double expenseSum = collectExpense();
        //Calculate total income and expenses (divide by 31 and use class constant) 
        printTotal(incomeSum,expenseSum);
        //Find difference and print comment (if else statements)
        outputFeedback(incomeSum,expenseSum);

    }//main
    
    public static double collectIncome(){
        Scanner console = new Scanner(System.in);
        System.out.print("How many categories of income? ");
        int numOfCategories = console.nextInt();
        double incomeSum = 0;
        for (int incomeIndex = 1; incomeIndex <=numOfCategories; incomeIndex++ ){
            System.out.print("    Next income amount? ");
            double firstIncome = console.nextDouble();
            incomeSum += firstIncome;
        
        }
        return incomeSum;
    }
    public static double collectExpense(){
        Scanner console = new Scanner(System.in);
        double expenseSum = 0;
        System.out.print("Enter 1) monthly or 2) daily expenses? ");
        double dailyExpense = console.nextDouble();
        System.out.print("How many categories of expense? ");
        int number = console.nextInt();
        for (int expenseIndex = 1; expenseIndex <=number;expenseIndex++){
            System.out.print("    Next expense amount? ");
            double firstExpense = console.nextDouble();
            expenseSum += firstExpense;
        }
        return expenseSum;
    }
        //  Total income = $1425.75 ($45.99/day)
        //Total expenses = $1095.62 ($35.34/day)
    public static void printTotal(double totalIncome, double totalExpense){
        double dailyIncome =(totalIncome / 31);
        double dailyExpense =(totalExpense / 31);
        System.out.println("Total income = $" + totalIncome +"(" + dailyIncome + "/ day)");
        System.out.println("Total expense = $" + totalExpense+"(" + dailyExpense + "/ day)");
    }
    public static double outputFeedback( double totalIncome, double totalExpense){  
        double netMonthlyIncome = totalIncome - totalExpense;
        if (netMonthlyIncome >= 250) {
            System.out.println("I am a big saver");
        } else if (netMonthlyIncome > 0) {
            System.out.println("I am a saver");
        } else if (netMonthlyIncome >=-250) {
            System.out.println("I am a spender");
        } else { 
            System.out.println("I am a big spender");
        }
        System.out.println("You earned " + netMonthlyIncome + " more than you spent this month.");
        System.out.println("Good job!");
        return netMonthlyIncome;
    }
    

}//class
