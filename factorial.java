
class Factorials {
    
    public int facts(int n){
        int fact = 1;   // Keep outside loop
        for(int i = 1; i <= n; i++){
            fact = fact * i;   // multiply
        }
        return fact;   // return correct value
    }
}

public class factorial {
    public static void main(String[] args) {
        Factorials f = new Factorials();
        System.out.println("The fact is this: " + f.facts(5));
    }
}
