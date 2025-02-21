public class Season {
    public static void main(String[] args) {
        String s = season(12,16);
        System.out.println(" This season is " + s);
    } //main
    
    public static String season (int month, int day ){ // remember to return.
        if (month > 12){
            return "bad input";
        } 
        else if (month < 1){
            return "bad input";
        }
        if (day > 31){
            return "bad input";
        } 
        else if (day < 1){
            return "bad input";
        }
        else if ( month == 12 ) {
            if (day >= 16){
                return "winter";
            } else {
                return "fall";
            }
            
        } else if (month >= 10){
            return "fall";
        } else if (month == 9){
            if (day >= 16){
                return "fall";
            } else {
                return "summer";
            }
        } else if (month >= 7){
            return "Summer";
        } else if (month == 6){
            if (day >= 16){
                return "summer";
            } else {
                return "spring";
            }
        } else if (month >= 4){
            return "spring";
        } else if (month == 3){
            if (day >= 16){
                return "spring";
            } else {
                return "winter";
            }
        }else{
            return "winter";
        }
    }
}



