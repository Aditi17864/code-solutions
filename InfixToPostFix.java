import java.util.Scanner;
import java.util.Stack;


public class InfixToPostFix {

    static int priority(char c){
        if (c == '+' || c == '-') return 1;
        else if (c=='*' || c=='/') return 2;
        else if(c=='^') return 3;
        return 0;
    }
    0
}
