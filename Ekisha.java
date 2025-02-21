import java.util.Scanner;

public class Ekisha {
    public static void main(String[] args) {
        int number = 6;
        if ( number == 3 && number ==5){
        }
    }

    public static void temp(){
        Scanner console = new Scanner(System.in);
        System.out.print("Type a number here:");
        int number = console.nextInt();
        if (number < 10) {
            System.out.println("Your number is less than 10");
        } else if (number > 10){
            System.out.println("Your number is greater than 10");
        } else { // (number == 10);
            System.out.println("Your number is equal to 10");
        }
    }
}