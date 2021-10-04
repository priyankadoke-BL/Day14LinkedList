package LinkedList;

public class SinglyLinkedList<E> {

    class Node{
                    E data;
                    Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
                             }

            }

            public Node head = null;
            public Node tail = null;

            public void addNode(E data) {

                       Node newNode = new Node(data);



                         if(head == null) {
                             head = newNode;
                             tail = newNode;
                          }

                       else {


            tail.next = newNode;

            tail = newNode;
        }
    }

    //it will display all the nodes present in the list

    public void display() {

                Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {

            //It will print each node by incrementing pointer

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SinglyLinkedList sList = new SinglyLinkedList();

        //Add nodes to the list
        sList.addNode(56);
        sList.addNode(30);
        sList.addNode(70);


        sList.display();



    }
}
