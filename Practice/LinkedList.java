public class LinkedList
{
    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=null;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=null;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        ll.addLast(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.print();
    }
}