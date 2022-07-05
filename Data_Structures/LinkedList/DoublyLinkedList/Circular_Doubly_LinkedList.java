package LinkedList.DoublyLinkedList;

class Node_4
{
    String data;
    Node_4 next;
    Node_4 prev;
    public Node_4(String data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;

    }

}
class Circular_Double
{
    public Node_4 head,tail=null;
    public int size=0;
    public void insert(String data)
    {
        Node_4 nw=new Node_4(data);
        if(head==null)
        {
            head=tail=nw;
            head.next=head;
            head.prev=nw;
            size++;
            System.out.println("Element Inserted "+nw.data);
        }
        else
        {
            tail.next=nw;
            nw.prev=tail;
            nw.next=head;
            tail=nw;
            size++;
            System.out.println("Element Inserted "+nw.data);
        }
    }
    public void display()
    {
        Node_4 temp=head;
        int i=1;
        while(temp!=null && i<=size)
        {
            System.out.println(" "+temp.data);
            temp=temp.next;
            i++;
        }
    }


}
public class Circular_Doubly_LinkedList {
    public static void main(String [] args)
    {
        Circular_Double cl=new Circular_Double();
        cl.insert("Naveen");
        cl.insert("Kumar");
        cl.insert("Rathish");
        cl.insert("Kumar");
        cl.display();

    }
}
