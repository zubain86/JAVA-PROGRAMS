
import java.util.Scanner;
public class infixtopostfix
{
    static char stack[] = new char[52];
    static int top = -1;
    static boolean check(char c) {
        if (top == -1) {
            return false;
        } else {
            if(stack[top]=='('||c=='(')
            {
                return false;
            }
            else if(c==')')
            {
                return true;
            }
            else if (stack[top] == '^' && c == '^') {
                return false;
            } else if (stack[top] == '^') {
                return true;
            } else if ((stack[top] == '+' || stack[top] == '-') && (c == '*' || c == '%' || c == '/')) {
                return false;
            } else {
                return true;
            }
        }
    }

    static void push(char c)
    {
        top = top+1;
        stack[top] = c;
    }
    static char pop()
    {
        if(top==-1)
        {
            return 'm';
        }
        else
        {
            char  c = stack[top];
            top--;
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,s1="";
        System.out.println("Enter the expression");
        s= sc.next();
        int i;
        boolean j;
        for(i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                s1 = s1 + ch;
            } else {
                j = check(ch);
                while (j == true) {
                    char c = pop();
                    s1 = s1 + c;
                    j = check(ch);
                }
                if (j == false) {
                    if (ch == ')') {
                        pop();
                    } else {
                        push(ch);
                    }
                }
            }
        }
        while(top!=-1)
        {
            char c1 = pop();
            if(c1!='('&&c1!=')')
            {
                s1 = s1 + c1;
            }
        }
        System.out.println("Postfix expression is: "+s1);
    }
}
