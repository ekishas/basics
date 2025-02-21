public class Practice {
        public static void main(String[] args) {
            int a = 19;
            int b = 7;
            
            ifStatements(a,b);
    }
    
    public static void ifStatements(int a, int b) {
        if (a < b) {
            a = a + 1;
        } else{
        a--;
    if (b < a) {
        b++;
    }
    System.out.println(a + b);
        }
    }
}
