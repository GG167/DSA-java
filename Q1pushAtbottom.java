import java.util.*;
class Q1pushAtbottom
{
    public static void push(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        else
        {
            int top=s.pop();
            push(s,data);
            s.push(top);
        }
    }
    public static void main(String a[])
    {
        Stack<Integer> s=new Stack<>();

        s.push(3);
        s.push(2);
        s.push(1);

        push(s,4);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}