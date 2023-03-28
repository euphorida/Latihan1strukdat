public class Link {
    Node head;

    public void add(int data){
        if (head == null){
            head = new Node(data);
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
    public void showData(){
        if (head == null){
            System.out.println("Linklist is Empty");
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
            int data = current.data;
            System.out.println(data);
        }
    }
}
