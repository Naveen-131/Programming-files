package Stack;


import java.util.*;

class Stack1{

    int top=-1;
    int len=5;
    int arr[]=new int[5];

    public void push(Scanner in)
    {
        if(top==len-1)
        {
            System.out.println("Overflow: Stack is Full");
        }
        else
        {
            top++;
            System.out.println("enter the number");
            int x=in.nextInt();
            arr[top]=x;
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow");

        }
        else
        {
            int item=arr[top];
            top--;
            System.out.println("Printing the Popped Element:"+item);
        }

    }
    public void peek() {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Top most Element: "+arr[top]);
        }
    }
    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }



}


public class Stack_Impl_using_array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        Stack1 s=new Stack1();
        System.out.println("Stack Implementaion Using Array");
        int ch=0;
        while(ch!=5)
        {
            System.out.println("Enter the Choice:\n1.Push \n2.Pop\n3.Peek\n4.Display \n5.Exit");
            ch=obj.nextInt();
            switch( ch)
            {
                case 1:
                {
                    s.push(obj);
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:
                {
                    s.peek();
                    break;
                }
                case 4:
                {
                    s.display();
                    break;
                }

                default:
                    System.out.println("Enter valid Choice");

            }
        }

    }
}

