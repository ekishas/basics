public class TriangleType {
    public static void main(String[] args) {
        printTriangleType(4,4,4);   
    } //main
    
    public static void printTriangleType(int a, int b, int c){
        System.out.println("The three lengths of a triangle are: " + " ,"+a +" "+" ,"+ b +" ,"+c);
        
        if(a == b) {
            if(a == c) {
                System.out.println("This is a equilateral triangle");
            }else{ 
                System.out.println("This is an isoselse triangle");
            }
        }else if (a == c){
            System.out.println ( "This is an isoselse triangle");
        }else if (c == b){
            System.out.println ("This is an isoselse triangle");
        }else{
            System.out.println ("This is a scalene traingle");
        }
    }
} //class