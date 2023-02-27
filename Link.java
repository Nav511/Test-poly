import java.util.List;

class Link {
    Node head ;
    private int size;

    Link(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next= null;
            size++;
        }
    }
    // add -  first, last
   public void addfirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head== null){
            head= newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;


    }

    //print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " * ");
            currNode= currNode.next;

        }
        System.out.println("Null");

    }

    // delete first
    public void deleteFirst(){
        if(head== null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head== null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getsize(){
        return size;
    }

    public static void main(String[] args) {
        Link obj = new Link();
        obj.addfirst("a");
        obj.addfirst("is");
        obj.printList();

        obj.addLast("list");
        obj.printList();

        obj.addfirst("this");
        obj.printList();
        obj.deleteFirst();
        obj.printList();

        obj.deleteLast();
        obj.printList();

        System.out.println(obj.getsize());
        obj.addfirst("this ");
        System.out.println(obj.getsize());





    }
}
