package ex03;

public class TransactionsLinkedList implements TransactionsList {



    private class Node{
        public Node         next;
        public Node         prev;
        public Transaction  data;

        private Node(){}
        public Node(Transaction data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node content;
    private int len;


    public TransactionsLinkedList()
    {
        len = 0;
        content =null;
    }

    @Override
    public boolean add(Transaction u) {
        Node ins = new Node(u);
        if (content == null)
            content = ins;
        else
        {
            ins.next = content;
            content.prev = ins;
            content = ins;
        }
        len++;
        return true;
    }

    @Override
    public Transaction get(int index) {
        if (index < 0 || index >= len)
            throw new IndexOutOfBoundsException();
        Node p = content;
        while (index-- != 0)
            p = p.next;
        return p.data;
    }

    @Override
    public Transaction get_by_id(String uid) {
        Node p = content;
        while (p != null)
        {
            if (p.data.getIdentifier().equals(uid))
                return p.data;
            p = p.next;
        }
        throw new TransactionNotFoundException();
    }

    @Override
    public void remove_by_id(String uid) {
        Node p = content;
        while (p != null)
        {
            if (p.data.getIdentifier().equals(uid))
            {
                if(p.prev != null)
                    p.prev.next = p.next;
                if(p.next != null)
                    p.next.prev = p.prev;
                p.prev = null;
                p.next = null;
                len--;
                return;
            }
            p = p.next;
        }
        throw new TransactionNotFoundException();
    }

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean empty() {
        return len == 0;
    }

    @Override
    public Transaction[] toArray() {
        Transaction [] res  = new Transaction[len];
        Node p = content;
        int i = 0;
        while (p != null)
        {
            res[i] = p.data;
            p = p.next;
            i++;
        }
        return res;
    }
}
