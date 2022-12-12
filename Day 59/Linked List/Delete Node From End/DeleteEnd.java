/*Topic: Delete Nodes From the end.
sample:
Original List: 
23 34 45 56 67
Updated List:
23 34 45 56
Updated List:
23 34 45
Updated List:
23 34
Updated List:
23
Updated List:
List is empty
*/
public class DeleteEnd {  
  
    //Represent a node of the singly linked list  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
    }  
  
    //deleteFromEnd() will delete a node from end of the list  
    public void deleteFromEnd() {  
  
        //Checks if the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks whether the list contains only one element  
            if(head != tail ) {  
                Node current = head;  
                //Loop through the list till the second last element such that current.next is pointing to tail  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                //Second last element will become new tail of the list  
                tail = current;  
                tail.next = null;  
            }  
            //If the list contains only one element  
            //Then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  
  
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        DeleteEnd sList = new DeleteEnd();  
  
        //Adds data to the list  
        sList.addNode(23);  
        sList.addNode(34);  
        sList.addNode(45);  
        sList.addNode(56);
        sList.addNode(67); 
        sList.addNode(78);  


  
        //Printing original list  
        System.out.println("Original List: ");  
        sList.display();  
  
        while(sList.head != null) {  
            sList.deleteFromEnd();  
            //Printing updated list  
            System.out.println("Updated List: ");  
            sList.display();  
        }  
    }  
}  
