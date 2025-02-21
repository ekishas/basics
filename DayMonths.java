public class DayMonths {
    public static void main(String[] args) {
        int days = daysInMonth(7);
        System.out.println("The number of days in this month is" + days);
    }//main

    public static int daysInMonth(int Month){
        if ( Month == 1){
            return 31;
        }
        else if ( Month == 2){
            return  28;
        }
        else if ( Month == 3){
            return 31;
        }
        else if ( Month == 4) {
            return 30;
        }
        else if ( Month == 5){
            return 31;
            }
        else if ( Month == 6 ){
            return 30;
        }
        else if ( Month == 7){
            return 31;
        }
        else if ( Month == 8){
            return 31;
        }
        else if ( Month == 9 ){
            return 30;
        }
        else if ( Month == 10){
            return 31;
        }
        else if ( Month == 11){
            return 30;
        }
        else if ( Month == 12){
            return 31;
        }
        
        return -1;
    }
}