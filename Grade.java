public class Grade {
    public static void main(String[] args) {
        double grade = getGrade(75);
        System.out.println(grade);
    } //main
    
    public static double getGrade(int percentage){ // remember to return.
        if(percentage <= 55.0) {
            System.out.println("This grade is an 0.0");
            return 0.0;
        }else if(percentage <= 65.0){
            System.out.println("This grade is an 1.0");
            return 1.0;
        }else if (percentage <= 75.0){
            System.out.println("This grade is an 2.0");
            return 2.0;
        }else if(percentage <= 85.0){
            System.out.println("This grade is an 3.0");
            return 3.0;
        }else if(percentage <= 90.0){
            System.out.println(" This grade is an 3.5");
            return 3.5;
        }else if (percentage <= 100.0){
            System.out.println("This grade is an 4.0");
            return 4.0;
        }else{
            System.out.println("Wrong data");
            return -1;
        }
    }
}
