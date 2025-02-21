public class Prime {
    public static void main(String[] args) {
        boolean primeoreven= isPrime(7);
        if (primeoreven == true){
            System.out.println(" This number is true");
        }else{
            System.out.println(" This number is false");
        }
        
}//main

    public static boolean isPrime(int prime) {
        // debug: System.out.println("I am here.....");
        for (int i = 2; i < prime; i++) {
            int remainder = prime % i; 
        
            if ( remainder == 0){
                return  false;
            }
        } // for
    
        return true;
    } //isPrime
} // class



