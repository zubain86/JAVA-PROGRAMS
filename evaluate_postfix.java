import java.util.*;
public class evaluate_postfix {
    static int stack[] = new int[50];
    static int top = -1;
    static void push(int a) {
        top = top + 1;
        stack[top] = a;
    }
    static int evaluate(char c) {
        int a, b;
        b = pop();
        a = pop();
        switch (c) {
            case '+':
                return (a + b);
            case '-':
                return (a - b);
            case '*':
                return (a * b);
            case '/':
                return (a / b);
        }
        return 0;
    }
    static int pop() {
        int x = stack[top];
        top = top - 1;
        return x;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the expression");
        s = sc.next();
        int i;
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int k = Character.getNumericValue(ch);
                push(k);
            } else {
                int ev = evaluate(ch);
                push(ev);
            }
        }
        System.out.println("Value of postfix expression is: " + stack[top]);
    }
}



