public class SList<Type> {
    Type data;
    SList<Type> next;
SList(){
    next=null;
}

    SList(Type data)
    {
        this.data=data;
        this.next=null;
    }
    public SListIterator iterator(){
        return new SListIterator(next);
    }
    public String toString(){
        return data+"";
    }
}
