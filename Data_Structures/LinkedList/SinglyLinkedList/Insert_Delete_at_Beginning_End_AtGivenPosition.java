package LinkedList.SinglyLinkedList;



import java.util.Scanner;

class Node_2{
    int data;
    Node_2 next;
    public Node_2(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linked_List_2
{
    public Node_2 head=null;
    Node_2 tail=null;
    public int size=0;
    public void insert(int data)
    {
        Node_2 nw=new Node_2(data);
        if(head==null && size==0)
        {
            head=nw;
            tail=nw;
            size++;
        }
        else
        {
            tail.next=nw;
            tail=nw;
            size++;

        }
    }
    public void insert_Beginning(int data)
    {
        Node_2 nw=new Node_2(data);
        if(head==null && size==0)
        {
            head=nw;
            tail=nw;
            size++;
        }
        else
        {
            nw.next=head;
            head=nw;
            size++;
            System.out.println("Data Inserted at beginning: "+nw.data);
        }
    }
    public void insert_End(int data)
    {
        Node_2 nw=new Node_2(data);
        if(head==null)
        {
            head=nw;
            tail=nw;
            size++;
        }
        else
        {
            tail.next=nw;
            tail=nw;
            nw=tail;
            System.out.println("Data Inserted at the End is: "+nw.data);
            size++;
        }
    }
    public void insert_At_Position(Scanner obj)
    {
        System.out.println("Enter the position you have to insert the element");
        int pos=obj.nextInt();
        if(pos>size)
        {
            System.out.println("out of Boundary");
        }
        else
        {
            int i=1;
            System.out.println("Enter the data to add");
            int data=obj.nextInt();
            Node_2 nw=new Node_2(data);
            Node_2 temp=head;
            while(i<pos)
            {
                temp=temp.next;
                i++;
            }
            nw.next=temp.next;
            temp.next=nw;
            size++;
            System.out.println("Element added at the index "+pos);

        }

    }
    public void delete_At_Beginning()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            if(head!=tail)
            {
                head=head.next;
                System.out.println("element Deleted at front");
                size--;
            }
            else
            {
                head=tail=null;
                System.out.println("Element Deleted at front");
                size--;
            }
        }
    }
    public void delete_At_End()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else if(head.next==null)
        {
            head=null;
            tail=null;
            size--;
            System.out.println("Element deleted at last");
        }
        else
        {
            Node_2 prev=head;
            Node_2 temp=head;
            while(prev.next!=null)
            {
                temp=prev;
                prev=prev.next;
            }
            temp.next=null;
            tail=temp;
            size--;
            System.out.println("Element deleted at last");

        }
    }
    public void delete_At_Position(Scanner obj)
    {
        System.out.println("Enter the position");
        int pos=obj.nextInt();
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else if(size==1)
        {
            head=tail=null;
            size--;
            System.out.println("Element Deleted");
        }
        else if(pos==1)
        {
            head=head.next;
            size--;
            System.out.println("Element Deleted ");
        }
        else
        {
            int i=1;
            Node_2 nxt;
            Node_2 temp=head;
            while(i<pos-1)
            {
                temp=temp.next;
                i++;
            }
            nxt=temp.next;
            temp.next=nxt.next;
            size--;
            System.out.println("Element deleted at given position"+pos);
        }


    }
    public void get_size()
    {
        System.out.println("Size of the list =:"+size);
    }
    public void display()
    {
        Node_2 temp=head;
        while (temp.next!=null)
        {
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.print(" "+temp.data);
    }
}
public class Insert_Delete_at_Beginning_End_AtGivenPosition {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);

        Linked_List_2 li=new Linked_List_2();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        System.out.println();
        li.display();
        System.out.println();
        li.insert_Beginning(5);
        li.insert_Beginning(1);
        System.out.println();
        li.display();
        System.out.println();
        li.insert_End(40);
        li.insert_End(50);
        System.out.println();
        li.display();
        System.out.println();
        li.insert_At_Position(obj);
        li.insert_At_Position(obj);
        System.out.println();
        li.display();
        System.out.println();
        li.delete_At_Beginning();
        System.out.println();
        li.display();
        System.out.println();
        li.delete_At_End();
        System.out.println();
        li.display();
        System.out.println();
        li.delete_At_Position(obj);
        System.out.println();
        li.display();
    }
}
