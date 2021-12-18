import java.util.Scanner;
public class primitive_stack {
         Scanner sc = new Scanner(System.in);
      static int n;
        int arr[] = new int[n] ;
        int n1,n2;
        int top = -1;
        void push() {
            System.out.println("Enter the number of elements to be pushed");
             n1 = sc.nextInt();
            if (n1 <= n) {
                while (top < n1-1) {
                    if (top == (n - 1)) {
                        System.out.println("Stack is full");
                        break;
                    } else {
                        top = top + 1;
                        arr[top] = sc.nextInt();
                    }
                }
            } else {
                System.out.println("Invalid input");
            }
        }
        void pop() {
            System.out.println("Enter the number of elements to be poped");
            n2 = sc.nextInt();
            while (top > (n1 - n2 - 1)) {
                if (top == -1) {
                    System.out.println("Stack is empty");
                    break;
                } else {
                    int x = arr[top];
                    top--;
                    System.out.println(x + " is poped element");
                }
            }
        }
       void display()
        {
            if(top==-1)
            {
                System.out.println("Stack is empty");
            }
            else
            {
                System.out.println("Stack is:");
                int i;
                for(i=0;i<=top;i++)
                {
                    System.out.print(arr[i]+"\t");
                }
                System.out.println("");
            }

        }
        public static void main(String args[])
        {
            Scanner m = new Scanner(System.in);
            System.out.println("Enter the size of stack");
            n = m.nextInt();
            primitive_stack obj = new primitive_stack();
            obj.push();
            obj.display();
            obj.pop();
            obj.display();
        }
    }


