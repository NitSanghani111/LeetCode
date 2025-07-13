class MyLinkedList {
    Node head;
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {
        head =null;
    }
    
    public int get(int index) {
        Node cur = head;
        int count =0;
        while(cur != null){
            if(count++ == index){
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }
    
    public void addAtTail(int val) {
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return;
        }
        Node cur =  head;
        while(cur.next !=null){
            cur=cur.next;
        }
        cur.next = newnode;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index ==0){
            addAtHead(val);
            return;
        }
        else{
            Node cur = head;
            int count =0;
            while(cur!=null){
                if(count+1 == index){
                    Node newnode = new Node(val);
                    newnode.next = cur.next;
                    cur.next = newnode;
                    return ;

                }
                count ++; 
                cur = cur.next;
            }
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index ==0 && head != null){
            head = head.next;
            return;
        }
        int count =0;
        Node current = head;
       while (current != null) {
    if (count == index - 1) {
        if (current.next == null) {
            // Trying to delete past end: invalid
            return;
        }
        current.next = current.next.next;
        return;
    }
    count++;
    current = current.next;
}
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */