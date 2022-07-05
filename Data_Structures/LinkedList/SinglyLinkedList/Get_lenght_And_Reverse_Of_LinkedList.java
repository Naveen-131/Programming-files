package LinkedList.SinglyLinkedList;

class Node_3
{
    int data;
    Node_3 next;
    public Node_3(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linked_List_3
{
    public Node_3 head=null;
    Node_3 tail=null;
    public int size=0;

    public void insert(int data)
    {
        Node_3 nw=new Node_3(data);
        if(head==null && size==0)
        {
            head=nw;
            tail=nw;
            size++;
            System.out.println("Element Inserted"+data);
        }
        else
        {
            tail.next=nw;
            tail=nw;
            size++;
            System.out.println("Element Inserted"+data);
        }
    }
    public void get_length()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node_3 temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            System.out.println("Size of the list: "+count);
        }

    }
    public void reverse()
    {
        Node_3 prev_node,current_node,next_node;
        prev_node=null;
        current_node=next_node=head;
        while(next_node!=null)
        {
            next_node=next_node.next;
            current_node.next=prev_node;
            prev_node=current_node;
            current_node=next_node;
        }
        head=prev_node;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node_3 temp=head;
            while(temp.next!=null)
            {
                System.out.println(" "+temp.data);
                temp=temp.next;
            }
            System.out.println(" "+temp.data);
        }
    }
}
public class Get_lenght_And_Reverse_Of_LinkedList {
    public static void main(String []args)
    {
        Linked_List_3 li=new Linked_List_3();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insert(40);
        li.insert(50);
        li.get_length();
        li.display();
        System.out.println();
        li.reverse();
        System.out.println("Reversed List");
        li.display();


    }


}
