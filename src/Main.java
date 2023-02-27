
class  Node
{
    int coeff;
    int degree;
    Node next;

    Node(int c, int d) {
        coeff = c;
        degree = d;

    }
}
class LinkedList
{
    Node head = null , tail = null ;
    void insertAtLast( int c , int d)
    {
        Node n = new Node(c, d);
        if ( head == null )
        {
            head = tail = n ;
        }
        else
        {
            tail.next = n ;
            tail = n ;


        }
    }
    void polyAdd (LinkedList a, LinkedList b){
        Node temp1 = a.head , temp2 = b.head ;
        if (temp1 != null && temp2 != null)
        {
            while (temp1 != null)
            {
                temp2 = b.head;
                while (temp2 != null)
                {
                    if(temp1.degree == temp2.degree)
                    {
                        System.out.println("for degree =" + temp1.degree + " Sum is :" + (temp1.coeff + temp2.coeff));
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }

    }

}
public class Main {

    public static void main(String[] args) {
        LinkedList ll1 , ll2 ;
        ll1 = new LinkedList();
        ll2  = new LinkedList();

        ll1.insertAtLast(12,2);
        ll1.insertAtLast(4,1);
        ll1.insertAtLast(5,0);

        ll2.insertAtLast(72,1);
        ll2.insertAtLast(16,0);
        ll2.insertAtLast(7,2);

        ll1.polyAdd(ll1,ll2);
    }
}


