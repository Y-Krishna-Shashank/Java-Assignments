
public class SListIterator {
    SList head;
    public SListIterator(){
        this.head=null;
    }
    public SListIterator(SList node)
    {
        this.head=node;
    }

    public void add(SList node) {
        SList temp =head;
        if (head == null) {
            head =  node;
            return;
        }
        while(temp.next!=null)
            temp=temp.next;
        temp.next=node;
    }
    public void remove(SList node)
    {
        SList prev = new SList();
        prev.next=head;
        SList next = head.next;
        SList temp = head;


        if(head.data==node.data)
        {
            head=head.next;
        }
        if(head==null)
        {
            System.out.println("The list is empty to be removed");
            return;
        }
        else{
            while(temp.next!=null)
            {
                if(String.valueOf(temp.data).equals(String.valueOf(node.data)))
                {
                    prev.next=next;
                    break;
                }

                prev=temp;
                temp=temp.next;
                next=temp.next;
            }
        }
    }

    public void display()
    {
        SList temp = head;
        System.out.println("The values are: ");
        while(temp.next!=null)
        {
            System.out.println(String.valueOf(temp.data));
            temp=temp.next;
        }
        System.out.println(String.valueOf(temp.data));
    }
}
